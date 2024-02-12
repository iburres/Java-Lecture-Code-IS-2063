/*
        Module 5: Methods and Encapsulation

        We will learn to include methods in our code, including how to return from methods, and how to use method
        parameters. We will also learn about encapsulation, and how to use access modifiers to protect our data.

        This is the first stage in truly understanding how to write object-oriented code. We will also learn about
        the concept of method overloading, and how to use the "this" keyword.

 */

public class Module5 {

    // This is the main method that is the entry point to our program. Our program can only have one main method.
    public static void main(String[] args) {

        // Here we can call the other methods we have created.
        printHello();  // This is a method call.  We use the method name followed by parentheses to call a method.
        String result = returnHello();  // We can store the result of a method call in a variable of the same type.
        System.out.println(result);  // We can then print the result to the console.
        printNumber(5);  // We can send a number to the method when we call it.
        printSum(5.5, 6.5);  // We can send two numbers to the method when we call it.
        int the_product = multiplyByTwo(5);  // We can store the result of a method call in a variable of the same type.
        System.out.println(the_product);  // We can then print the result to the console.

        // create an instance of the class to call the printHello2 method.
        Module5 myModule5 = new Module5();
        myModule5.printHello2();

        // Example of calling on overloaded method
        myModule5.printHello2("John"); // we can call the overloaded method with a parameter.

        // Here we are returning different values from the overloaded methods.
        int total = myModule5.plusMethod(8, 5); // we can call the overloaded method with two integers.
        System.out.println(total);
        double new_total = myModule5.plusMethod(4.3, 6.26); // we can call the overloaded method with two doubles.
        System.out.println(new_total);

        // To sum it up, we call methods in a class by using the static keyword if the method is a class method, and
        // by creating an instance of the class if the method is an instance method. We use the method name followed by
        // parentheses to call a method. We can store the result of a method call in a variable of the same type, and
        // we can send parameters to the method when we call it.  Overloaded methods are methods with the same name
        // but different parameters.  We can call overloaded methods with different parameters.


    }

    // A public method that does not return anything.
    public static void printHello() { // the static keyword means that this method belongs to the class, not an
                                      // instance of the class. If we remove the static keyword, we would need to
                                      // create an instance of the class to call this method.
        System.out.println("Hello");
    }

    // A public method that returns a String.
    public static String returnHello() {
        return "Hello";  // We use the return keyword to return a value from a method.  This means the result
                         // will need to be stored in a variable of the same type by the caller.
    }

    // A public method that takes a parameter of type integer
    public static void printNumber(int number) {  // we can send a number to the method when we call it.
        System.out.println(number);
    }

    // A public method that takes two parameters of type double
    public static void printSum(double number1, double number2) {
        System.out.println(number1 + number2);
    }

    // A public method that takes a parameter of type integer and returns the value multiplied by 2
    public static int multiplyByTwo(int number) {
        return number * 2;
    }

    // create an instance of the class to call this method.
    public void printHello2() {
        System.out.println("Hello");
    }

    // overloading a method, Example 1
    public void printHello2(String name) { // we can have two methods with the same name, as long as they have
                                          // different parameters. This is called method overloading.
        System.out.println("Hello " + name);
    }

    // Method overloading example 2
    public int plusMethod(int x, int y) {
        return x + y;
    }

    public double plusMethod(double x, double y) {
        return x + y;
    }
}
