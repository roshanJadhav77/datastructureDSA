package com.datastructure.datastructureDSA.java.interview.coforge;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class FirstStartingPoint {
    public static void main(String[] args) {

   /* <String, String> routes = new HashMap<>();
        routes.put("Mumbai", "Delhi");
        routes.put("Bangalore", "Chennai");
        routes.put("Delhi", "Bangalore");
        routes.put("Chennai", "Kolkata");

        key source  and value dest

        1st starting point*/

        HashMap<String, String> routes = new HashMap<>();
        routes.put("Mumbai", "Delhi");
        routes.put("Bangalore", "Chennai");
        routes.put("Delhi", "Bangalore");
        routes.put("Chennai", "Kolkata");

        printRoot(routes);

    }

    public static void printRoot(Map<String, String> map){
        // all destination
        HashSet<String> dest = new HashSet<>(map.values());

        //starting city
        String start = null;
        for(String city : map.keySet()){
            if(!dest.contains(city)){
                start = city;
                break;
            }
        }

        //-->  bangalore
        //root
        while(map.containsKey(start)){
            String next = map.get(start);
            System.out.print(start+ "-->");
            start = next;
        }

        System.out.println(start);

    }
    //suggestion:
}
