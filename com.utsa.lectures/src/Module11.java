/*
        Exceptions and Advanced File I/O

        Topics:
        Handling Exceptions
        Throwing Exceptions
        Binary Files, Random Access Files, and Object Serialization
        Common Errors to Avoid
 */

// Exception Classes: Throwable, Exception, and RuntimeException
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.io.*;

public class Module11 {

    public static void main(String[] args) throws IOException {

        // Handling Exceptions
        // try-catch block
        try {
            int[] arr = new int[5];
            System.out.println(arr[6]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds");
        }

        // Throwing Exceptions
        try {
            throw new Exception("This is an exception"); // throw keyword is used to throw an exception
        } catch (Exception e) { // catch block is used to catch the exception. Exception is the parent class of all exceptions
            System.out.println(e.getMessage());
        }

        // Handling an exception with a file that does not exist
        try {
            File file = new File("file.txt");
            Scanner sc = new Scanner(file);
        } catch (FileNotFoundException e) { // FileNotFoundException is a subclass of IOException
            System.out.println("File not found");
        }

        // some more types of exceptions:
        // ArithmeticException
        // NullPointerException
        // NumberFormatException
        // IOException
        // ClassNotFoundException
        // InterruptedException
        // IllegalArgumentException and more

        //Using Exception Handling with JOptionPane
        try {
            String input = JOptionPane.showInputDialog("Enter a number");
            int num = Integer.parseInt(input);
            JOptionPane.showMessageDialog(null, "You entered: " + num);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid input");
        }

        // using an exception inside a while loop
        boolean valid = false;
        while (!valid) {
            try {
                String input = JOptionPane.showInputDialog("Enter a number");
                int num = Integer.parseInt(input);
                JOptionPane.showMessageDialog(null, "You entered: " + num);
                valid = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid input");
            }
        }

        //the finally block
        try {
            int[] arr = new int[5];
            JOptionPane.showMessageDialog(null, arr[6]);
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Array index out of bounds");
        } finally { // finally block is executed regardless of whether an exception is thrown or not
            JOptionPane.showMessageDialog(null, "This is the finally block");
        }

        // Stack Trace
        // @exception ArrayIndexOutOfBoundsException Index 6 out of bounds for length 5
        try {
            int[] arr = new int[5];
            JOptionPane.showMessageDialog(null, arr[6]);
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Array index out of bounds");
            e.printStackTrace(); // prints the stack trace, which shows the sequence of method calls that led to the exception
            // FOr instance, Method A calls Method B, which calls Method C, which throws an exception.
        }

        // writing binary values to a file
        int[] numbers = {1, 2, 3, 4, 5};
        FileOutputStream fstream = new FileOutputStream("/users/burres/desktop/numbers.dat"); // FileOutputStream
        // is used to write binary data to a file
        DataOutputStream outputFile = new DataOutputStream(fstream); // DataOutputStream is used to write binary data
        // to a file
        for (int i = 0; i < numbers.length; i++) {
            outputFile.writeInt(numbers[i]);
        }
        outputFile.close();


        /*
                RANDOM ACCESS FILES, WE WILL DISCUSS THIS IN THE NEXT LECTURE
         */

        // The file pointer is a marker that indicates the current position in a file.
        // The file pointer is used to read and write data at a specific location in a file. This is a powerful feature
        // that allows you to read and write data at any location in a file.

        // random access files
        RandomAccessFile raf = new RandomAccessFile("/users/burres/desktop/numbers.dat", "rw");
        raf.seek(4); // moves the file pointer to the 5th byte in the file
        int num = raf.readInt(); // reads the integer at the current file pointer
        System.out.println(num);

        // file pointer is at the end of the file
        raf.seek(raf.length()); // moves the file pointer to the end of the file



        System.exit(0);





    }
}
