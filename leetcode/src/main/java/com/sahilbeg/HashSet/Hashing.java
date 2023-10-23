package com.sahilbeg.HashSet;
import java.util.HashSet; //importing the hashSet library
import java.util.Iterator;


public class Hashing {

    public static void main(String args[]){
        HashSet<Integer> set =  new HashSet<>(); // Creating a new hashSet in java

        //Adding into the HashSet
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);

        // find the size
        int size = set.size();
        System.out.println("Size of the Hashset:-  "+size);

        //Print all the elements of the HashSet
        System.out.println("My Hashset is:- "+set); 

        //Iterator loop to travell the hashset
        Iterator it = set.iterator();

        while(it.hasNext()){
            System.out.println("Element using iterator:- "+it.next()); 
        }
        // Searching values into hashSet
        if(set.contains(3)){
            System.out.println("Elemnet is present");
        }else{
            System.out.println("Does not contain the element");
        }

        //Deleting the elements from the list
        set.remove(3);

        // Searching values into hashSet
        if(set.contains(3)){
            System.out.println("Elemnet is present");
        }else{
            System.out.println("We deleted  the element");
        }
    }
}
