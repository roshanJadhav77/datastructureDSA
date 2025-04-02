package com.datastructure.datastructureDSA.interviewToday;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collectors;

public class MainTransaction {
    public static void main(String[] args) {

        List<TransationDemo> list = Arrays.asList(
                new TransationDemo("T1", "Infosys", LocalDate.of(2025, 1, 1), new BigDecimal("100")),
                new TransationDemo("T11", "Infosys", LocalDate.of(2025, 1, 1), new BigDecimal("120")),
                new TransationDemo("T111", "Infosys", LocalDate.of(2025, 1, 1), new BigDecimal("140")),
                new TransationDemo("T2", "Wipro", LocalDate.of(2025, 1, 2), new BigDecimal("200")),
                new TransationDemo("T22", "Wipro", LocalDate.of(2025, 1, 2), new BigDecimal("220")),
                new TransationDemo("T222", "Wipro", LocalDate.of(2025, 1, 2), new BigDecimal("240")),
                new TransationDemo("T3", "TCS", LocalDate.of(2025, 1, 3), new BigDecimal("300")),
                new TransationDemo("T33", "TCS", LocalDate.of(2025, 1, 3), new BigDecimal("320")),
                new TransationDemo("T333", "TCS", LocalDate.of(2025, 1, 3), new BigDecimal("340"))

        );

        /*Map<String, TransationDemo> collect = list.parallelStream()
                .collect(Collectors.toMap(
                transactionCom -> transactionCom.instrument + "|" + transactionCom.getDate(),
                trax -> trax,
                (existing, replacment) -> existing.getValue().compareTo(replacment.getValue()) > 0 ? existing : replacment));

        collect.forEach((instrument, transaction) ->
        System.out.println("Instrument: "+ instrument +" transaction: "+transaction));

*/
        Map<String, List<TransationDemo>> groupBytransaction = list.stream()
                .collect(Collectors.groupingBy(t -> t.getInstrument() + "|" + t.getDate()));

        ConcurrentHashMap<String, TransationDemo> concurrentHashMap = new ConcurrentHashMap<>();

        ConcurrentMap<String, TransationDemo> maxTransaction = groupBytransaction.entrySet().parallelStream()
                .map(entry -> {
                    String key = entry.getKey();
                    TransationDemo transationDemo = entry.getValue().stream().max(
                            Comparator.comparing(TransationDemo::getValue)
                    ).orElse(null);

                    return Map.entry(key, transationDemo);

                })

                .collect(Collectors.toConcurrentMap(Map.Entry::getKey, Map.Entry::getValue));

        maxTransaction.forEach((key, trax) ->
                System.out.println("Instrument-Date: "+key.replace("|"," | ") +" -> "+ trax));

    }

}
