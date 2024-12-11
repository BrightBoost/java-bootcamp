package com.pluralsight.week11;
import java.util.LinkedList;
import java.util.List;

public class ExplanationLinkedList {

    public static void main(String[] args) {
        // Create a LinkedList
        List<String> linkedList = new LinkedList<>();

        // Add elements
        linkedList.add("Blabla");
        linkedList.add("Lala");
        linkedList.add("Zia");

        // Display elements
        System.out.println("LinkedList: " + linkedList);

        // Add element at specific position
        linkedList.add(1, "Megatron");
        System.out.println("After adding Megatron: " + linkedList);

        // Remove an element
        linkedList.remove("Lala");
        System.out.println("After removing Lala: " + linkedList);

        // Access an element
        System.out.println("First element: " + linkedList.get(0));

        // Check size
        System.out.println("Size of list: " + linkedList.size());
    }
}
