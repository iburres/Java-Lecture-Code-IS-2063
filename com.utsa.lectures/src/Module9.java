/*

        Text Processing and More about Wrapper Classes

        Topics:
        Wrapper Classes
        - Autoboxing
        - Unboxing
        - Wrapper Class Methods
        - Number Class
        - Math Class
        - Random Class
        - Date Class
        - Calendar Class
        - compareTo Method
        - equals Method
        - toUpperCase Method (the opposite is toLowerCase)
        - trim Method
        - replace Method
        - split Method
        - substring Method
        - length Method
        - charAt Method
        - indexOf Method
        - lastIndexOf Method
        - startsWith Method
        - endsWith Method
        - concat Method
        - valueOf Method
        - toString Method
 */

public class Module9 {

    public static void main(String[] args) {

        wrapperClasses();
        characterClass();
        compareTo();
        equals();
        toUpperCase();
        trim();
        replace();
        split();
        substring();
        startsWith();
        endsWith();
        regionMatches();
        valueOf();
        indexOf();
        lastIndexOf();
        length();
        charAt();
        stringBuilderAndBuffer();


    }

    // Wrapper Classes  - an immutable class that wraps a primitive data type
    public static void wrapperClasses(){
        System.out.println("******  Wrapper Classes:  ******");
        // Wrapper Classes are used to convert primitive data types into objects
        // The eight primitive data types are byte, short, int, long, float, double, char, and boolean
        // The eight wrapper classes are Byte, Short, Integer, Long, Float, Double, Character, and Boolean

        // Autoboxing, converting a primitive data type into an object
        int i = 10;
        Integer iObj = Integer.valueOf(i); // converting int to Integer explicitly
        Integer iObj2 = i; // converting int to Integer implicitly
        System.out.println("iObj " + iObj + " is now the same as iObj2: " + iObj2);

        // Unboxing, converting an object to a primitive data type
        // Integer iObj3 = new Integer(10); Integer has been deprecated.
        // int i2 = iObj3.intValue(); // converting Integer to int explicitly
        // int i3 = iObj3; // converting Integer to int implicitly
    }

    // The Character Class - a wrapper class for the char data type, which is part of the java.lang package. No
    // need to import it.  Wrapper classes are best used with their static methods. It's much easier to just use a
    // primitive data type when you don't need to use the methods of a wrapper class.
    public static void characterClass(){
        System.out.println("\n  *******  Character Class Methods:  *******");

        // Character class methods
        char c = 'a';
        System.out.println(Character.isLetter(c)); // true
        System.out.println(Character.isDigit(c)); // false
        System.out.println(Character.isWhitespace(c)); // false
        System.out.println(Character.isUpperCase(c)); // false
        System.out.println(Character.isLowerCase(c)); // true
        System.out.println(Character.toUpperCase(c)); // A
        System.out.println(Character.toLowerCase(c)); // a

        char c1 = ' ';

        System.out.println(Character.isSpaceChar(c1)); // true
        System.out.println(Character.isWhitespace(c1)); // true
        // So what's the difference between isSpaceChar and isWhitespace? isSpaceChar returns true for all characters
        // that are considered to be space characters, including non-breaking spaces. isWhitespace returns true for
        // characters that are considered to be white space, including spaces, tabs, and line breaks.

        // Example of using Tab and isWhitespace
        char c3 = '\t';
        System.out.println(Character.isWhitespace(c3)); // true
        System.out.println(Character.isSpaceChar(c3)); // false

        // Example of non-breaking space and isSpaceChar
        char c4 = '\u00A0'; // non-breaking space, which is a space that doesn't break at the end of a line. The code
                            // for non-breaking space is \u00A0 in Unicode.  You could use this in HTML to keep words
                            // together on the same line.

        System.out.println("Is c4 True? " + Character.isSpaceChar(c4)); // true


        char c2 = '9';
        System.out.println(Character.isLetter(c2)); // false
        System.out.println(Character.isDigit(c2)); // true
        System.out.println(Character.isLetterOrDigit(c2)); // true
    }

    // compareTo Method, compares two strings lexicographically
    public static void compareTo(){
        System.out.println("\n   *******  compareTo Method:  *******");

        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = "World";

        System.out.println(s1.compareTo(s2)); // 0 because s1 and s2 are equal
        System.out.println(s1.compareTo(s3)); // -15 because s1 is less than s3, meaning "H" in Hello is 15 values
                                              // less than "W" in World when we look at ASCII values. H = 72, W = 87
        System.out.println(s3.compareTo(s1)); // 15, because s3 is greater than s1, meaning "W" in World is 15 values
                                              // greater than "H" in Hello when we look at ASCII values. W = 87, H = 72

        // Using the compareTo Method to compare two strings in an if statement
        if (s1.compareTo(s2) == 0){
            System.out.println("The strings are equal");
        } else {
            System.out.println("The strings are not equal");
        }
    }

    // equals Method, compares two strings
    public static void equals(){
        System.out.println("\n  ********  equals Method:  *********");

        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = "World";
        String s4 = "hello";

        System.out.println(s1.equals(s2)); // true
        System.out.println(s1.equals(s3)); // false
        System.out.println(s1.equals(s4)); // false, so it is case sensitive
    }

    // toUpperCase Method, converts a string to uppercase. The opposite is toLowerCase
    public static void toUpperCase(){
        System.out.println("\n  *******  toUpperCase Method: *********");

        String s1 = "hello";
        System.out.println(s1.toUpperCase()); // HELLO
    }

