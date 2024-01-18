package com.example.helloworld;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
        String first_name = "Jimi";
        String last_name = "Hendrix";

        String empty_name = "";
        System.out.println(first_name + " " + last_name);

        int num;
        num = 5;
        int new_num = 6;
        int num_1 = 5, num_2 = 6;
        System.out.println(num_1 + "," + num_2);

        double fraction = 3.5675;
        System.out.println(fraction);

        //constants
        final double PERCENTAGE = 0.23;
        //PERCENTAGE = 0.33;
        System.out.println(PERCENTAGE);
        boolean bool;
        bool = true;
        bool = false;

        System.out.println(bool);

        char letter = 'A';
        System.out.println(letter);
        char Unicode_A = 65;
        System.out.println(Unicode_A);

        char Unicode_B = 66;
        System.out.println(Unicode_B);

        // + - / * %
        // % or modulus gives us the remainder

        int result;
        result = num_2 % num_1;
        System.out.println(result);

        //Integer Division
        int number_1 = 5;
        int number_2 = 6;

        int ratio;
        ratio = number_1 / number_2;
        System.out.println(ratio);

        /* This code will not work.  Why?
        int number_3 = 5.0;
        int number_4 = 6.0;

        int ratio_2;
        ratio_2 = number_3 / number_4;
        System.out.println(ratio_2);
        */

        int value_1 = 10;
        int value_2 = 5;
        //This is the same as  value_2 = value_2 + value_1;
        value_2 += value_1;
        System.out.println(value_2);

        //cast operator
        String my_value = "77";
        int account = 89;
        int spending = 0;
        spending = account + Integer.parseInt(my_value);
        System.out.println(spending);


        double money = 88.65;
        int convert = (int)Math.round(money);
        int wallet = 100;
        int money_left;
        money_left = wallet - convert;
        System.out.println("the double converted to an integer is: " + convert);
        System.out.println(money_left);

        //get input from the user

        //First, declare a data type to hold the user's input
        int users_number;
        // Then, create a class type variable named keyboard.  Keyboard holds the memory address
        // of the Scanner object
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a number on the screen: ");
        users_number = keyboard.nextInt();
        System.out.println(users_number + 6);

        //always close the keyboard in order to avoid a memory leaks
        keyboard.close();

        //nextLine() is used to get a string

        //Dialog Boxes
        JOptionPane.showMessageDialog(null, "Hello Ian");
        last_name = JOptionPane.showInputDialog(null, "What is your last name? ");

        JOptionPane.showMessageDialog(null, "Welcome Ian " + last_name);

        System.exit(0);
    }
}
