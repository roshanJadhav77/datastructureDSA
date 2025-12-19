package com.datastructure.datastructureDSA.interviewCoding;

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
//Name Dept Score
//A Engineering 80
//B Engineering 96
//C HR 79
//D HR 91
//E Finance 91
//F Finance 91

/*output
        Engineering--96
        Finance--91
        HR--91*/


import java.util.*;
import java.util.stream.*;

class TopScorerFromDept {

    static class Student{
        String name;
        String dept;
        int score;

        Student(String name,String dept, int score ){
            this.name = name;
            this.dept = dept;
            this.score = score;
        }

        public String getName(){
            return name;
        }

        public String getDept(){
            return dept;
        }

        public int getScore(){
            return score;
        }

        @Override
        public String toString(){
            return name + " - " + dept + " - " + score;
        }
    }


        public static void main(String[] args) {
            System.out.println("Entry Level");
            List<Student> list = Arrays.asList(
                    new Student("A", "Engineering",80),
                    new Student("B", "Engineering",96),
                    new Student("C", "HR",79),
                    new Student("D", "HR",91),
                    new Student("E", "Finance",91),
                    new Student("F", "Finance",91)
            );

            Map<String, Integer> maxScore = list
                    .stream()
                    .collect(Collectors.groupingBy(
                            Student::getDept,
                            Collectors.collectingAndThen(
                                    Collectors.maxBy(Comparator.comparingInt(Student::getScore)),
                                    opt -> opt.get().getScore()
                            )
                    )
                    );

            //filter student whose score equals the max score of their department.
            list.stream()
                    .filter(e -> e.score == maxScore.get(e.dept))
                    .forEach(System.out::println);


           // topscores.values().forEach(e -> System.out.println(e.get()));
/*
            Map<String, Student> topScorer = list.stream()
                    .collect(Collectors.groupingBy(
                                    Student::getDept,
                                    Collectors.collectingAndThen(
                                            Collectors.maxBy(
                                                    Comparator.comparingInt(e -> e.getScore())
                                            ),
                                            Optional::get
                                    )
                            )
                    );

            Map<String, List<Student>> grouped = list.stream()
                    .collect(Collectors.groupingBy(Student::getDept));


            //System.out.println("group "+grouped.entrySet().stream().toList());


            //print 
            topScorer.forEach((dept,student) ->
                    System.out.println(dept + "--"+student.getScore() )
            );

            grouped.forEach((dept, student) -> {
                int mtop = student.stream()
                        .mapToInt(Student::getScore)
                        .max()
                        .getAsInt();
                List<Student> top = student.stream()
                        .filter(e -> e.getScore() == mtop)
                        .collect(Collectors.toList());

                System.out.println("\n Dept: " + dept);

                if(dept.equalsIgnoreCase("HR")){
                    System.out.println("Highest score: " +mtop);
                }

            });*/





        }
    }
