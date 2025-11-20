/**
    * Module 13: Introduction to Regular Expressions
    * This module covers the basics of regular expressions in Java.
    * It includes examples of pattern matching, searching, and replacing text using regex.
 **/

/* List of Regex Methods
 *
 * Method                 Description
 * matches()              Checks if the entire string matches the regex pattern
 * find()                 Searches for occurrences of the regex pattern within the string
 * replaceAll()           Replaces all occurrences of the regex pattern with a specified replacement string
 * split()                Splits the string into an array based on the regex pattern
 * group()                Returns the matched substring from the last regex operation
 * start()                Returns the starting index of the last matched substring
 * end()                  Returns the ending index of the last matched substring
 *
 */


/* List of the different Regex Symbols
 *
 * Symbol      Description
 * .           Matches any single character except newline
 * \d          Matches any digit (0-9)
 * \D          Matches any non-digit character
 * \w          Matches any word character (alphanumeric + underscore)
 * \W          Matches any non-word character
 * \s          Matches any whitespace character (spaces, tabs, line breaks)
 * \S          Matches any non-whitespace character
 * ^           Matches the start of a string
 * $           Matches the end of a string
 * *           Matches zero or more occurrences of the preceding element
 * +           Matches one or more occurrences of the preceding element
 * ?           Matches zero or one occurrence of the preceding element
 * {n}         Matches exactly n occurrences of the preceding element
 * {n,}        Matches n or more occurrences of the preceding element
 * {n,m}       Matches between n and m occurrences of the preceding element
 * []          Defines a character class to match any one of the enclosed characters
 * |           Acts as a logical OR between expressions
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import java.util.Scanner;

public class Module13 {

    public static  void main(String[] args){

        //regexDemo();
        //regexReplaceDemo();
        //validatePhoneNumber();
        //getUserEmail();
        getUserPassword();
    }

    // Ask user for their email address
    public static void getUserEmail() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your email address:");
        String email = scanner.nextLine();
        if (isValidEmail(email)) {
            System.out.println("Email is valid.");
        } else {
            System.out.println("Email is invalid.");
        }
        scanner.close();
    }

    // Ask user for their password
    public static void getUserPassword() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your password:");
        String password = scanner.nextLine();
        if (isValidPassword(password)) {
            System.out.println("Password is valid.");
        } else {
            System.out.println("Password is invalid.");
        }
        scanner.close();
    }

    // Method to demonstrate basic regex operations
    public static void regexDemo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to search for digits:");
        String input = scanner.nextLine();
        String regex = "\\d+"; // Regex pattern to match one or more digits. The double backslash is used to escape
                               // the backslash in Java strings.The d represents any digit, and + means one or
                               // more occurrences.
        // the matches() method checks if the entire input string matches the regex pattern.
        if (input.matches(".*" + regex + ".*")) { // The .* before and after the regex allows for any characters
                                                        // before or after the digits.
            System.out.println("The input contains digits.");
        } else {
            System.out.println("The input does not contain digits.");
        }
        scanner.close();
    }

    // This method demonstrates replacing text using regex
    public static void regexReplaceDemo() {
        String input = "The rain in Spain stays mainly in the plain.";
        String regex = "ain"; // Regex pattern to match the substring "ain"
        String replacement = "XXX"; // Replacement string
        // The replaceAll() method replaces all occurrences of the regex pattern in the input string
        // with the replacement string.
        String result = input.replaceAll(regex, replacement);

        System.out.println("Original String: " + input);
        System.out.println("Modified String: " + result);
    }

    // Get user'phone number and validate it
    public static void validatePhoneNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a phone number in the format (123) 456-7890:");
        String phoneNumber = scanner.nextLine();
        if (isValidPhoneNumber(phoneNumber)) {
            System.out.println("Valid phone number.");
        } else {
            System.out.println("Invalid phone number.");
        }
        scanner.close();
    }

    // Phone number validation method
    public static boolean isValidPhoneNumber(String phoneNumber) {
        // Regex pattern to match phone numbers in the format (123) 456-7890
        String regex = "^\\(*\\d{3}\\)*[ -]*\\d{3}[-.]+\\d{4}$"; // how do we accomodate both a space and no space
        return phoneNumber.matches(regex);

    }

    // Validate email address method
    public static boolean isValidEmail(String email) {
        // Regex pattern to match a basic email format
        String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";  //.edu, .mil, .gov, .com, .org, .net, .io
        //String regex = "^[0-9]+\\.[0-9]+\\.[0-9]+\\.[0-9]\\.$";
        return email.matches(regex);
    }

    // Password validation method
    public static boolean isValidPassword(String password) {
        // Regex pattern to ensure password has at least 8 characters, one uppercase letter,
        // one lowercase letter, one digit, and one special character
        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$"; // Ba9!dManaJama99
        return password.matches(regex);
    }



}
