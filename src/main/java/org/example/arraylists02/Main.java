package org.example.arraylists02;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("List part- Methods");
        // SKIP FOR NOW AND GO TO 32
        String fruitOne = "Kiwi"; // Declaring and initializing a variable that holds a String
        String fruitTwo = "Damasco"; // Declaring and initializing a variable that holds a String
        String fruitThree = "Conde"; // Declaring and initializing a variable that holds a String

        // Example of common methods
        ArrayList<String> myFruitBasket = genList(fruitOne, fruitTwo, fruitThree); // Calling the method that returns an ArrayList of Strings
        // and storing its return value into a variable called myFruitBasket, which is also of type ArrayList holding Strings
        System.out.println(myFruitBasket); // Printing the data stored in that variable, no need for helper classes.
        System.out.println(myFruitBasket.size()); // Check how many elements are inside the ArrayList
        System.out.println(myFruitBasket.indexOf("Kiwi")); // Looking for a particular index
        System.out.println(myFruitBasket.remove("Conde")); // Removing an element (also works with index)
        System.out.println(myFruitBasket.contains("Conde")); // Checking if target is included in the list
        System.out.println(myFruitBasket.get(1)); // Gives me the content of index 1
        System.out.println(myFruitBasket.set(0, "Strawberry")); // Replaces index 0 with this new value
        System.out.println(myFruitBasket);
        System.out.println(myFruitBasket.removeAll(List.of("Avocados", "Potatoes"))); // Removing in bulk, more than one item
        myFruitBasket.clear(); // Clearing the entire list, so now its empty
        System.out.println(myFruitBasket); // THE END

    }

    // Creating a method that returns an arraylist that will hold elements of type String
    // This method takes 3 parameters of type String
    // It generates an ArrayList of Strings and add the arguments as elements in it
    // Then it adds a fourth element, hard coded, BUT it adds it to index of 0 rather than at the end, as is the default
    private static ArrayList<String> genList(String fruit1, String fruit2, String fruit3){
        ArrayList<String> myFruitBasket = new ArrayList<>(); // Creating a variable of type ArrayList that will hold String elements
        myFruitBasket.add(fruit1); // Adding the first received argument to the end of the list
        myFruitBasket.add(fruit2); // Adding the second received argument to the end of the list
        myFruitBasket.add(fruit3); // Adding the third received arument to the end of the list
        myFruitBasket.add(0, "Blackberry"); // Adding a hard coded value, at index 0 instead of end of the list

        return myFruitBasket; // Method must return an ArrayList of Strings, therefore, here it is: GO TO MAIN
    };


}
