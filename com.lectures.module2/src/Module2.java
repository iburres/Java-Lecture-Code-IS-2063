// pre-processor section
import javax.swing.JOptionPane;
import java.util.Scanner;
public class Module2 {
    //variable
    String first_name;
    public static void main(String[] args) {
        String first_name;
        JOptionPane.showMessageDialog(null, "Hello World");
        first_name = JOptionPane.showInputDialog(null, "What is your name? ");
        System.out.println(first_name);

        Scanner keyboard = new Scanner(System.in);
        keyboard.nextLine();



        //keyboard.close();
    }





}
