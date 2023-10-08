package com.sahilbeg;

import com.sahilbeg.LinkedList.SinglyLinkedList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        SinglyLinkedList<Student> list = new SinglyLinkedList<>();
        Student student1 = Student.builder()
                                  .rollno(1)
                                  .name("sakir")
                                  .age(27)
                                  .standard("XII")
                                  .section("D")
                                  .build();
        list.insert(student1);
        Student student2 = new Student(2,"sahil", 23, "X", "C");
        list.append(student2);
        list.display();
    }
}
