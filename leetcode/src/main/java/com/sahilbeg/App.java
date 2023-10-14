package com.sahilbeg;
import com.sahilbeg.LinkedList.SinglyLinkedList;
import com.sahilbeg.LinkedList.Node;

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
        list.append(30);
        System.out.println("After reverse");
        list.display();
        list.hasCycle();
        list.makeCycle();
        list.hasCycle();
        
        Node<Integer> cycleStartNode = list.detectCycle();
        if (cycleStartNode != null) {
            System.out.println("Cycle detected, it starts at node with value: " + cycleStartNode.data);
        } else {
            System.out.println("No cycle detected.");
        }
    }
}
