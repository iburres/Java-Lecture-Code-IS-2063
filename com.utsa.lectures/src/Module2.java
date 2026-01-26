// This is how we create a single-line comment
/*
   This is how we create a comment block
 */

// All imports should go at the top of your program, just after your first
// block comment, which usually contains your name and the project name.
// We refer to this area as the pre-processor section
// An import is package.class  For instance, javax.swing.JOptionPane.  javax.swing is the package
// and JOptionPane is the class



import javax.swing.JOptionPane;
import java.util.Scanner;
import java.io.*;   //Here we can import all classes associated with the java.io package
import java.math.*;

// A Java class should only have ONE public class, and it must be the same name as the .java file.
public class Module2 {

    // Class / static variable.  Remember scope
    static String first_name = "Ian";  //You can change this to your name
    static String last_name;


    // instance variables.  Can be public or private
    public String school = " ";
    public String major = "Cyber Security";
    String year = "Freshman"; // default access modifier
    private int age = 18; // private access modifier

    //another method

    //Every project can only have one main method.
    public static void main(String[] args) {


        //character
        char letter;
        letter = 'c'; // stored sing the single quotation mark

        // Declaring a method variable / local variable
        int num;
        double squared;
        // initializing a method variable / local variable
        num = 6;

        // final and constants. Cannot be changed later on with the final keyword
        final double GRAVITY = 9.8;

        // Simple print statement. Notice that you cannot use the non-static instance variables
        // here
        System.out.println("Hello" + first_name);

        // The left side of the argument for pow() method is the number, the right is what power
        // we want to raise the number by.  2^3 below.
        squared = Math.pow(2.0, 3.0);
        System.out.println(squared);

        // Here we do some math inside the print statement
        double value = 9.0;
        System.out.println("The square root of " + value + " is: " + Math.sqrt(value));

        /*
                Input and Output
         */

        //Keyboard using the Scanner class
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter a number from 1-50: "); //print vs println
        // Now that we have created a new Scanner object, we can ask the user for either integers
        // or doubles or strings, etc... and store them into a primitive variable of the proper
        // data type
        int result = keyboard.nextInt();
        int total = 5;
        System.out.println("The two numbers added = " + (total + result));
                            // notice how + adds the integer values here with the ( ), but
                            // concatenates them without the ( ).

        //int result_2 = ((5 * 3)- 5 ) / 2;
        /*
                GUI's using the javax.swing package
         */

       //showMessageDialog is like the print statement, except it creates a GUI
        JOptionPane.showMessageDialog(null, "IS-2063 is the best " +
                "class ever!");

        //showInputDialog provides a message and an input field for the user
        last_name = JOptionPane.showInputDialog(null, "What is your last "
        + "name? ");

        // We can either use STDOUT print our the showMessageDialog for GUI's.
        System.out.println("Hello " + first_name + " " + last_name + ". " + "Welcome to IS-2063!");

        /*
                Conversions
         */

        String text_number;
        int new_num = 5;
        Scanner keyboard_2 = new Scanner(System.in);
        System.out.print("Enter a number, which we will treat as a character, not an int: ");
        text_number = keyboard_2.nextLine();
        System.out.println("The value you entered is actually the text symbol for: " + text_number);

        // If we wanted to add the number entered by the user, we would have to convert it to int
        int convert_text = Integer.parseInt(text_number);
        System.out.println("The converted text to int can now be added to new_num. The result is: " +
                (new_num + convert_text));
        keyboard.close();
        keyboard_2.close();

        /*
                Integer and Fractional Division
         */

        // Attempt this on your own at home.  Try dividing integers with doubles, int w/ int, and double
        // with double.

        System.exit(0);
    }

}
