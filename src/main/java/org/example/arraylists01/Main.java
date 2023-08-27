package org.example.arraylists01;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("ArrayLists");
        // Skip for now and go to 18
        ArrayList<Integer> myIntList = genArrList(); // Storing the return value of method into a variable of type Array
        //List that holds elements of type integer
        System.out.println(myIntList); // Printing my list, again, different from arrays, no need for helper class
        // The End
    }

    // Creating a method that will return an array list of integers
    // Type of the array list is: ArrayList<Integer>
    // Note: We are using the wrapper class: Integer (capital)
    // Im calling the method genArrList
    private static ArrayList<Integer> genArrList(){
        ArrayList<Integer> myIntList = new ArrayList<>(); // Creating an arrayList that will hold integers
        System.out.println(myIntList); // Empty array list, no need for helper classes to print to the console.
        myIntList.add(1); // Adding one
        myIntList.add(11); // pushing 11 (adding to the end of the list)
        myIntList.add(111); // adding 111 to the end of the list
        myIntList.add(1111); // You guessed it.
        return  myIntList; // The method must return an array list of integers, here it is. Go to MAIN
    };
}

