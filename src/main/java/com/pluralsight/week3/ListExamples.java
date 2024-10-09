package com.pluralsight.week3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListExamples {
    public static void main(String[] args) {
        List<String> groceries = new ArrayList<>();
        groceries.add("eggs");
        groceries.add("honey");
        groceries.add("bananas");
        System.out.println(groceries);
        System.out.println(groceries.get(2));

        List<Integer> favoriteNrs = new ArrayList<>();
        favoriteNrs.add(27);
        favoriteNrs.add(42);
        favoriteNrs.add(33);
        favoriteNrs.add(4);
        favoriteNrs.add(22);
        favoriteNrs.add(5);
        favoriteNrs.add(21);
        favoriteNrs.add(12);

        System.out.println(favoriteNrs.get(favoriteNrs.size() - 1));
        System.out.println(favoriteNrs);
        // updating a value
        favoriteNrs.set(6, 30);
        System.out.println(favoriteNrs);

        // delete a value
        favoriteNrs.remove(3); // by index
        // delete a value by value - weird in case of integers, because index is a int too
        favoriteNrs.remove(Integer.valueOf(30));

        // sort the numbers
        Collections.sort(favoriteNrs);
        System.out.println("sorted" + favoriteNrs);

        // for each loop for accessing the elements
        for(int i: favoriteNrs) {
            System.out.println(i);
        }

        // loop with regular for loop, that gives us access to the index
        // index necessary for setting
        for(int i = 0; i < favoriteNrs.size(); i++) {
            favoriteNrs.set(i, 30);
        }
        System.out.println(favoriteNrs);
        favoriteNrs.clear();
        System.out.println(favoriteNrs);



    }
}
