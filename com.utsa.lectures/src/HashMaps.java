/**
 *          HashMaps
 *
 *          This class is a collection of methods that demonstrate the use of HashMaps in Java.
 *
 */

// Import the HashMap class from the java.util package
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import javax.swing.JOptionPane;

public class HashMaps {


    // Table of HashMap methods
    /*
     * Method               Description
     * put(key, value)     Adds a key-value pair to the HashMap
     * get(key)            Returns the value associated with the specified key
     * remove(key)         Removes the key-value pair associated with the specified key
     * containsKey(key)    Returns true if the HashMap contains the specified key
     * containsValue(value) Returns true if the HashMap contains the specified value
     * size()              Returns the number of key-value pairs in the HashMap
     * isEmpty()           Returns true if the HashMap is empty
     * clear()             Removes all key-value pairs from the HashMap
     */
    public static void main(String[] args) {

        // Create a new HashMap.  Notice that we specify the data types for the key and value, meaning they do not
        // have to be the same data type.

        //Create a Hashmap with a key and a list of grades
        HashMap<String, List<Integer>> gradeBook = new HashMap<>();

        // Create an Array List of type Integer and add the grades.
        List<Integer> grade = new ArrayList<>();
        grade.add(85);
        grade.add(90);
        grade.add(78);

        // Use the put method to add the list of grades for a student
        gradeBook.put("Alice", grade);
        System.out.println("Grade Book: " + gradeBook);

        // Try a for loop and/or using a built-in method.   keySet ?????   List = contains() method
        for  (String ignored : gradeBook.keySet()) {
            System.out.println("Contains value 85: " + grade.contains(85));
        }


        // Using a loop to enter a key with multiple values in a HashMap

        HashMap<String, List<Integer>> adv_grade_book = new HashMap<>();
        String student_name;

        List<Integer> grades = new ArrayList<>();
        boolean user_choice_bool = true;
        int number_of_grades = 0;
        while (user_choice_bool){

            student_name = JOptionPane.showInputDialog("Enter student name: ");
            number_of_grades = Integer.parseInt(JOptionPane.showInputDialog("Enter number of grades to input: "));
            grades.clear();

            for(int i = 0; i < number_of_grades; i++){

                grades.add(Integer.parseInt(JOptionPane.showInputDialog("Enter grade number " + i + ": ")));

            }

            adv_grade_book.put(student_name, new ArrayList<>(grades));

            String again = JOptionPane.showInputDialog("Do you want to enter another student? [Y/n ").toLowerCase(Locale.ROOT);
            if(again.equalsIgnoreCase("n")){


                System.out.println("The current grades are: " + grades);
                user_choice_bool = false;
            }

        }

        // Use JOptionPane to display the grade book
        JOptionPane.showMessageDialog(null, "Grade Book: " + adv_grade_book);

        // Same as above but formatted better
        for(String key : adv_grade_book.keySet()) {
            JOptionPane.showMessageDialog(null, "Student: " + key + ", Grades: " + adv_grade_book.get(key).toString());

        }

        // ---------------------------------------------------------------------------------------------

        HashMap<String, Integer> map = new HashMap<String, Integer>(); // Key: String, Value: Integer

        // Add key-value pairs to the HashMap
        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Charlie", 35);
        map.put("David", 40);

        // Print the HashMap
        System.out.println("HashMap: " + map);

        // Get the value for a specific key
        System.out.println("Value for key 'Alice': " + map.get("Alice"));

        // Check if the HashMap contains a specific key
        System.out.println("Contains key 'Bob': " + map.containsKey("Bob"));

        // Check if the HashMap contains a specific value
        System.out.println("Contains value 35: " + map.containsValue(35));

        // Remove a key-value pair from the HashMap
        map.remove("Charlie");

        // Print the HashMap
        System.out.println("HashMap: " + map);

        // Get the size of the HashMap
        System.out.println("Size of HashMap: " + map.size());

        // Check if the HashMap is empty
        System.out.println("Is HashMap empty: " + map.isEmpty());

        // Clear the HashMap
        map.clear();

        // Print the HashMap
        System.out.println("HashMap: " + map);

        moreExamples();
        nestedHashMaps();
    }

    // More examples of Hashmaps
    public static void moreExamples() {
        // Create a HashMap to store student names and their grades
        HashMap<String, Double> studentGrades = new HashMap<>();

        // Add some students and their grades
        studentGrades.put("Emma", 89.5);
        studentGrades.put("Liam", 92.0);
        studentGrades.put("Olivia", 85.0);
        studentGrades.put("Noahzzz", 88.5);

        // Print all student grades

        // setA setB    setA{2, 4, 8}    setB { 3, 4, 9}     Union = {2, 3, 4, 8, 9}
        for (String student : studentGrades.keySet()) {
            System.out.println(student + ": " + studentGrades.get(student));
        }

        // Update a student's grade
        studentGrades.put("Olivia", 90.0);
        System.out.println("Updated Olivia's grade: " + studentGrades.get("Olivia"));

        // Remove a student from the HashMap
        studentGrades.remove("Noah");
        System.out.println("Removed Noah. Current students: " + studentGrades.keySet());
    }

    // Method to demonstrate nested HashMaps
    public static void nestedHashMaps() {
        // Create a HashMap to store employee details
        HashMap<String, HashMap<String, String>> employeeDetails = new HashMap<>();
        // Add employee details
        HashMap<String, String> emp1Details = new HashMap<>();
        emp1Details.put("Position", "Manager");
        emp1Details.put("Department", "Sales");
        employeeDetails.put("E001", emp1Details);
        HashMap<String, String> emp2Details = new HashMap<>();
        emp2Details.put("Position", "Developer");
        emp2Details.put("Department", "IT");
        employeeDetails.put("E002", emp2Details);
        // Print employee details
        for (String empId : employeeDetails.keySet()) {
            System.out.println("Employee ID: " + empId + ", Details: " + employeeDetails.get(empId));
        }
    }


}
