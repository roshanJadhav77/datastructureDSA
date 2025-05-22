package com.datastructure.datastructureDSA.interviewCoding;


import java.math.BigDecimal;
import java.time.LocalDate;

// record 5 -> id, instrumentId, date, value; input of list of transaction , find largest transaction
// record by trasaction value for every unique given by list  inout 10 , max
public class TransationDemo {

    String id;
    String instrument;
    LocalDate date;
    BigDecimal value;

    public TransationDemo(String id, String instrument, LocalDate date, BigDecimal value) {
        this.id = id;
        this.instrument = instrument;
        this.date = date;
        this.value = value;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getInstrument() {
        return instrument;
    }

    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "TransationDemo{" +
                "id='" + id + '\'' +
                ", instrument='" + instrument + '\'' +
                ", date=" + date +
                ", value=" + value +
                '}';
    }


}
