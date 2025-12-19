//package com.datastructure.datastructureDSA.interviewCoding;
//
//
//import com.datastructure.datastructureDSA.java.java8.Employee;
//
//import java.util.Comparator;
//import java.util.Optional;
//import java.util.stream.Collectors;
//
//// list of Empl - salary, dept and name
//// dept wise hjightest salary
//// suggestion :: prepare which already know.
//// Articlation - prepare a story before delivering , index - write keyword
//public class ACLExample {
//
//    public static void main(String[] args) {
//
//
//        //employess
//                .stream()
//                .collect(Collectors.groupingBy(
//                        Employee::getDeptId,
//                        Collectors.collectingAndThen(
//                                Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)),
//                                Optional::get
//                        )
//                ));
//
//    }
//
//}
