/*
    * Module 7: Java Arrays and the ArrayList Class
    *
    *
 */

import java.util.ArrayList;

// Creating an array of integers with 10 elements
public class Module7 {

    public static void main(String[] args) {
        //int[] result = {10, 100, 90, 80, 44, 55, 11, 3, 7, 16};

        //createArrays();  // Remember, if the createArrays method is not static, you will need to create an instance of
        // the class to call the method.
        //appendElement();
        //orderingArrays();
        //accessingElements();
        //findIndex();
        //findIndexInString();
        //twoDimensionalArray();
        sendArrayToMethod();

        // We have to do this because the findIndexInString2() method is NOT static.
        /*
        Module7 array = new Module7();
        array.findIndexInString2();

        System.out.println("\nThe index of the letter r in the array is: " + array.findIndexInString2());

        result = returnArray();
        for (int i = 0; i < result.length; i++) {
            System.out.println("\nElement " + i + ", in the returnArray has a value of:  " + result[i]);
        }
        areArraysEqual();
        arrayList();
*/
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

        char[] newCharArray = {'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd', '!',}; // This is another way to create an array

        // We can use loops to fill the array with values
        int[] myNewArray = new int[10];
        int j = 0;
        for (int i = 0; i < myNewArray.length; i++) {
            myNewArray[i] = j; // the [] is the operator that gives us the value at the index located at i. So,
            // the first time through the loop, i = 0, so myNewArray[0] = 0. The second time through the loop, i = 1,
            // so myNewArray[1] = 1, etc...
            j += 4;
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
        int testScores = 5;
        int[] myIntArray = new int[testScores];
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
        students[0] = 5;
        students[1] = -2;
        students[2] = 15;
        students[3] = 5;
        students[4] = -12;
        students[5] = 155;
        students[6] = 50;
        students[7] = -22;
        students[8] = -15;

        for(int i = 0; i < students.length; i++) {

            System.out.println("Student assisted CODE!!!!!!:"   + students[i]);
        }

        int[] people = {1, 2};
        System.out.println(people[1]);
        System.out.println(students[4]);

        students[4] = -122;
        System.out.println(students[4]);

    }

    // Finding the index location of an element
    public static void findIndex() {
        int[] myIntArray = new int[5];
        myIntArray[0] = 90;
        myIntArray[1] = 27;
        myIntArray[2] = 30;
        myIntArray[3] = 30;
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

    public Integer findIndexInString2(){
        String myString = "Hello World";
        return myString.indexOf('r');
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

        char[] myCharArray = new char[2];
        myCharArray[0] = 'T';

        System.out.println("\n\nSending the array to a method:");
        receiveArray(myIntArray, myDoubleArray, myStringArray,myCharArray); // we must pass the exact amount of
        // arguments that the method is expecting. If we
        // don't, we will get a compile-time error.

    }

    // this method receives multiple arrays as arguments.
    public static void receiveArray(int[] array, double[] array2, String[] array3, char[] array4) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " for each array being passed is: " + array[i] + ", " + array2[0]
                    + ", " + array3[0] + ", " + array4[0]);
        }
    }

    // how to return an array from a method
    public static int[] returnArray() {
        int[] myIntArray = new int[5];
        myIntArray[0] = 90;
        myIntArray[1] = 27;
        myIntArray[2] = 30;
        myIntArray[3] = 15;
        myIntArray[4] = 75;
        return myIntArray;
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

    // sorting an array of integers.  This requires the use of some algorithms, like bubble sort, selection sort,
    // insertion sort, bucket sort, etc...  Let's see how to do this using bubble sort, which is the simplest way to
    // sort an array but needs a swap method to work.

public static void bubbleSort(int[] array) {

        // {1, 0, 5, 2}
       // {0, 1, 5, 2}
        // {0, 1, 2, 5}


        int n = array.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (array[j - 1] > array[j]) {
                    // swap elements below. Remember my example using the three cups?
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    // Thankfully, we can use the sort method from the Arrays class in the java.util package to sort an array of integers.
    // which you will see below, in the ArrayList section.

    /*
    *                                           The ArrayList Class
    *
    * // This table should help you remember the methods that are used with the ArrayList class:
        // Method          | Description
        // add             | Adds an element to the ArrayList
        // remove          | Removes an element from the ArrayList
        // set            | Changes the value of an element in the ArrayList
        // get            | Returns the value of an element in the ArrayList
        // size           | Returns the number of elements in the ArrayList
        // indexOf        | Returns the index of the first occurrence of the element specified in the ArrayList
        // clear          | Removes all the elements from the ArrayList
        // isEmpty        | Returns true if the ArrayList is empty, otherwise returns false
        // contains       | Returns true if the ArrayList contains the element specified, otherwise returns false
        // toArray        | Returns an array containing all the elements in the ArrayList
        // addAll         | Adds all the elements in the ArrayList specified to the end of the ArrayList
        // removeAll      | Removes all the elements in the ArrayList specified from the ArrayList
        // retainAll      | Removes all the elements in the ArrayList that are not in the ArrayList specified
        // subList        | Returns a view of the portion of the ArrayList between the specified indexes
        // equals         | Returns true if the ArrayList is equal to the ArrayList specified, otherwise returns false
        // sort           | Sorts the elements in the ArrayList
        // hashCode       | Returns the hash code value for the ArrayList.  [This is not really covered in the book]
     */

    // using the ArrayList class to create a dynamic array
    public static void arrayList() {

        // Create a Header for the ArrayList section
          System.out.println("\n\n\t\tArrayList Class\n\n");


        ArrayList<String> myArrayList = new ArrayList<String>(); // This is actually an object. In fact, remember that
        // strings are objects in Java, not primitive data types.
        myArrayList.add("Hello"); // This is the first element in the ArrayList
        myArrayList.add("World"); // This is the second element in the ArrayList
        myArrayList.add("Java"); // This is the third element in the ArrayList
        myArrayList.add("Programming"); // This is the fourth element in the ArrayList
        myArrayList.add("Language"); // This is the fifth element in the ArrayList

        // We can use loops to fill the ArrayList with values
        for (int i = 0; i < 5; i++) {
            myArrayList.add("Element " + i);
        }

        // Now we can loop through the ArrayList and print out the values
        for (int i = 0; i < myArrayList.size(); i++) {
            System.out.println("Element " + i + ", value is " + myArrayList.get(i));
        }

        // We can also use the add method to add an element at a specific index
        myArrayList.add(2, "Java"); // This will add the element "Java" at index 2.  This will shift the
        // elements at index 2 and above to the right.

        // Now we can loop through the ArrayList and print out the values
        for (int i = 0; i < myArrayList.size(); i++) {
            System.out.println("Element " + i + ", value is " + myArrayList.get(i));
        }

        // We can use the remove method to remove an element from the ArrayList
        myArrayList.remove(2); // This will remove the element at index 2. This will shift the elements at index
        // 3 and above to the left.  For instance, if we remove the element at index 2, the element at index 3 will
        // move to index 2, the element at index 4 will move to index 3, etc...

        // Now we can loop through the ArrayList and print out the values
        for (int i = 0; i < myArrayList.size(); i++) {
            System.out.println("Element " + i + ", value is " + myArrayList.get(i));
        }

        // We can use the set method to change the value of an element in the ArrayList
        myArrayList.set(2, "Python"); // This will change the value of the element at index 2 to "Java"

        // Now we can loop through the ArrayList and print out the values
        for (int i = 0; i < myArrayList.size(); i++) {
            System.out.println("Element " + i + ", value is " + myArrayList.get(i));
        }

        // get the number of elements in the ArrayList
        System.out.println("The number of elements in the ArrayList is " + myArrayList.size()); // .size() is a method
        // that returns the number of elements in the ArrayList.

        // get the value of an element in the ArrayList
        System.out.println("The value of the element at index 2 is " + myArrayList.get(2)); // .get() is a method that
        // returns the value of the element at the index specified.

        // find the index of an element in the ArrayList
        System.out.println("The index of the element with the value of Java is " + myArrayList.indexOf("Java")); // .indexOf()
        // is a method that returns the index of the first occurrence of the element specified.

        // remove all the elements from the ArrayList
        myArrayList.clear();

        // check if the ArrayList is empty
        System.out.println("Is the ArrayList empty? " + myArrayList.isEmpty()); // I would place this in an if statement

        // check if the ArrayList contains an element
        System.out.println("Does the ArrayList contain the element Java? " +
                myArrayList.contains("Java")); // I would also place this in an if statement


        // create an array of type Integer using the ArrayList
        ArrayList<Integer> myArrayList2 = new ArrayList<Integer>(); // notice I do not need to set the size of the
        // ArrayList.  This is because the ArrayList is dynamic, so it will grow as needed.

        // add elements to the ArrayList
        myArrayList2.add(6);
        myArrayList2.add(-2);
        myArrayList2.add(5);
        myArrayList2.add(3);
        myArrayList2.add(7);

        // convert the ArrayList to an array
        Integer[] myArray = myArrayList2.toArray(new Integer[myArrayList2.size()]); // the toArray method returns an
        // array containing all the elements in the ArrayList.  An array is not an object. It is a data structure that
        // holds a fixed number of values of a single type.

        // now we can loop through the array and print out the values
        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Element " + i + ", value is " + myArray[i]);
        }

        // sort the elements in the ArrayList
        java.util.Collections.sort(myArrayList2);
        System.out.println("\n\nAfter sorting the ArrayList: " + myArrayList2); // the sort method from the Collections

        // loop through the ArrayList and print out the values
        for (int i = 0; i < myArrayList2.size(); i++) {
            System.out.println("Element " + i + ", value is " + myArrayList2.get(i));
        }


    }

}


