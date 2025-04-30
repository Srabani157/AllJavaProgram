package com.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {

        public static void main(String[] args) {
            List<String> list = new ArrayList<>();
            list.add("apple");
            list.add("Banana");
            HashMap<String, List<String>> hm = new HashMap<>();
            hm.put("Fruit", list);

            List<String> list1 = new ArrayList<String>();
            list1.add("Orange");
            hm.put("New Fruit", list1);
            for(Map.Entry<String,List<String>> m : hm.entrySet()){
                System.out.println("***********Market*******"+  m.getKey() + m.getValue());
            }
        }
    }

