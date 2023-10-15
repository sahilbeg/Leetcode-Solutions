package com.sahilbeg;
import com.sahilbeg.LinkedList.SinglyLinkedList;
import com.sahilbeg.LinkedList.Node;

public class App
{
    public static void main( String[] args )
    {
        SinglyLinkedList<Integer> list1 = new SinglyLinkedList<>();
        list1.insert(10);
        list1.append(20);
        list1.insert(4);
        list1.append(5);

        System.out.println("Before reverse");
        list1.display();
        list1.reverseList();
        System.out.println("After reverse");
        list1.display();
        list1.hasCycle();
        list1.makeCycle();
        
        Node<Integer> cycleStartNode = list1.detectCycle();
        if (cycleStartNode != null) {
            System.out.println("Cycle detected, it starts at node with value: " + cycleStartNode.data);
        } else {
            System.out.println("No cycle detected.");
        }

        list1.detectCycle();

    }
}
