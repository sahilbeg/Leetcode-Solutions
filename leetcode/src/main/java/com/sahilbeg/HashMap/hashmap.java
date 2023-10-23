package com.sahilbeg.HashMap;
import java.util.*;
public class hashmap {
    public static void main(String[] args) {
        //Creating a hashMap
        HashMap<String, Integer>  map = new HashMap<>();

        //adding elements into the Hashmap

        map.put("IND", 4);
        map.put("NZ",4);
        map.put("SA", 3);
        map.put("AUS",2);
        map.put("IND", 4);

        //Displaying the HashMap
        System.out.println("My HashMap:- "+map);

        //Iterator in Hashmap with entry set
        for(Map.Entry<String, Integer> e : map.entrySet()){
            System.out.println("Key:- "+e.getKey());
            System.out.println("Value:- "+e.getValue());
        }

        //Iterator in Hashmap with key set
        Set<String> keys = map.keySet();
        for(String key : keys){
            System.out.println(key+" : "+map.get(key));
        }

        //Adding duplicate keys with diff value
        map.put("IND", 5);

        //Displaying the HashMap
        System.out.println("My HashMap:- "+map);

        //Searching in map
        if(map.containsKey("IND")){
            System.out.println("IND is present in the map");
        }else{
            System.out.println("IND is not present in the map");
        }

        //Get the value of the key in the map
        System.out.println(map.get("IND")); //Getting IND key value
        System.out.println(map.get("NZ")); //Getting IND key value


        //Remove a pair in map
        map.remove("SA");

        //Displaying the HashMap
        System.out.println("My HashMap:- "+map);


    }
}
