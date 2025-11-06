/*
        Module 10 - Inheritance

        Topics:
        - Inheritance
        - Calling the superclass constructor
        - Overriding Superclass methods
        - Protected members
        - Chains of inheritance
        - The Object class
        - Polymorphism

        - Abstract classes and Abstract methods
        - Interfaces
        - Anonymous inner classes
        - Functional interfaces and Lambda expressions
        - Common Errors to Avoid


 */

import javax.swing.*;

// Assume Module 10 behaves like the FinalExamDemo class in the textbook
public class Module10 {


    public static void main(String[] args) {
        String input;
        int questions;
        int missed;

        // Get the number of questions on the exam
        input = JOptionPane.showInputDialog("How many questions are on the final exam?");
        questions = Integer.parseInt(input);

        // Get the number of questions the student missed
        input = JOptionPane.showInputDialog("How many questions did the student miss?");
        missed = Integer.parseInt(input);

        // Create a FinalExam object
        Module10_1 exam = new Module10_1(questions, missed);

        // Display the test results
        JOptionPane.showMessageDialog(null, "Each question counts " + exam.getPointsEach() + " points.\n"
                + "The exam score is " + exam.getScore() + "\nThe exam grade is " + exam.getGrade());

        // Create a Module10_2 object to show the super keyword
        Module10_2 exam2 = new Module10_2(questions, missed);

        /*  This is a quick example of polymorphism and the instanceof operator
        Module10_0[] tests = new Module10_0[3];
        tests[0] = new Module10_1(100, 20); // This is a subclass object
        tests[0].setScore(95);

        if (tests[0] instanceof Module10_1) {
            System.out.println("This is a Module10_1 object");
        }
        */

        // creating an object from the implementing class
        Module10_7 obj = new Module10_7();
        obj.doSomething();
        obj.doSomethingElse();
        System.out.println("This is the end of the program");


        System.exit(0);

    }
}

// Assume Module 10 behaves like the GradedActivity class in the textbook
class Module10_0 {

    private double score; // This field is private, so it is not accessible from outside the class even via inheritance.
                          // However, it can be accessed by the getScore and setScore methods which are public.
    protected double myScore; // This is a protected field, so it can be accessed by methods in the same class, subclasses,
                                // and classes in the same package as the member's class.

    public void setScore(double s) {
        score = s;
    }

    public double getScore() {
        return score;
    }

    public char getGrade() {
        char letterGrade;

        if (score >= 90) {
            letterGrade = 'A';
        } else if (score >= 80) {
            letterGrade = 'B';
        } else if (score >= 70) {
            letterGrade = 'C';
        } else if (score >= 60) {
            letterGrade = 'D';
        } else {
            letterGrade = 'F';
        }

        return letterGrade;
    }

}

// Assume Module 10 behaves like the FinalExam class in the textbook. This class extends Module10_0 (GradedActivity)
class Module10_1 extends Module10_0{

    private int numQuestions;
    private int numMissed;
    private double pointsEach;
    private double rawScore;



    public Module10_1(int questions, int missed) {
        double numericScore;

        numQuestions = questions;
        numMissed = missed;

        pointsEach = 100.0 / questions;
        numericScore = numQuestions - (missed * pointsEach);

        myScore = 10.0; // Because myScore is protected, it can be accessed by the subclass

        setScore(numericScore);
    }

    public double getPointsEach() {
        //myScore = 20.0; // This will change the value of myScore in the superclass
        return pointsEach;
    }

    public int getNumMissed() {

        return numMissed;
    }

    @Override
    public void setScore(double s) {

        rawScore = s;
        super.setScore(rawScore);
    }



}

class Module10_2 extends Module10_1 {

    private int numQuestions;
    private int numMissed;
    private double pointsEach;

    //using the super keyword to call the superclass constructor. You can ONLY call super from the subclass constructor
    public Module10_2(int questions, int missed) {
        super(questions, missed); // Remember, if the superclass constructor is default or no-arg, then it is called
                                  // immediately before the subclass constructor body.
    }

    public Module10_2(){

        super(10, 2); // This will call the superclass constructor with 10 questions and 2 missed
    }

    public Module10_2(int questions, int missed, double pointsEach) {
        super(questions, missed); // This will call the superclass constructor with 10 questions and 2 missed
        this.pointsEach = pointsEach;
    }

    // NOTE: If the superclass constructor is not default or no-arg, then you must call it explicitly with the super
    // keyword, or you will get a compilation error.


    @Override
    public double getPointsEach() {
        return pointsEach;
    }

    @Override
    public int getNumMissed() {
        return numMissed;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

// because this does not extend another class, Java will automatically extend the Object class.  Eventually, all classes
// in Java extend the Object class.
class Module10_3  {

    // Two of the most useful methods in the Object class are the toString and equals methods.
    // Left blank for demonstration purposes

}

// Polymorphism is the ability of an object to take on many forms. The most common use of polymorphism in OOP is when a
// superclass reference variable can reference objects of a subclass.
class Module10_4{


    public static void main(String[] args) {

        Module10_0[] tests = new Module10_0[3]; // This is an array of superclass objects

        tests[0] = new Module10_1(100, 20); // This is a subclass object
        tests[0].setScore(95);

        // instanceof operator is used to determine if an object is an instance of a particular class
        if (tests[0] instanceof Module10_0) {
            System.out.println("This is a Module10_1 object");
        }
        else{
            System.out.println("This is NOT a Module10_1 object");
        }

    }

}

/**
 * Abstract Classes and Methods, and Interfaces
 */

// An abstract class is a class that is declared abstract —it may or may not include abstract methods.
// Abstract classes cannot be instantiated, but they can be subclassed. When an abstract class is subclassed, the
// subclass usually provides implementations for all the abstract methods in its parent class. - Oracle

// The abstract keyword is a non-access modifier, used for classes and methods:
abstract class Module10_5 extends Module10_0{

    // You cannot create objects with abstract classes.

    // To access this abstract class, it must be inherited by another class.

    public abstract void doSomething(); // This is an abstract method.  Notice it does not have a body.

    public void doSomethingElse() {
        System.out.println("This is a concrete method");  // This is a regular method.
    }

    // implementing the abstract method from the superclass
    @Override
    public void setScore(double s) {
        super.setScore(s);
    }

// NOTE:  For additional information and a good example, visit this link: https://www.w3schools.com/java/java_abstract.asp

}

// An interface is used to group related methods with empty bodies.  It is a blueprint of a class.
interface Module10_6 {

    void doSomething(); // This is an abstract method, so it does not have a body

    void doSomethingElse(); // This is an abstract method, so it does not have a body

}

// Now we can implement the interface in a class
class Module10_7 implements Module10_6 {  // Notice the "implements" keyword


    public void doSomething() {
        System.out.println("This is the doSomething method"); // Here
    }


    public void doSomethingElse() {
        System.out.println("This is the doSomethingElse method");
    }

    //NOTE:  For additional information and a good example, visit this link: https://www.w3schools.com/java/java_interface.asp

}






