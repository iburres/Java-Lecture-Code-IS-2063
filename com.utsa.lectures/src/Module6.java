/*
        Module 6 - A First Look at Classes
 */

//importing a method from Module5 class
import javax.swing.JOptionPane;
import java.io.IOException;
import java.util.Random;

// We will treat the Module6 class as the driver code for the program. Typically, the driver code contains the main method.
// and instantiates objects from other classes. The driver code is the entry point of the program.
public class Module6 { // The public class name must match the file name. We can have only one public class per file.

    public static void main(String[] args) throws IOException { // throws IOException is used to handle input/output errors

        // We can use the printHello method from Module5 class
        // Module5.printHello();
        Menu.displayMenu();
        System.exit(0);


    }
}

class Menu {
    // Class body
    public static void displayMenu() {
        // Method body

        // Here we are getting the current color of the car
        String current_color = Car.getCarColor();
        JOptionPane.showMessageDialog(null, "The car's color is " + current_color);

        // Here we are setting the color of the car
        String color_choice = JOptionPane.showInputDialog("Enter the color of the car: ");
        Car.setColor(color_choice);

        // We are creating a car object and assigning its address to the
        // car1 variable. We are then using the car1 variable to access the vin field of the car object.
        Car car1 = new Car();
        car1.setVin("123456789");
        String vin = car1.getVin();
        JOptionPane.showMessageDialog(null, "The car's vin is " + vin);

        // Create a car object and assign its address to the car2 variable.  carStart is a non-static method, so it
        // belongs to the object and not to the class. This is the correct way to declare methods when working with OOP.
        Car car2 = new Car();
        car2.carStart();

        // print out the fields of the car1 object using the non-static fields
        JOptionPane.showMessageDialog(null, "Car 2'S vin is " + car2.getVin());
        JOptionPane.showMessageDialog(null, "Car 1's vin is " + car1.getVin());
        JOptionPane.showMessageDialog(null, "The state of Car 2 is: " + car2.isOn); // As you
        // can see, the isOn field is static, so it belongs to the class and not to the object. This is not good practice.

        // print out the memory address of the car1 and car2 objects
        JOptionPane.showMessageDialog(null, "The memory address of car1 is: " + car1);
        JOptionPane.showMessageDialog(null, "The memory address of car2 is: " + car2);

        // We cannot print the memory location of a static variable because it does not belong to the object. We would
        // need to have pointers to access the memory location and Java does not support pointers.
        JOptionPane.showMessageDialog(null, "The memory address of the non-static vin field is: " +
                vin);

        // Hopefully, you now see why static fields are not good practice. You cannot access the memory location of
        // a static field. Also, static fields are shared among all objects of the class. This means that if you change
        // the value of a static field in one object, it will change the value of the static field in all objects of the
        // class. Static fields are not true to the object-oriented programming paradigm. They are more like global
        // variables.


    }
}

// The car class is the blueprint for the car object.  It has fields and methods. The fields are the car's attributes
// and the methods are the car's behaviors.
class Car {
    // Static fields. Because they are static, they belong to the class and not to the object. Technically, this is
    // not good practice. In fact, it violates the principles of object-oriented programming (OOP). Also, Static variables
    // do not get stored in the heap or on the stack. Instead, they are stored in the data segment of the program's memory.
    static String color;
    static int speed;
    static String make;
    static String model;
    static boolean isOn;

    // non-static fields. Because they are non-static, they belong to the object and not to the class. This is the
    // correct way to declare fields. Non-static variables belong are stored in the object memory. I will show you
    // how to access the memory of an object during class lecture.
    private String vin; // vin means vehicle identification number

    // constructor method. This method is used to create objects of the class. It is called when the new keyword is used
    // to create an object. It is used to initialize the object's fields. It has the same name as the class and no return

    public Car() {
        // This is the default constructor. It is called when the new keyword is used to create an object of the class.
        // It is used to initialize the object's fields. It has the same name as the class and no return type.
        color = "red";
        speed = 0;
        make = "Toyota";
        model = "Camry";
        isOn = false;

        // The "this" keyword is used to refer to the object's fields. You cannot use the "this" keyword with static fields.
        // so this is another reason why static fields are not good practice, since you can't refer to a specific object's
        // field/attribute.

        this.vin = "000000000";
        //vin = "111111111";
    }

    // Here is a second constructor, except this one takes parameters. This is called a parameterized constructor. We
    // can have more than one constructor in a class. This is called constructor overloading; however, the constructors
    // must have different parameters.

    Car(String newColor, int newSpeed, String newMake, String newModel, boolean newIsOn, String newVin) {
        color = newColor;
        speed = newSpeed;
        make = newMake;
        model = newModel;
        isOn = newIsOn;
        vin = newVin;
    }

    // This is not a static method. It is an instance method. It belongs to the object and not to the class. This is
    // the correct way to declare methods when working with OOP.
    public void carStart() {
        // create a random int called toggle from 0 to 1
        Random rand = new Random();
        int toggle = rand.nextInt(0, 1);

        // This method will be used to start the car
        if (toggle == 1) {
            JOptionPane.showMessageDialog(null, "The car is on");
        } else {
            JOptionPane.showMessageDialog(null, "The car is off");
        }
    }

    // The setter method is used to set the value of the field, so it usually takes a parameter.
    public static void setColor(String newColor) {
        // This method will be used to set the car's color
        // set the car's color
        color = newColor;
        JOptionPane.showMessageDialog(null, "The car's new color is " + color);

    }

    // The getter method is used to get the value of the field, so it usually returns a value.
    public static String getCarColor() {
        // This method will be used to get the car information
        // get the car's color
        return color;


    }

    // setter and getters are used can also be used to access private fields.
    public void setVin(String newVin) {
        // This method will be used to set the car's vin
        vin = newVin;
    }

    public String getVin() {
        // This method will be used to get the car's vin
        return vin;
    }
}

// Let's build the truck class using proper OOP principles. We will use non-static fields and methods.  We will also
// use the "this" keyword to refer to the object's fields, and we will use the "new" keyword to create objects of the
// class. We can experiment with the public and private access modifiers to see how they work in the context of OOP.
// Finally, remember to use setters and getters to access private fields. This is the "correct" way to access private
// fields, since we do not want to access them directly. We want to use methods to access them. This is often referred to
// as encapsulation.
class Truck {

    private void truckStart() {
        // Method body
    }
}
