/*
        Module 5: Methods and Encapsulation

        We will learn to include methods in our code, including how to return from methods, and how to use method
        parameters. We will also learn about how to use access modifiers to protect our data and
        the concept of method overloading.

        This is the first stage in truly understanding how to write object-oriented code.

 */

// static keyword is used to create a method that belongs to the class, not an instance of the class. static also
// applies to variables.  If a variable is static, it belongs to the class, not an instance of the class.
// public keyword is an access modifier that makes the method public, meaning it can be called from other classes. Public
// also applies to variables.  If a variable is public, it can be used by other classes.
// void keyword is used to indicate that the method should not return anything.
// main is the name of the method. It is the entry point to the program.
// private keyword is an access modifier that makes the method private, meaning it can only be called from within the class.
// private also applies to variables.  If a variable is private, it can only be used by methods in the same class.

public class Module5 {
    // It is best practice to declare all static variables at the top of the class, just after the class declaration.
    static int myStaticVariable = 5;  // This is a static variable. It can be used by all methods in the class.
    public static int myPublicStaticVariable = 10;  // This is a public static variable. It can be used by all methods
                                                    // in the class and by all methods in other classes.
    private static int myPrivateStaticVariable = 15;  // This is a private static variable. It can only be used by
                                                      // methods in this class.
    private final int MY_FINAL_VARIABLE = 25;  // This is a final variable. It can only be assigned once. It is common
                                               // to use all capital letters for final variables as they are constants.
    //int new_variable = 5;

    // This is the main method that is the entry point to our program. Every class must have a main method and can only
    // have one main method.  This is where the program starts running.  We can call other methods from the main method.
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

        // We cannot call a private method from outside the class; however, we can call it from within the class as
        // shown below.
         myModule5.printHello3();  // This will give us an error.





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
        int some_other_number = 0;
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

    // Creating a private method
    private void printHello3() { // we can create a private method that can only be called from within the class.
                                 // For instance, if we tried to call this method from another class, we would get an error.
        System.out.println("Hello");
    }

    // local variables
    public void myMethod() {
        int x = 40;  // x is a local variable. It can only be used within the method where it is declared.
        System.out.println(x);
    }

    // If you want to share the local variable with other methods, you can declare it as a static variable like this:
    static int y = 40;  // y is a static variable. It can be used by all methods in the class.

    public void myOtherMethod() {
        System.out.println(y); // notice here that we can use the static variable y in this method.
    }

    // You should usually declare static variables just after the class declaration, since it can be used by all methods:

}

// this is another class in the same file. We can only have one public class in a file, but we can have as many
// non-public classes as we want.  I would suggest putting each class in its own file, but this is just to show
// that it is possible to have more than one class in a file. We will visit this topic next week, in Module 6 and 8.
class Module5_2 {

    // Because this is another class, we can have another main method.  This is not the entry point to the program though.
    // since that is in the Module5 class.
    public static void main(String[] args) {
        Module5 myModule5 = new Module5();
        // myModule5.printHello3();  // This will give us an error because we cannot call a private method from outside
                                    // the class. module5_2 is outside the class since it is a different class.

    }

    // We can call the public methods from the other class, since they are public.
    public void printHello2() {  // printHello2 is never called from this class, but it is public, so it can be called
                                 // from another class. This is just to show that it is possible to call a public method.
        Module5 myModule5 = new Module5();
        myModule5.printHello2();
    }
}

// To sum it up:
// we call methods in a class by using the static keyword if the method is a class method and
// by creating an instance of the class if the method is an instance method. We use the method name followed by
// parentheses to call a method. We can store the result of a method call in a variable of the same type, and
// we can send parameters to the method when we call it.  Overloaded methods are methods with the same name
// but different parameters.  We can call overloaded methods with different parameters.
// We can use access modifiers to protect our data.  We can use the private keyword to make a method private, meaning
// it can only be called from within the class.  We can use the public keyword to make a method public, meaning it can
// be called from other classes.  We can use the static keyword to create a method that belongs to the class, not an
// instance of the class.  We can use the final keyword to create a variable that can only be assigned once.  We can
// use the static keyword to create a variable that belongs to the class, not an instance of the class.  We can use the
// public keyword to create a variable that can be used by other classes.

