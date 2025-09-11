/*
    Module4
    For loops and File I/O
 */

import javax.swing.*;
import java.io.File; // new import statement for File class
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.FileReader;


public class Module4 {

    public static void main(String[] args) {
        // For loop, standard syntax: for (initialization; condition; increment/decrement)
        for (int i = 0; i < 5; ++i) { // notice the semicolon and initialization for our control variable, i
            System.out.println(i + i);
            System.out.println("i = " + i);

            // Nested for loop
            for (int j = 0; j < 15; j++) {
                System.out.println("j = " + j);
            } // In a nested for loop, the inner loop will run to completion for each iteration of the outer loop
            // For instance, i will be 0, and j will be 0, 1, 2, then i will be 1, and j will be 0, 1, 2, and so on.
            // This is useful for iterating through 2D arrays, or for creating a grid of elements. However, be careful
            // with nested loops, as they can be difficult to read and understand. Also, they can be slow if not used
            // properly.
        }

        // For-each loop, also known as an enhanced for loop
        int[] numbers = {1, 2, 3, 4, 5}; // an array of numbers in Java
        for (int number : numbers) { // for each number in numbers
            System.out.println("number = " + number);
        } // we will revisit arrays and collections in a later module

        // pre-increment vs post-increment
        int x = 0;
        System.out.println("x = " + x); // x = 0
        System.out.println("++x = " + ++x); // ++x = 1
        System.out.println("x = " + x); // x = 1
        System.out.println("x++ = " + x++); // x++ = 1
        System.out.println("x = " + x); // x = 2
        // The output of this code will be:
        // x = 0
        // ++x = 1 [This is because the pre-increment increments x before it is used.]
        // x = 1 [This is because x was incremented in the previous line.]
        // x++ = 1 [This is because the post-increment increments x after it is used, so it is still 1.]
        // x = 2 [This is because x was incremented in the previous line, so it's now 1 + 1 = 2.]
        // As you can see, the pre-increment increments x before it is used, while the post-increment increments x after it is used.
        // The difference between pre-increment and post-increment is when the increment occurs. Pre-increment will
        // increment the variable before it is used, while post-increment will increment the variable after it is used.
        // This can be useful in certain situations, but can also lead to confusion if not used properly.

        // while loop
        int y = 0;
        while (y < 5) {
            System.out.println("y = " + y);
            y++; // we need to increment y, otherwise the loop will run forever.
        } // The while loop will continue to run as long as the condition is true. If the condition is false, the loop
        // will not run at all. This can be useful for running a loop until a certain condition is met, or for running
        // a loop an unknown number of times.

        // while loop pre-increment vs post-increment
        int z = 0;
        while (z < 5) {
            System.out.println("z = " + z);
            ++z; // pre-increment
        } // The output will be the same as the previous while loop, but the pre-increment will increment z before it is
        // used, while the post-increment will increment z after it is used.

        // do-while loop
        int a = 0;
        do {
            System.out.println("a = " + a);
            a++;
        } while (a < 5); // The do-while loop is similar to the while loop, but the condition is checked after the loop
        // runs. This means that the loop will always run at least once, even if the condition is false. This can be

        // while true loop
        int b = 0;
        boolean h = true;
        // add start time here
        while (h) { // replace h with true and test that way.
            System.out.println("b = " + b);
            b++;
            if (b >= 5) {
                h = false;//break; // we need to break out of the loop, otherwise it will run forever
            }
        } // The while true loop will run forever, unless we use a break statement to exit the loop. This can be useful

        // continue statement
        for (int i = 0; i < 5; i++) {
            if (i == 2) {
                System.out.println("Hello World");
                continue; // skip the rest of the loop and go to the next iteration
                //System.out.println("This will not be printed");  // This will not be printed.  In fact, the compiler
                // will give an error if this line is uncommented, because it is unreachable code.
                //System.out.println("Hello World");  This will be unreachable
            }
            System.out.println("i = " + i);
        } // The continue statement will skip the rest of the loop and go to the next iteration. This can be useful for
        // skipping certain elements in a loop, or for skipping the rest of the loop if a certain condition is met.

        // break statement
        for (int i = 0; i < 5; i++) {
            if (i == 2) {
                break; // exit the loop. This will cause the loop to exit early, and the rest of the loop will not run.
            }
            System.out.println("i = " + i);
        } // The break statement will exit the loop. This can be useful for exiting a loop early if a certain condition
        // is met, or for exiting a loop if a certain error occurs.

        // You saw this already in the switch statement, but you can also use a labeled break statement to exit a loop

        inputValidation();  // simple function call to demonstrate input validation

        // sentinel value
        int sum = 0;
        int value;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a number (0 to quit): ");
            value = scanner.nextInt();
            if (value == 0) {
                break; // exit the loop if the value is 0
            }
            sum += value; // add the value to the sum when the value is not 0.
        }

        // generate a random number between 1 and 10
        int random = (int) (Math.random() * 10) + 1; // Math.random() returns a double between 0 and 1
        System.out.println("random = " + random);
        //Math.pow(2, 3); // 2^3 = 8
        //Math.sqrt(25); // square root of 25 = 5


        /*
            File I/O
            You can use the PrintWriter and FileWriter classes to write to a file, and the Scanner and FileReader classes
            to read from a file.
         */

