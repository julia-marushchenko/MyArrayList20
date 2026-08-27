/**
 *  Java program to create, modify and display ArrayList.
 */

package com.mycollections;

import java.util.ArrayList;
import java.util.List;

/**
 *  Main class.
 */
public class Main {

    // JVM entry point.
    public static void main(String[] args) {

        // Creating an ArrayList for storing genres of films.
        List<Integer> myList = new ArrayList<>();

        // Adding genres to myList.
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(1);

        // Display.
        System.out.println(myList); // Output: [2, 3, 4, 1]

        myList.remove(Integer.valueOf(2));

        // Display.
        System.out.println(myList); // Output: [3, 4, 1]

    }
}