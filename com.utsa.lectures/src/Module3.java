
/*
    Decision Structures
 */
import java.util.Scanner;
import javax.swing.JOptionPane;

// Note: get used to using comments to explain your code.  It will make it easier for you and other programmers
// to understand your code.
public class Module3 {

    public static void main(String[] args) {

        // if statement
        int x = 10; // declare and initialize variable x
        int y = 10; // declare and initialize variable y

        if (x < y) {  // evaluate the expression x < y.  If the expression is true, then execute the code in the
                      // body of the if statement.  If the expression is false, then skip the code in the body of the
                      // if statement. The body of the if statement is enclosed in curly braces.
            System.out.println("x is less than y");
        }

        // if-else statement
        if (x > y) {
            System.out.println("x is greater than y");
        }
        else {
            System.out.println("x is less than or equal to y");
        }

        // if-else-if statement.  Can have as many else if statements as needed. Usually more efficient than using
        // multiple if statements. Preferred over nested if statements.
        if (x > y) {
            System.out.println("x is greater than y");
        } else if (x < y) { // else if statement must come after the if statement and before the else statement
            System.out.println("x is less than y");
        } else { // else statement must come after the if statement and any else if statements
            System.out.println("x is equal to y");
        } // else statement is optional.  Also, only one else statement is allowed per if statement.

        // nested if s+tatement
        if (x > 0) {
            System.out.println("This is true so I execute");
            if (x < 10) {
                System.out.println("x is a positive single digit number.");
            } // can have as many nested if statements as needed, though the rule of thumb is to not have more than 3.
        }

        // switch statement
        int day = 4;
        switch (day) { // a switch statement is composed of a variable, the switch keyword, and a set of cases.
            case 1:
                System.out.println("Monday");
                break; // break is optional
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break; // break is optional
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break; // break is optional
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break; // break is optional
            default:
                System.out.println("Invalid day");
        }

        // switch statement with String
        String dayString = " ";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a day: ");
        dayString = scanner.nextLine();

        switch (dayString) {
            case "Monday":
                System.out.println("Monday");
                break; // break is optional
            case "Tuesday":
                System.out.println("Tuesday");
                break;
            case "Wednesday":
                System.out.println("Wednesday");
                break; // break is optional
            case "Thursday":
                System.out.println("Thursday");
                break;
            case "Friday":
                System.out.println("Friday");
                break; // break is optional
            case "Saturday":
                System.out.println("Saturday");
                break;
            case "Sunday":
                System.out.println("Sunday");
                break; // break is optional
            default:
        }

        // Boolean expressions
        // A Boolean expression is an expression that evaluates to a Boolean value, true or false.
        // Example: 3 < 4 is a Boolean expression.  It evaluates to true.
        // Example: 3 > 4 is a Boolean expression.  It evaluates to false.
        // Example: 3 == 4 is a Boolean expression.  It evaluates to false.
        boolean isRaining = true;
        boolean isSunny = false;

        // Remember truth tables from discrete math.  They are used to determine the truth value of a Boolean expression.
        // 0 && 0 = 0
        // 0 && 1 = 0
        // 1 && 0 = 0
        // 1 && 1 = 1
        // 0 || 0 = 0
        // 0 || 1 = 1
        // 1 || 0 = 1
        // 1 || 1 = 1
        // !0 = 1
        // !1 = 0



        // logical operators
        // && logical AND     Recall, the && operator is the short-circuit AND operator.
        // || logical OR      Recall, the || operator is the short-circuit OR operator.
        // ! logical NOT
        if (isRaining) {
            System.out.println("It is raining.");
        }
        else {
            System.out.println("It is not raining.");
        }

        if (!isSunny) {
            System.out.println("It is not sunny.");
        }
        else {
            System.out.println("It is sunny.");
        }

        if (isRaining && !isSunny) {
            System.out.println("It is raining and it is not sunny.");
        }
        else {
            System.out.println("It is not raining and it is sunny.");
        }

        // Relational operators
        // == equal to
        // != not equal to
        // > greater than
        // < less than
        // >= greater than or equal to
        // <= less than or equal to


        // Displaying formatted output with System.out.printf and String.format
        double num1 = 1.23556789; // Remember that double is a floating point number with 15 decimal
                                  // digits of precision.
        System.out.printf("num1 = %.2f\n", num1); // displays num1 with 2 decimal places. Takes the form of
                                                  // printf("format string", ArgumentList);

        int hours = 35;
        System.out.printf("I worked %d hours %f this week.\n", hours, num1); // displays hours as an integer.
                                                                    // %d is a format specifier for integers.
        String name = "John";
        System.out.printf("My name is %s.\n", name); // displays name as a string. %s is a format specifier for strings.

        // When displaying numbers with printf, you can use the following format specifiers:
        // %d - integer
        // %f - floating point number
        // %e - scientific notation
        // %c - character
        // %s - string
        // %b - boolean
        // %n - new line
        // %% - percent sign

        //0x0000CDFEEEEE    0 -9  A - F

        // The general syntax for writing a format specifier is %[flags][width][.precision]conversion-character
        // The width specifier specifies the minimum number of spaces to be written as output.

        // Code Listing 3-17.
        // Declare a variety of double variables.
        double num2 = 12345.6789;
        double num3 = 123456789.0;
        double num4 = 12.3456789;
        double num5 = 1.23456789;
        double num6 = 1234567.89;
        double num7 = 123456.789;

        // Display each variable with a width of 9 and 2 decimal places.
        System.out.printf("%9.2f\n", num2);
        System.out.printf("%9.2f\n", num3);
        System.out.printf("%9.2f\n", num4);
        System.out.printf("%9.2f\n", num5);
        System.out.printf("%9.2f\n", num6);
        System.out.printf("%9.2f\n", num7);

        double monthlyPay = 5000.0;
        double annualPay = monthlyPay * 12;
        String output = String.format("Your annual pay is $%,.2f", annualPay);

        JOptionPane.showMessageDialog(null, output); // the null argument centers the message
                                                                    // dialog box on the screen.
                                                                    // The output variable is the message to be displayed.

    // To ensure the floating point value does not use rounding when using the format specifier %.2f, use the BigDecimal
    // class or use floor or ceil methods from the Math class.
        double non_rounding = Math.floor(num2 * 1000) / 1000.0;
        System.out.printf("%.3f\n", non_rounding);  // This won't work with JOptionPane.showMessageDialog()




    // String comparisons
    // The equals method is used to compare the contents of two strings.
    // The compareTo method is used to compare the contents of two strings.
    // The compareToIgnoreCase method is used to compare the contents of two strings, ignoring case.
    // The startsWith method is used to determine if a string starts with a specified substring.
    // The endsWith method is used to determine if a string ends with a specified substring.
        // contains method is used to find a substring within a string.
    // The equalsIgnoreCase method is used to compare the contents of two strings, ignoring case.
    // The regionMatches method is used to compare a specified portion of one string with another string.
    // The indexOf method is used to determine the index of a specified substring within a string.
    // The lastIndexOf method is used to determine the last index of a specified substring within a string.
    // The substring method is used to extract a substring from a string.
    // The concat method is used to concatenate two strings.
    // The replace method is used to replace characters in a string.
    // The toLowerCase method is used to convert a string to lowercase.
    // The toUpperCase method is used to convert a string to uppercase.
    // The trim method is used to remove leading and trailing spaces from a string.
    // The split method is used to split a string into substrings.
    // The charAt() method is used to return the character at a specified index.
    // isUpperCase() method is used to determine if a character is uppercase.
    // isLowerCase() method is used to determine if a character is lowercase.

        //Example: The following code compares two strings using the equals method.
        String name1 = "John";
        String name2 = "John";
        if (name1.equals(name2)) {
            System.out.println("The names are the same.");
        }
        else {
            System.out.println("The names are not the same.");
        }
        //Example 2: The following code compares two strings using the compareTo method.
        String name3 = "John";
        String name4 = "John";
        if (name3.compareTo(name4) == 0) {
            System.out.println("The names are the same.");
        }
        else {
            System.out.println("The names are not the same.");
        }
        //Example 3: The following code compares two strings using the compareToIgnoreCase method.
        String name5 = "John";  // Note: the compareToIgnoreCase method ignores case.
        String name6 = "john";
        if (name5.compareToIgnoreCase(name6) == 0) {
            System.out.println("The names are the same.");
        }
        else {
            System.out.println("The names are not the same.");
        }

        //Example 4: The following code determines if a string starts with a specified substring.
        String name7 = "John";
        if (name7.startsWith("Jo")) {
            System.out.println("The name starts with Jo.");
        }
        else {
            System.out.println("The name does not start with Jo.");
        }

        if (name7.contains("oh")) {
            System.out.println("The name contains oh.");
        }
        else {
            System.out.println("The name does not contain oh.");
        }
        //Example 5: The following code determines if a string ends with a specified substring.
        String name8 = "John";
        if (name8.endsWith("hn")) {
            System.out.println("The name ends with hn.");
        }
        else {
            System.out.println("The name does not end with hn.");
        }

        // Example 6: The following code determines if a character is uppercase or lowercase.
        char letter = 'A';
        if (Character.isUpperCase(letter)) {
            System.out.println("The letter is uppercase.");
        }
        else {
            System.out.println("The letter is lowercase.");
        }

        // End of Module 3
        // Please read Chapter 3 in the textbook and attempt some of the challenges at the end of the chapter.

        // HINT:  You may need to use charAt() method to grab the index of the character in the JOptionPane showInputDialog,
        // which would be at index 0.  Remember, the charAt() method returns a character at a specified index.

    }
}
