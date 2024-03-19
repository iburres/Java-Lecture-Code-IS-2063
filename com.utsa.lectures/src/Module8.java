/*
       Module :  A Second Look at Classes and Objects

         Topics:
            - Passing objects as arguments to methods
            - Returning objects from methods
            - The toString method
            - The equals method
            - Making copies of objects
            - The copy constructor
               - The clone method
            - The no-argument constructor
            - Aggregation
            - The "this" keyword
            - Enumerated types
            - Compiling and sharing your programs as JAR files

            NOTE: The book describes a key use of the "this" keyword as a means to overcome shadowing, which is when a
            field name is the same as a parameter name.  You can also use this to call one constructor from another.

            Note2: Security issues with Aggregation:  Perform deep copies when creating field objects and return copies
            of field objects, not the original field objects.  This is to prevent the field objects from being modified.



 */

public class Module8 {

    // Example of object Aggregation.  We are creating an instance of the Module6B class as a field of the Module8 class.
    private Module6B module;  // this uses the "has a" relationship, so we can say that the Module8 class "has a" module.
    enum Days {MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY}

    // Enumerated types.  Playing cards with suits and ranks.
    enum Suits {Hearts, Diamonds, Clubs, Spades}
    enum Ranks {Two, Three, Four, Five, Six, Seven, Eight, Nine, Ten, Jack, Queen, King, Ace}



    // creating a field
    private int x;
    private int y;


    // I will explain why I have two constructors during the lecture
    public Module8(int x, int y) {
        this.x = x; // this refers to the field x and is available to all non-static methods
        this.y = y;
    }

    public Module8() {
        x = 0;
        //y = 0;
    }

    // Constructor that demonstrates the use of the "this" keyword to call another constructor
    public Module8(int x) {

        this(x, 0);
    }



    // Copy Constructor
    public Module8(Module8 newModule) {
        x = newModule.x;
        y = newModule.y;
    }

    public static void main(String[] args) {

        // Passing objects as arguments to methods
        Module8 mymodule = new Module8();
        Module8 module99 = new Module8(2, 4);

        // set the x field of the mymodule object to 5
        mymodule.setX(5);
        displayObject(mymodule); // pass a reference to the mymodule object to the displayObject method

        //System.out.println(mymodule.getX());

        // Returning objects from methods
        Module8 newModule = returnObject(); // call the returnObject method and store the returned object in the newModule variable

        // Passing a reference to a method and returning an object from that same method
        Module8 newModule2 = new Module8();
        newModule2 = returnAndReceiveObject(newModule2);
        displayObject(newModule2);

        // calling the toString method
        //System.out.println(newModule2); // notice how we don't need to call the toString method explicitly

        //System.out.println(mymodule); // Here, you can see that the value of x is 5, not 15, like in the previous example.
        // Also, the toString method removes the address of the object from the output.

        // We cannot use the == operator to compare if two objects are equal, so we use the equals method
        System.out.println(mymodule.equals(newModule2)); // prints false

        System.out.println(mymodule.equals(newModule)); // prints true

        // making copies of objects
        Module8 newModule3 = new Module8();
        newModule3 = newModule2; // newModule3 is NOT a copy of newModule2, it is a reference to the same object.

        // If we want to make a copy of an object, we need to use the copy method
        Module8 newModule4 = new Module8();
        newModule4 = newModule2.copy();
        System.out.println(newModule4); // prints 15

        // compare copy and original
        System.out.println(newModule2.equals(newModule4)); // prints true

        Module8 newModule5 = new Module8(newModule4);
        // compare copy and original
        System.out.println(newModule2.equals(newModule5)); // prints true

        // creating a card object
        Suits card = Suits.Hearts;
        System.out.println(card); // prints Hearts

        // Making a 10 of Hearts card
        Suits card2 = Suits.Hearts;
        Ranks rank = Ranks.Ten;
        System.out.println(rank + " of " + card2); // prints Ten of Hearts


    }

    // This method receives an object in the parameter newModule, which is of type Module8
    public static void displayObject(Module8 newModule) {
        System.out.println("The object is newModule, which is located at: " + newModule); // prints the object and its memory location
        System.out.println(newModule.getX()); // prints the value of the x field of the object
    }

    // Method that shows how to return an object
    public static Module8 returnObject() {
        Module8 newModule = new Module8();
        newModule.setX(10); // change this value to see the difference with the equals method
        return newModule;
    }

    public static Module8 returnAndReceiveObject(Module8 newModule3) {
        newModule3.setX(15);
        return newModule3;
    }

    // toString method
    @Override
    public String toString() {
        return "The value of x is: " + x + y;
    }

    // If we write the equals method, we will be overriding the equals method of the Object class, just as we
    // did with the toString method. The equals method is used to compare two objects to see if they are equal.
    public boolean equals(Module8 newModule) {
        boolean status;
        if((x == newModule.x) && (y == newModule.y)) {
            status = true;
        } else {
            status = false;
        }
        return status;
    }

    // Method to make a copy of an object
    public Module8 copy() {
        Module8 copyObject = new Module8(x, y); // this requires a constructor that takes two parameters. As such,
        // we also need a no-argument constructor for the other objects we created that did not take any arguments.
        // Go ahead and comment the constructor that takes two parameters and see what happens.

        return copyObject;
    }

    @Override
    // The clone method.  This method is part of the Object class, and it is used to create a copy of an object, so we
    // will have to override it.
    public Object clone() {
        Module8 copyObject = new Module8(x, y);
        return copyObject;
    }


    // Setter or mutator method for the x field
    public void setX(int x) {
        this.x = x;
    }

    // Getter or accessor method for the x field
    public int getX() {
        return x;
    }

    public int setY(int y) {
        this.y = y;
        return y;
    }

    public int getY() {
        return y;
    }
}
