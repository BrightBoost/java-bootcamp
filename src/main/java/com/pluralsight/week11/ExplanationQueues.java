package com.pluralsight.week11;

import java.util.LinkedList;
import java.util.Queue;

public class ExplanationQueues {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(3);
        queue.add(5);
        queue.add(7);

        System.out.println(queue);

        System.out.println(queue.peek());

        System.out.println(queue);

        System.out.println(queue.poll());
        System.out.println(queue);


    }
}
