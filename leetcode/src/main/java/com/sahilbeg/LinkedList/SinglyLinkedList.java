package com.sahilbeg.LinkedList;

public class SinglyLinkedList<T> {
    Node<T> head;
    int size;

    void LinkedList() {
        this.head = null;
        this.size = 0;
    }

    // Method to display the Linked List
    public void display() {
        Node<T> curr = this.head;
        while (curr.next != null) {
            System.out.print(String.format("%s -> ", curr.data));
            curr = curr.next;
        }
        System.out.print(String.format("%s\n", curr.data));
    }

    // Method to insert a node at the begining
    public void insert(T data) {
        Node<T> temp = new Node<T>(data);
        if (this.size == 0) {
            this.head = temp;
        } else {
            temp.next = this.head;
            this.head = temp;
        }
        this.size++;
    }

    // Method to insert a node at the End
    public void append(T data) {
        Node<T> temp = new Node<T>(data);
        Node<T> currentNode = this.head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = temp;
        this.size++;
    }

    // Method to add a node at a position
    public void update(T data, int pos) {
        Node<T> temp = new Node<T>(data);
        Node<T> currentNode = this.head;
        int position = 1;
        while (position < pos - 1) {
            currentNode = currentNode.next;
            position++;
        }
        temp.next = currentNode.next;
        currentNode.next = temp;
        this.size++;
    }

    // Method to delete from the start
    public void delete() {
        if (this.size < 2) {
            System.out.println("There is no list to delete!!");
        } else {
            this.head = this.head.next;
        }
    }

    // Method to delete from the end
    public void pop() {
        if (this.head == null) {
            System.out.println("There is no list to delete!!");
            return;
        }
        if (this.head.next == null) {
            this.head = null;
            this.size--;
            return;
        }
        Node<T> currentNode = this.head;
        while (currentNode.next.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = null;
        this.size--;
    }

    // Method to add a node at a position
    public void remove(int pos) {
        Node<T> currentNode = this.head;
        int position = 1;
        while (position < pos - 1) {
            currentNode = currentNode.next;
            position++;
        }
        currentNode.next = currentNode.next.next;
        this.size--;
    }

    // Method to reverse a linkedlist
    public void reverseList() {
        Node<T> previous = null;
        Node<T> currentNode = this.head;
        Node<T> next;

        if (this.size == 0 || this.size == 1) {
            System.out.println(this.head.data);
        }

        while (currentNode != null) {
            next = currentNode.next;
            currentNode.next = previous;
            previous = currentNode;
            currentNode = next;
        }
        this.head = previous;
    }

    // Method to check if the Linked list has a cycle or not
    public void hasCycle() {
        if (this.head == null) {
            System.out.println("No Cycle in the linked list");
        } else {
            Node<T> slow = head;
            Node<T> fast = head;

            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;

                if (slow == fast) {
                    System.out.println("Cycle is present in the linked list");
                    return; // Exit the method when a cycle is detected
                }
            }

            System.out.println("No Cycle in the linked list");
        }
    }

    // Method to create a cycle

    public void makeCycle() {
        if (this.head == null) {
            System.out.println("Can not make the list cycle");
        }
        Node<T> current = head;
        while (current.next != null) {
            current = current.next;
        }

        if (current.next == null) {
            current.next = head;
        }

    }

    //Method to find where the cycle is linked
    public Node<T> detectCycle() {
        if (this.head == null) {
            return null;
        } else {
            Node<T> slow = head;
            Node<T> fast = head;
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
    
                if (slow == fast) {
                    slow = head;
                    while (slow != fast) {
                        slow = slow.next;
                        fast = fast.next;
                    }
                    return slow;
                }
            }
    
            return null;
        }
    }
}
