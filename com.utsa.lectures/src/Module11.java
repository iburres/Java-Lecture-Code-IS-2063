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

    public static void main(String[] args) throws IOException{

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

        // multiple exceptions, Example 1
        try {
            int[] arr = new int[5];
            JOptionPane.showMessageDialog(null, arr[6]);
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Array index out of bounds");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "An exception occurred");
        }

        // multiple exceptions, Example 2
        try {
            int[] arr = new int[5];
            JOptionPane.showMessageDialog(null, arr[6]);
        } catch (ArrayIndexOutOfBoundsException|NullPointerException e) { // using the pipe operator to catch multiple exceptions
            JOptionPane.showMessageDialog(null, "Array index out of bounds");
        }

        // exception using with if statement and throw
        try {
            int num = 5;
            if (num < 10) {
                throw new Exception("Number is less than 10");
                //System.out.println("The number is less than 10");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

        int num_2 = 7;

        if(num_2 < 6){
            throw new ArithmeticException("Number is less than 6"); // explicitly throwing an exception.  No need to
            // use try-catch block, at least in this case. Also, we are not handling the exception here.  We are just
            // throwing it.

        }else{
            System.out.println("Number is greater than 6");
        }

        // SUMMING UP THE DIFFERENCE BETWEEN THROW, THROWS, AND TRY-CATCH
        // throw: used to throw an exception
        // throws: used to declare an exception
        // try-catch: used to handle an exception
        // Use try-catch when you want to handle exceptions immediately within the current block of code.
        // Use throws when you want to delegate the responsibility of handling exceptions to the calling method.
        // So, the bottom line is that throws will allow the calling function to handle the exception that the method throws.
        // and in turn, the calling function should have a try-catch block to handle the exception. Throw will
        // explicitly throw an exception, which either goes unhandled or is caught by a try-catch block.

        //the "finally" block
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

                Up to this point, all the files we have worked with have been sequential access files. This means that
                data is read and written sequentially from the beginning of the file to the end of the file. In contrast,
                random access files allow you to read and write data at any location in a file. This is done by moving the
                file pointer to a specific location in the file.

                Important Points:

                1. When writing strings to a binary file, we use the writeUTF method of the DataOutputStream class.
                This method writes a string to a file in UTF-8 format. UTF-8 is a character encoding that supports all
                characters in the Unicode character set. Unicode is a standard that defines a unique number for every
                character in every language and has about 143,813 characters. Unicode is updated regularly to include new
                characters and emojis. ASCII is a subset of Unicode and only supports 128 characters.

                2. When reading strings from a binary file, we use the readUTF method of the DataInputStream class.

                3. Appending data to a file is done by creating a new FileOutputStream object with the append parameter
                set to true.

                4. The file pointer is a marker that indicates the current position in a file. The file pointer is used
                to read and write data at a specific location in a file. This is a powerful feature that allows you to read
                and write data at any location in a file.
         */

        // The file pointer is a marker that indicates the current position in a file.
        // The file pointer is used to read and write data at a specific location in a file.

        // Look at page 739 of your textbook.  You will see a block diagram representing the indexes of a file
        // in sequential order and another block diagram representing the indexes of a file in random order.

        // random access files. We must use the RandomAccessFile class to work with random access files.
        RandomAccessFile raf = new RandomAccessFile("/users/burres/desktop/numbers.dat", "rw");
        raf.seek(4); // moves the file pointer to the 5th byte in the file
        int num = raf.readInt(); // reads the integer at the current file pointer
        System.out.println(num);

        // file pointer is at the end of the file
        raf.seek(raf.length()); // moves the file pointer to the end of the file

        // the file pointer advances by the number of bytes associated with the data type, which is 4 bytes for an integer.
        //for example: the file pointer will start at 0, then move to 4 (which is the 5th byte in the file), then move
        // to 8, then move to 12, and so on, if all the items in the file are integers.

        //LOOK AT PAGE 743 in the book for an example using the character data type.


        //NOTE ABOUT R and RW:
        // R: read-only mode
        // RW: read-write mode
        // If you open a file using read only, and it does not exist, an exception will be thrown.
        // If you open a file using read-write, and it does not exist, the file will be created.

        //writing data to a .bin file
        try {
            FileOutputStream fstream_2 = new FileOutputStream("/users/burres/desktop/numbers.bin");
            DataOutputStream outputFile_2 = new DataOutputStream(fstream_2);
            outputFile_2.writeInt(100);
            outputFile_2.writeDouble(3.14);
            outputFile_2.writeUTF("Hello"); // we should be able to see this with the strings tool.
            outputFile_2.close();
        } catch (IOException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }



        System.exit(0);





    }

    // method that throws multiple exceptions
    public static void multipleExceptions() throws ArrayIndexOutOfBoundsException, NullPointerException {
        int[] arr = new int[5];
        JOptionPane.showMessageDialog(null, arr[6]);
    }


    // file creation method
    public static void createFile() {
        File file = new File("file.txt");
        try {
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists");
            }
        } catch (IOException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}


/*

https://medium.com/@AlexanderObregon/java-exception-handling-throws-vs-try-catch-94b0abe1080d

            Code Example: Using throws
Consider a scenario where you’re implementing a method to read a configuration file:

public void readConfigFile(String fileName) throws FileNotFoundException, IOException {
    File configFile = new File(fileName);
    FileInputStream fileInputStream = new FileInputStream(configFile);
    // Assume further file reading and processing logic here
}

In this example, readConfigFile declares that it can throw both FileNotFoundException and IOException.
This means any caller of this method must handle these exceptions, typically using a try-catch block.
 */


/*

https://www.geeksforgeeks.org/throw-throws-java/

            import java.io.*;
import java.util.*;

public class GFG {

    public static void writeToFile() throws Exception
    {
        BufferedWriter bw = new BufferedWriter(
            new FileWriter("myFile.txt"));
        bw.write("Test");
        bw.close();
    }

    public static void main(String[] args)
    {
        try {
            writeToFile();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
 */
