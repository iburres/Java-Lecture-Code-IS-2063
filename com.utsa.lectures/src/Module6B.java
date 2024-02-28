/*
     This module demonstrates the proper way to create a class, how to declare private fields, how to use
     setter and getter methods, how to use constructors, and the importance of using the "this" keyword.

     You can always write your code without these conventions, but it is important to understand them because
     they are widely used in the industry, and they are considered best practices.  First, by creating private fields
     and using setter and getter methods, you are encapsulating the fields. This means that the fields are not
     directly accessible from outside the class. The only way to access the fields is through the setter and getter
     methods.  Second, by using a constructor, you can initialize the fields when you create an object of the class.
     Again, this is not required and it will

     Stated another way, which I think is the BEST explanation I have read (StackOverflow):
     You should use the constructor approach, when you want to create a new instance of the object, with the values
     already populated(a ready to use object with value populated). This way you need not explicitly call the setter
     methods for each field in the object to populate them. You set the value using a setter approach, when you want to
     change the value of a field, after the object has been created.

     Remember, the 4 pillars of OOP: Encapsulation, Inheritance, Polymorphism, and Abstraction.


 */

import javax.swing.JOptionPane;

public class Module6B {

    // Declare private fields here.
    private String name;
    private int age;
    private String jobTitle;
    private String address;
    private String phoneNumber;
    private String email;
    private double salary;

    // Create a constructor that initializes the fields. If you do not create a constructor, Java will create a default
    // constructor for you. However, if you use the default constructor, you will not be able to initialize the fields.
    // All constructors have no return type.  Going off the StackOverflow explanation, you should use the constructor
    // approach, when you want to create a new instance of the object, with the fields already populated. Then, you
    // set the value using a setter approach, when you want to change the value of a field, after the object has been
    // created.

    // paramaterized constructor
    public Module6B(String name) {

        this.name = name; // Use the "this" keyword to refer to the current object.
    }

    // default constructor

    // no-arg constructor
    public Module6B() {
        this.name = "Billy Jean";
        this.age = 30;
        this.jobTitle = "Not his lover";
        this.address = "Born in the USA";
        this.phoneNumber = "867-5309";
        this.email = "billy.jean@rcarecords.com";
        this.salary = 300000000.00; // I am not sure if this is accurate, but it is a lot of money.
    }

    // Create setter and getter methods for each field.
    public void setName(String name) {
        this.name = name; // Use the "this" keyword to refer to the current object so that we de not confuse which
        // "name" we are referring to.
    }

    public String getName() {
        return name; // we usually do not use the "this" keyword when returning a field.
    }

    public void setAge(int age) {
        this.age = age; // Use the "this" keyword to refer to the current object so that we de not confuse which
        // "name" we are referring to.
    }

    public int getAge() {
        return age; // we usually do not use the "this" keyword when returning a field.
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public static void main(String[] args) {

        // Because we have a constructor that takes a name, we must pass a name when creating an object of the class.
        // We technically will not be using the setName method because we are passing the name to the constructor.
        Module6B person = new Module6B("John Doe");

        //using the no-arg constructor
        Module6B person2 = new Module6B();
        JOptionPane.showMessageDialog(null, "Name: " + person2.getName() + "\nAge: " + person2.getAge() +
                "\nJob Title: " + person2.getJobTitle() + "\nAddress: " + person2.getAddress() + "\nPhone Number: " +
                person2.getPhoneNumber() + "\nEmail: " + person2.getEmail() + "\nSalary: " + person2.getSalary());


        // Because the other fields are private, and they are not initialized in the constructor, we must use the
        // setter methods to set their values and the getter methods to return them.
        person.setAge(30);
        person.setJobTitle("Software Developer");
        person.setAddress("1234 Main St, Anytown, USA");
        person.setPhoneNumber("123-456-7890");
        person.setEmail("john.doe@utsa.edu");
        person.setSalary(130000.00);

        // Use JOptionPane to display the information and using the getters for each field.
        JOptionPane.showMessageDialog(null, "Name: " + person.getName() + "\nAge: " + person.getAge() +
                "\nJob Title: " + person.getJobTitle() + "\nAddress: " + person.getAddress() + "\nPhone Number: " +
                person.getPhoneNumber() + "\nEmail: " + person.getEmail() + "\nSalary: " + person.getSalary());


        // What if we want to change some attribute after the object has been constructed? We can use the setter methods.
        person.setName("Tiny Tim");
        person.setAge(11);
        person.setJobTitle("disabled child");
        person.setAddress("Charles Dickens' house");
        person.setPhoneNumber("Phone's not invented yet");
        person.setEmail("no such thing as email");
        person.setSalary(0.00); // he was poor, after all.
        JOptionPane.showMessageDialog(null, "Name: " + person.getName() + "\nAge: " + person.getAge() +
                "\nJob Title: " + person.getJobTitle() + "\nAddress: " + person.getAddress() + "\nPhone Number: " +
                person.getPhoneNumber() + "\nEmail: " + person.getEmail() + "\nSalary: " + person.getSalary());

        System.exit(0);
    }

}
