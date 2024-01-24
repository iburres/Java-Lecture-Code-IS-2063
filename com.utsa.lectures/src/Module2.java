// This is how we create a single-line comment
/*
   This is how we create a comment block
 */
// All imports should go here, which we refer to as the pre-processor section
// An import is package.class  For instance, javax.swing.JOptionPane.  javax.swing is the package
// and JOptionPane is the class

import javax.swing.JOptionPane;
import java.util.Scanner;
import java.io.*;   //Here we can import all classes associated with the java.io package

//A Java class should only have ONE public class, and it must be the same name as the .java file.
public class Module2 {

    //Class/static variable.  Remember scope
    static String first_name = "John";

    //instance variables
    public String school = "University of Texas at San Antonio";


    //Every project can only have one main method.
    public static void main(String[] args) {

        //Declaring a method variable / local variable
        int num;

        //initializing a method variable / local variable
        num = 6;

        //Simple print statements
        System.out.println("Hello " + first_name );
    }
}
