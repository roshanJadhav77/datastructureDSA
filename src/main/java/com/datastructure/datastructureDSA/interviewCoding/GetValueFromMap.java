package com.datastructure.datastructureDSA.interviewCoding;

import java.util.HashMap;
import java.util.Map;

public class GetValueFromMap {

    public static void main(String args[]) {

        Map<String,Object> map1 = new HashMap<>();
        Map<String, Object> map2 = new HashMap<>();
        Map<String, Object> map3 = new HashMap<>();

        map1.put("A", "a");
        map1.put("B", map2);
        map1.put("C", 1);

        map2.put("A", "a");
        map2.put("B", map3);
        map2.put("C", 1);

        map3.put("A", "a");
        map3.put("B", "b");
        map3.put("C", 1);


        Object result = resolveValue(map1,"B");
        System.out.println("Result: "+result );


    }

    public static Object resolveValue(Map<String,Object> map, String key){

        Object value = map.get(key);

        if(value instanceof Map){
            return resolveValue((Map<String, Object>) value, key);
        }

        return value;

    }
}
