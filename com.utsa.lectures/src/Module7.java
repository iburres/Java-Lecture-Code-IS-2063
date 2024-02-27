/*
    * Module 7: Java Arrays and the ArrayList Class
    *
    * For here on out we will be using the best practice suggestions I gave you in Module6B when writing your code.
 */

import java.util.ArrayList;

// Creating an array of integers with 10 elements
public class Module7 {

    public static void main(String[] args) {

        createArrays();  // Remember, if the createArrays method is not static, you will need to create an instance of
        // the class to call the method.
        appendElement();
        orderingArrays();
        accessingElements();
        findIndex();
        findIndexInString();
        twoDimensionalArray();
        sendArrayToMethod();
        areArraysEqual();

    }

    public static void createArrays() {
        int[] myIntArray = new int[10]; // This is an array of 10 integers
        myIntArray[0] = 1; // This is the first element in the array
        myIntArray[1] = 2; // This is the second element in the array, etc....

        double[] myDoubleArray = new double[10]; // This is an array of 10 doubles
        myDoubleArray[0] = 1.0; // This is the first element in the array
        myDoubleArray[1] = 2.0; // This is the second element in the array, etc....

        String[] myStringArray = new String[10]; // This is an array of 10 strings
        myStringArray[0] = "Hello"; // This is the first element in the array
        myStringArray[1] = "World"; // This is the second element in the array, etc....

        char[] myCharArray = new char[10]; // This is an array of 10 characters
        myCharArray[0] = 'H'; // This is the first element in the array
        myCharArray[1] = 'e'; // This is the second element in the array, etc....

        // We can use loops to fill the array with values
        int[] myNewArray = new int[10];
        for (int i = 0; i < myNewArray.length; i++) {
            myNewArray[i] = i; // the [] is the operator that gives us the value at the index located at i. So,
            // the first time through the loop, i = 0, so myNewArray[0] = 0. The second time through the loop, i = 1,
            // so myNewArray[1] = 1, etc...
        }
        // Now we can loop through the array and print out the values
        for (int i = 0; i < myNewArray.length; i++) {
            System.out.println("Element " + i + ", value is " + myNewArray[i]); // the first use of i in the println
            // statement is the value of i (0, 1, 2...), the second use of i is the value at the index of i in the array.
        }

        // Here is how we can add elements to an array of type double (can't add more than the size of the array)
        double[] myDoubleArray2 = new double[10];
        for (int i = 0; i < myDoubleArray2.length; i++) {
            myDoubleArray2[i] = i * 1.0;
        }

        // print out the values in the array
        for (int i = 0; i < myDoubleArray2.length; i++) {
            System.out.println("Element " + i + ", value is " + myDoubleArray2[i]);
        }
    }

    // Appending an element to an array
    public static void appendElement() {
        int[] myIntArray = new int[2];
        myIntArray[0] = 90;
        myIntArray[1] = 27;
            // In Java, arrays are fixed in size, so we cannot add elements to an array. Instead, we can create a new
            // array with a larger size and copy the elements from the original array to the new array, like this:
        int[] myNewArray = new int[3];
        for (int i = 0; i < myIntArray.length; i++) {
            myNewArray[i] = myIntArray[i];
        }
        myNewArray[2] = 30; // This is the new element we are adding to the array

        // Now we can loop through the new array and print out the values
        for (int i = 0; i < myNewArray.length; i++) {
            System.out.println("Element " + i + ", value is " + myNewArray[i]);
        }
    }

    public static void orderingArrays() {
        System.out.println("\n\nOrdering Arrays:");

        // We can use the sort method to order the elements in an array
        int[] myIntArray = new int[5];
        myIntArray[0] = 90;
        myIntArray[1] = 27;
        myIntArray[2] = 30;
        myIntArray[3] = 15;
        myIntArray[4] = 75;

        // Now we can loop through the array and print out the values
        for (int i = 0; i < myIntArray.length; i++) {
            System.out.println("Element " + i + ", value is " + myIntArray[i]);
        }

        // Now we can sort the array
        java.util.Arrays.sort(myIntArray); // Here we are using the sort method from the Arrays class in the java.util

        System.out.println("\nAfter sorting the array:");
        // Now we can loop through the array and print out the values
        for (int i = 0; i < myIntArray.length; i++) {
            System.out.println("Element " + i + ", value is " + myIntArray[i]);
        }
    }

    // You code with me:  How would we access the 5th element of an array with 11 elements?
    public static void accessingElements() {

        // You code with me:  How would we access the 5th element of an array with 11 elements?
        int[] students = new int[11];

    }

