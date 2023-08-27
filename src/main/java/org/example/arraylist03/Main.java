package org.example.arraylist03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("List- Adding initial elements to ArrayLists");

        // SKIP FOR NOW AND GO TO 38

        ArrayList<String> myQuickList = genFaster(); // Storing the return value of calling genFaster() method inside a variable of type ArrayList
        // which holds elements of type String
        System.out.println(myQuickList); // Printing it without the need of helper classes
        System.out.println(myQuickList.size()); // Checking how many elements are in it
        System.out.println(myQuickList.indexOf("Potatoes")); // Looking for the index of a particular element
        System.out.println(myQuickList.remove("Onions")); // Removing an element (can also pass index as argument)
        System.out.println(myQuickList.contains("Onions")); // Checking if an element is present
        System.out.println(myQuickList.lastIndexOf("Avocados")); // Looking for the last occurrence of a target element
        System.out.println(myQuickList.get(0)); // Getting the value stored at index 0
        System.out.println(myQuickList.set(0, "Cilantro")); // Replacing the value storeda at index 0, with the new value Im passing
        System.out.println(myQuickList.removeAll(List.of("Avocados", "Potatoes"))); // Removing several items at once, again with the assistance of
        // List.of() and feeding the multiple arguments Im interested in removing
        System.out.println(myQuickList.addAll(List.of("Bell peppers", "Spinach"))); // Adding several items at once... does this mean we can add
        // elements from another ArrayList to this one????? ... Test/Brainstorm ... spoiler: yes.

        // QUICK KNOWLEDGE: SORTING ELEMENTS
        myQuickList.sort(Comparator.naturalOrder());
        System.out.println(myQuickList);

        myQuickList.sort(Comparator.reverseOrder());
        System.out.println(myQuickList);
        // the end.
    }

    // Creating a method that will return an ArrayList that will hold elements of type String
    // Instead of using the add method to insert initial values, (assuming you know them), we will tap into List class with the method 'of'
    private static ArrayList<String> genFaster(){
        System.out.println(List.of("test", "testing", "testing again")); // Observe this output

        return new ArrayList<String>(List.of("Tomatoes", "Potatoes", "Onions", "Avocados")); // Populating an ArrayList as soon as I create it,
        // By using the List.of() and hard coding the elements I want to be in it. More on this coming soon. Go to MAIN
    }
}
