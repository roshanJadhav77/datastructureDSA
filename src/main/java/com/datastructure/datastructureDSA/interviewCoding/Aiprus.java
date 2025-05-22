package com.datastructure.datastructureDSA.interviewCoding;

import java.util.ArrayList;
import java.util.List;

public class Aiprus {

    // list of string "roshan" "vishnu" "india"


    public static void main(String[] args) {
        //ArrayList<String> string = new ArrayList<>();
        //iterator


        // String is immutabel. that means string value once assigned can not be changed.
//        String original = "Roshan";
//        original.concat("Jadhav");
//        System.out.println(original);

        List<String> name = List.of("Roshan0", "Roshan1", "Roshan2", "Roshan3", "Roshan4", "Roshan5");

        ArrayList<String>  str = new ArrayList<>(name);

        for (String s :str){
            if("Roshan2".equals(s)){
                str.remove(s);
                System.out.println(s);
            }
        }

        str.forEach(s -> {
            if("Roshan4".equals(s)){
                str.remove(s);

            }
        });


        System.out.println(str);
        System.out.println(name);

    }
}
