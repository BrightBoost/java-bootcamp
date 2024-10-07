package com.pluralsight.week3;

public class Loops {
    public static void main(String[] args) {
        // while
        int i = 0;
        while(i < 10) {
            System.out.println(i++);
        }

        // for
        for(int j = 0; j < 10; j++) {
            System.out.println(j);
        }

        // foreach
        int[] arr = {1, 3, 5, 7, 9};
        for(int element: arr) {
            System.out.println(element);
        }

        String str = "Hello world";
        for(byte c: str.getBytes()) {
            System.out.print(c);
        }
        System.out.println();


        // do while
        int k = 0;
        do {
            System.out.println(k);
            k++;
        } while(k < 10);

        // break
        int test = 0;
        while(test < 10) {
            System.out.println(test++);
            if(test == 5) {
                break;
            }
        }
        System.out.println("Here");

        // continue
        int test2 = 0;
        while(test2 < 10) {
            test2++; // test2 = test2 + 1;
            if(test2 % 2 == 0) {
                continue;
            }
            System.out.println(test2);
        }


    }
}
