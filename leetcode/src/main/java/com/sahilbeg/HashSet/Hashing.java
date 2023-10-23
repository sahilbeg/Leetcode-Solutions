package com.sahilbeg.HashSet;
import java.util.HashSet; //importing the hashSet library

public class Hashing {

    public static void main(String args[]){
        HashSet<Integer> set =  new HashSet<>(); // Creating a new hashSet in java

        //Adding into the HashSet
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);

        // Searching values into hashSet
        if(set.contains(4)){
            System.out.println("Elemnet is present");
        }

        if(!set.contains(6)){
            System.out.println("Does not contain the element");
        }
    }
}
