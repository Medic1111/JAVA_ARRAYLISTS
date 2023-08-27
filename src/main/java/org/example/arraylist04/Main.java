package org.example.arraylist04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("TO DO LIST");
        // FOR A CHANGE, START HERE!!! lol
        Scanner scanner = new Scanner(System.in); //  Instantiating Scanner
        ArrayList<String> taskList = new ArrayList<>(); // Generating an empty ArrayList that will hold elements of the type String
        runProgram(taskList, scanner); //Closing the scanner right below this line. Now, Lets check runProgram method.
        scanner.close();
    }

    // RUN PROGRAM: VOID method that accepts 2 parameters: One is the ArrayList of string elements that we created in MAIN, the second is the
    // scanner we instantiated in MAIN.
    // Then it run an while loop that only ends (with a break statement) if it receives a value of 0 for an int stored in option, which is returned
    // by the displayOptions method. We will get there.
    // If we dont receive this 0 situation, we call a method called runSelection, and then print some stuff, including the content of the ArrayList
    // we received as argument.

    // Now lets finally check displayOptions, which we know returns an int.
    private static void runProgram(ArrayList<String> taskList, Scanner scanner){
        while (true){
            int option = displayOptions(scanner);
            if(option == 0){
                break;
            }
            runSelection(option,taskList,scanner);

            System.out.println();
            System.out.println("YOUR TASK LISK:");
            System.out.println(taskList);
            System.out.println();
        }
    }

    // DISPLAY OPTIONS: Method that accepts one argument, a scanner.
    // It returns an in after printing some options to the user, and getting the user input with the scanner
    // The user can return 0,1,2,3 otherwise we fall into a validation.
    // When one of the 4 expected values are entered, it gets returned.
    // Now that we know what displayOptions is, look again at runProgram to make sense of the while loop
    // Saw that? If not 0, we call runSelection and pass the int option, the ArrayList, and again the scanner
    // Now lets see runSelection method
    private static int displayOptions(Scanner scanner){

        System.out.println("What would you like to do?");
        System.out.println("[0]- Quit");
        System.out.println("[1]- Add Task");
        System.out.println("[2]- Remove Task");
        System.out.println("[3]- Clear List");

        while(!scanner.hasNextInt() ){
            System.out.println("Invalid Entry");
            scanner.nextLine();
        }

        return Integer.parseInt(scanner.nextLine());
    };

    // RUN SELECTION: Method that accepts an int (userinput we got previously), and ArrayList (the empty one we created in MAIN), and the scanner
    // it then runs a switch statement on the int option and for each option it will execute a method (unless, 0, for which we end the program
    // with our while loop)
    // We are also passing the variables those methods are requiring.
    // Lets see what happens if the user enter 1
    // Go to addToList method
    private static void runSelection(int option, ArrayList<String> taskList, Scanner scanner){
        switch (option){
            case 0:
                System.out.println("Bye");;
                break;
            case 1: addToList(taskList, scanner);
                break;
            case 2: removeFromList(taskList, scanner);
                break;
            case 3:clearList(taskList);
                break;
        }
    }

    // Method to add an Item to the list we created on Main
    // Method returns void and accepts the ArrayList for us to add to, and the scanner
    private static void addToList(ArrayList<String> arrToAdd, Scanner scanner){
        System.out.println("Enter tasks to add separated by commas: "); // Giving the user directions to add entries
        String newTasks = scanner.nextLine(); // Single string with tasks separated by comma
        ArrayList<String> newTasksArr = new ArrayList<>(List.of(newTasks.split(","))); // Creating and already initializing this
        //new that will hold the untreated elements we want to add. ArrayList with a List.of(Splitting the string by the comma)

        for(String task : newTasksArr){ // Looping through each element in the new ArrayList that holds the split elements
            if(!arrToAdd.contains(task.trim().toLowerCase())){ // Ensuring no duplicates
                arrToAdd.add(task.trim().toLowerCase()); // Adding each item, if already not present, in lowercase and trimmed
            } // Lets now check what happens if the user enter 2: Remove task
        }
    }

    // Method to remove an item from the list
    // Also accepts parameters scanner and the ArrayList we will manipulate
    // Returns void
    private static void removeFromList(ArrayList<String> arrToRemove, Scanner scanner){
        System.out.println("Enter tasks to add separated by commas: "); // Giving the user directions to add entries
        String newTasks = scanner.nextLine(); // Single string with tasks separated by comma
        ArrayList<String> newTasksArr = new ArrayList<>(List.of(newTasks.split(",")));// Creating and already initializing this
        //new that will hold the untreated elements we want to remove. ArrayList with a List.of(Splitting the string by the comma)

        for(String task : newTasksArr){ // Looping through each element in the new ArrayList that holds the split elements
                arrToRemove.remove(task.trim().toLowerCase()); //Removing that task after treating it for trim and lowercase
        } // Finally, lets see how our program is dealing with wiping the list off
    }

    // Method to clear the list
    // Accepts one parameter: The ArrayList to be cleared
    // It then simply calls the .clear() method on it
    // and its all done.
    private static void clearList(ArrayList<String> arrToRemove){
        arrToRemove.clear();
    }

    // The End.
}