    // trim Method, removes white spaces from the beginning and end of a string
    public static void trim(){
        System.out.println("\n ******   trim Method:   *******");

        String s1 = "  Hello  ";
        System.out.println(s1.trim()); // Hello   This will remove the white spaces from the beginning and end

        String s2 = "  What gets trimmed here      99 ";
        System.out.println(s2.trim()); // What gets trimmed here is the white spaces from the beginning and end,
                                       // but not the white spaces in the middle.
    }

    // replace Method, replaces a character with another character
    public static void replace(){

        System.out.println("\n******* replace Method: ********");

        String s1 = "Hello";
        System.out.println(s1.replace('H', 'J')); // Jello
    }

    // split Method, splits a string into an array of substrings
    public static void split(){
        System.out.println("\n  *******  split Method:  *******");

        String s1 = "Hello, World";
        String[] words = s1.split(","); // splits the string into two substrings, Hello and World
        for (String word : words){ // the : is the enhanced for loop, which is used to iterate through an array. It can
                                   // be read as "for each element in the array words, do something"
            System.out.println(word.trim()); // since there is a space after the comma, the space is included in the second
                                      // substring, so the output will be Hello and World with a space in front. Remove
                                      // the trim() method to see the difference.
        }
    }

    // substring Method, extracts a substring from a string
    public static void substring(){
        System.out.println("\n  *******  substring Method:  *******");

        String s1 = "Tiger, Meows";
        System.out.println(s1.substring(7)); // World
        System.out.println(s1.substring(0, 5)); // Change the 5 to 6 and see what happens
    }

    // startsWith Method, checks if a string starts with a specified prefix.  Also a type of substring.
    public static void startsWith(){
        System.out.println("\n  *******  startsWith Method:  *******");

        String s1 = "Hello, World";
        System.out.println(s1.startsWith("Hello")); // true
        System.out.println(s1.startsWith("World")); // false
    }

    // endsWith Method, checks if a string ends with a specified suffix.  Also a type of substring.
    public static void endsWith(){
        System.out.println("\n  *******  endsWith Method:  *******");

        String s1 = "Hello, World";
        System.out.println(s1.endsWith("World")); // true
        System.out.println(s1.endsWith("Hello")); // false
    }

    // regionMatches Method, checks if a string starts with a specified prefix and ends with a specified suffix
    public static void regionMatches(){
        System.out.println("\n  *******  regionMatches Method:  *******");

        String s1 = "Hello, World";
        System.out.println(s1.regionMatches(0, "Hello", 0, 5)); // true
        System.out.println(s1.regionMatches(7, "World", 0, 5)); // true

        System.out.println(s1.regionMatches(true, 0, "hello", 0, 3)); // true
        System.out.println(s1.regionMatches(true, 0, "world", 0, 5)); // false
        // change the toffset to 7 and see what happens.
    }

    // The valueOf Method, converts a primitive data type to a string
    public static void valueOf(){
        System.out.println("\n  *******  valueOf Method:  *******");

        int i = 10;
        String s = String.valueOf(i);
        System.out.println(s); // 10
    }

    // indexOf Method, returns the index of a specified character
    public static void indexOf(){
        System.out.println("\n  *******  indexOf Method:  *******");

        String s1 = "Hello, World";
        System.out.println(s1.indexOf('H')); // 0
        System.out.println(s1.indexOf('o')); // 4
        System.out.println(s1.indexOf('o', 5)); // 8


    }

    // lastIndexOf Method, returns the index of the last occurrence of a specified character
    public static void lastIndexOf(){
        System.out.println("\n  *******  lastIndexOf Method:  *******");

        String s1 = "Hello, World";
        System.out.println(s1.lastIndexOf('o')); // 8
        System.out.println(s1.lastIndexOf('o', 5)); // 4
    }

    // length Method, returns the length of a string
    public static void length(){
        System.out.println("\n  *******  length Method:  *******");

        String s1 = "Hello, World";
        System.out.println(s1.length()); // 12
    }

    // charAt Method, returns the character at a specified index
    public static void charAt(){
        System.out.println("\n  *******  charAt Method:  *******");

        String s1 = "Hello, World";
        System.out.println(s1.charAt(0)); // H
        System.out.println(s1.charAt(7)); // W

        // using the charAt method to find the number of occurrences of a character in a string
        String s2 = "Hello, World";
        int count = 0;
        for (int i = 0; i < s2.length(); i++){
            if (s2.charAt(i) == 'o'){
                count++;
            }
        }
        System.out.println(count); // 2
    }

    // StringBuilder and StringBuffer are used to create mutable (modifiable) strings.
    public static void stringBuilderAndBuffer(){
        System.out.println("\n  *******  StringBuilder and StringBuffer:  *******");

        // StringBuilder is not thread safe, which means it is not synchronized.  It is faster than StringBuffer.
        // If you are working in a single-threaded environment, you should use StringBuilder.  If you are working in a
        // multi-threaded environment, you should use StringBuffer.
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World"); // append method is used to add text to the end of a string
        System.out.println(sb); // Hello World

        // StringBuffer is thread safe, which means it is synchronized.  It is slower than StringBuilder.
        StringBuffer sbf = new StringBuffer("Hello");
        sbf.append(" World");
        System.out.println(sbf); // Hello World

        // insert method is used to add text at a specified index
        sb.insert(5, ","); // insert a comma at index 5
        System.out.println(sb); // Hello, World
    }


}
