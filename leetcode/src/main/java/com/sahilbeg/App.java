package com.sahilbeg;
import com.sahilbeg.LinkedList.SinglyLinkedList;
public class App
{
    public static void main( String[] args )
    {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.insert(10);
        list.append(20);
        System.out.println("Before reverse");
        list.display();
        list.reverseList();
        System.out.println("After reverse");
        list.display();
        list.hasCycle();
        list.makeCycle();
        list.hasCycle();
    }
}