        // PrintWriter and FileWriter and File classes
        // create a new file using PrintWriter and FileWriter
        String name = "Jeff";
        String age = "30"; // we can write any type of data to a file
        int height = 74; // we can write any type of data to a file. No need to convert to a string first.

        // If you do not include the try-catch block, you will get an error. This is because the FileWriter and PrintWriter
        // classes can throw an exception if the file does not exist, or if you do not have permission to write to the file.
        // So ignore the book in this case and include the try-catch block.
        try { // you will get an error if the file does not exist, or if you do not have permission to write to the file
            File fileWriter = new File("C:\\Users\\iburr\\OneDrive\\Desktop\\output.txt"); // using File class to create
            // a file object.  Notice the double backslashes in the file path.  This is because a single backslash is an escape
            // character in Java, so we need to use a double backslash to represent a single backslash in a file path.

            // using createNewFile() to create the file if it does not exist.  If the file already exists, it will not be
            // created again.  This is useful for preventing overwriting an existing file.
            if (fileWriter.createNewFile()) { // createNewFile() returns true if the file was created, false if it already exists
                System.out.println("File created: " + fileWriter);
            } else {
                System.out.println("File already exists.");
            }
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.println("Name: " + name);
            printWriter.println("Age: " + age);
            printWriter.println("Height: " + height); // we can write any type of data to a file
            printWriter.close(); // close the file. This is important, because it will flush the buffer and write the
            // data to the file. If you do not close the file, the data may not be written to the file. Open streams can
            // also cause memory leaks, so it is important to close them when you are done.
        } catch (Exception e) { // catch any exceptions that are thrown.  Exception e is a generic exception that can
            // catch any type of exception.
            System.out.println("Error: " + e.getMessage());
        }

        // open a file using Scanner and FileReader
        try {
            FileReader fileReader = new FileReader("C:\\Users\\iburr\\OneDrive\\Desktop\\output.txt");
            Scanner fileScanner = new Scanner(fileReader);
            while (fileScanner.hasNextLine()) {
                System.out.println(fileScanner.nextLine());
            }
            fileScanner.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        // open a file using the GUI - Remember, this is how we want to write our programs in this course.
        try {  // java.awt is a package that contains classes for creating GUIs. Desktop is a class that allows you to
            // open files using the default application for that file type.  In this case, we are opening a text file.
            // getDesktop() returns the desktop object, and open() opens the file.
            java.awt.Desktop.getDesktop().open(new java.io.File("C:\\users\\iburr\\OneDrive\\desktop\\output.txt"));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        // create a file using the GUI, write to the file, then open the file and its contents using the GUI.
        try {
            FileWriter fileWriter = new FileWriter("C:\\Users\\iburr\\OneDrive\\Desktop\\output2.txt");
            PrintWriter printWriter = new PrintWriter(fileWriter);
            String text = JOptionPane.showInputDialog(null, "Enter some text here: ");
            printWriter.println(text);
            printWriter.close();
            java.awt.Desktop.getDesktop().open(new java.io.File("C:\\Users\\iburr\\OneDrive\\Desktop\\output2.txt"));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        // create a file using the GUI and write multiple lines to the file
        try {
            FileWriter fileWriter = new FileWriter("C:\\Users\\iburr\\OneDrive\\Desktop\\output3.txt");
            PrintWriter printWriter = new PrintWriter(fileWriter);
            String text;
            do { // use a do-while loop to write multiple lines to the file, and allow at least one line to be written
                text = JOptionPane.showInputDialog(null, "Enter some text here (or press cancel to quit): ");
                if (text != null) { // if the user presses cancel, text will be null, so we need to check for that
                    printWriter.println(text);  // We could have used if text == null too.  For instance, if text == null{
                    // break;  // break out of the loop if the user presses cancel.  This is another way to do it.
                                    }
            } while (text != null); // null means the user pressed cancel. If the user did not press cancel, text will
            // not be null, so the loop will continue to run.
            printWriter.close();
            java.awt.Desktop.getDesktop().open(new java.io.File("C:\\Users\\iburr\\OneDrive\\Desktop\\output3.txt"));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage()); // e.getMessage() returns a string that describes the error
        }
        
        // writing formatted strings to a file
        try {
            FileWriter fileWriter = new FileWriter("C:\\Users\\iburr\\OneDrive\\Desktop\\output4.txt");
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.printf("Name: %s\n", name); // %s is a placeholder for a string. FileWriter cannot write formatted
            // strings, so we use PrintWriter to write formatted strings to a file.
            printWriter.printf("Age: %s\n", age); // %s is a placeholder for a string
            printWriter.printf("Height: %d\n", height); // %d is a placeholder for an integer
            printWriter.close();
            java.awt.Desktop.getDesktop().open(new java.io.File("C:\\Users\\iburr\\OneDrive\\Desktop\\output4.txt"));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }


        System.exit(0); // exit the program
    }

    // using the while loop for input validation.  We will revisit methods in a later module.
    public static void inputValidation() {
        java.util.Scanner scanner = new java.util.Scanner(System.in); // Notice I used the fully qualified name for the
        // Scanner class.  This is because I did not import the Scanner class at the top of the file.
        int number;
        while (true) {
            System.out.print("Enter a number between 1 and 10: ");
            number = scanner.nextInt();
            if (number >= 1 && number <= 10) {
                break; // exit the loop if the number is between 1 and 10
            }
            System.out.println("Invalid number. Please try again.");
        }
        System.out.println("You entered: " + number);
    }
}
