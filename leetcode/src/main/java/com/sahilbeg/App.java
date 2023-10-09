package com.sahilbeg;

import javax.sound.sampled.LineEvent;

import com.sahilbeg.LinkedList.SinglyLinkedList;
public class App
{
    public static void main( String[] args )
    {
        SinglyLinkedList<Student> list = new SinglyLinkedList<>();
        Student student1 = Student.builder()
                                  .rollno(1)
                                  .name("Rob")
                                  .age(27)
                                  .standard("XII")
                                  .section("D")
                                  .build();
        list.insert(student1);
        Student student2 = new Student(2,"Alex", 23, "X", "C");
        list.append(student2);
        System.out.println("Before reverse");
        list.display();
        list.reverseList();
        System.out.println("After reverse");
        list.display();
    }
}