    // Finding the index location of an element
    public static void findIndex() {
        int[] myIntArray = new int[5];
        myIntArray[0] = 90;
        myIntArray[1] = 27;
        myIntArray[2] = 30;
        myIntArray[3] = 15;
        myIntArray[4] = 75;

        for (int i = 0; i < myIntArray.length; i++) {
            if (myIntArray[i] == 30) {
                System.out.println("The index of the element with the value of 30 is " + i);
            }
        }

        // We can also do this using the binarySearch method, which is part of the Arrays class in the java.util package
        // and is a more efficient way to search for an element in an array.
        int index = java.util.Arrays.binarySearch(myIntArray, 30);
        System.out.println("\nThe index of the element with the value of 30 is " + index);
    }

    // how to find the index of a character in a string:
    public static void findIndexInString() {
        String myString = "Hello World";
        int index = myString.indexOf('W'); // the indexOf method returns the index of the first occurrence of the character
        System.out.println("\nThe index of the character 'W' is " + index);
        System.out.println("\n");
    }

    // Assigning values to a two-dimensional array
    public static void twoDimensionalArray() {
        int[][] myArrayMatrix = new int[2][3]; // This is a two-dimensional array with 2 rows and 3 columns
        myArrayMatrix[0][0] = 1; // This is the first element in the array
        myArrayMatrix[0][1] = 2; // This is the second element in the array
        myArrayMatrix[0][2] = 3; // This is the third element in the array
        myArrayMatrix[1][0] = 4; // This is the fourth element in the array
        myArrayMatrix[1][1] = 5; // This is the fifth element in the array
        myArrayMatrix[1][2] = 6; // This is the sixth element in the array

        // You can determine the number of elements in a two-dimensional array by multiplying the number of rows by the
        // number of columns. In this case, 2 * 3 = 6, so there are 6 elements in the array.

        // We can use loops to fill the array with values as well, but we need to use a nested loop.
        int[][] myNewArrayMatrix = new int[2][3];
        for (int i = 0; i < myNewArrayMatrix.length; i++) {
            for (int j = 0; j < myNewArrayMatrix[i].length; j++) {
                myNewArrayMatrix[i][j] = i + j; // the [] is the operator that gives us the value at the index located
                // at i. So the first time through the loop, i = 0, j = 0, so myNewArrayMatrix[0][0] = 0. The second
                // time through the loop, i = 0, j = 1,so myNewArrayMatrix[0][1] = 1. The third time through the loop,
                // i = 0, j = 2, so myNewArrayMatrix[0][2] = 2.  Then we move back to the outer loop and i = 1, j = 0,
                // so myNewArrayMatrix[1][0] = 1, etc...
            }
        }

        // printing the two-dimensional array as a matrix
        for (int i = 0; i < myArrayMatrix.length; i++) {
            for (int j = 0; j < myArrayMatrix[i].length; j++) {
                System.out.println("Element [" + i + "][" + j + "] value is " + myArrayMatrix[i][j]);
            }
        }

        // passing an array as an argument to a method

    }

    public static void sendArrayToMethod() {
        int[] myIntArray = new int[5];
        myIntArray[0] = 90;
        myIntArray[1] = 27;
        myIntArray[2] = 30;
        myIntArray[3] = 15;
        myIntArray[4] = 75;

        double[] myDoubleArray = new double[1];
        myDoubleArray[0] = 1.0;

        String[] myStringArray = new String[1];
        myStringArray[0] = "This Array is being sent to a method.";

        char[] myCharArray = new char[1];
        myCharArray[0] = 'T';

        System.out.println("\n\nSending the array to a method:");
        receiveArray(myIntArray, myDoubleArray, myStringArray,myCharArray); // we must pass the exact amount of arguments that the method is expecting. If we
        // don't, we will get a compile-time error.

    }

    // this method receives multiple arrays as arguments.
    public static void receiveArray(int[] array, double[] array2, String[] array3, char[] array4) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " for each array being passed is: " + array[i] + ", " + array2[0]
                    + ", " + array3[0] + ", " + array4[0]);
        }
    }

    // determining if two arrays are equal. The book gives you a convoluted way to do this, but we can use the equals
    // method from the Arrays class in the java.util package to do the same thing.
    public static void areArraysEqual() {
        int[] myIntArray = new int[5];
        myIntArray[0] = 90;
        myIntArray[1] = 27;
        myIntArray[2] = 30;
        myIntArray[3] = 15;
        myIntArray[4] = 75;

        int[] myIntArray2 = new int[5];
        myIntArray2[0] = 90;
        myIntArray2[1] = 27;
        myIntArray2[2] = 30;
        myIntArray2[3] = 15;
        myIntArray2[4] = 75;

        boolean result = java.util.Arrays.equals(myIntArray, myIntArray2);
        System.out.println("\nAre the two arrays equal? " + result);
    }

    // On Thursday, we will cover the ArrayList class in more detail, which is a dynamic array that can grow in size
    // and is part of the java.util package.  We will also look at finding the sum of the elements in an array and
    // finding the highest and lowest values, as well as the average of the elements in an array. Finally,
    // we will look at returning arrays from methods and how to search for elements (including some of the
    // algorithms that are used to do this).
}


