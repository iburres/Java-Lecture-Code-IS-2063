import javax.swing.JOptionPane;
import java.util.Scanner;

public class MDINC2 {

    /*

    Get User input using the keyboard, int num_1 and double frac_1
    Find the product of those two numbers, and print them
    to a GUI with a message saying:  "The product of integer x and double
    y is:  ____"

     */
    public static void main(String[] args) {

        int num_1;
        double fract_1;
        double product;

        System.out.print("Please enter an integer: ");
        Scanner keyboard = new Scanner(System.in);
        num_1 = keyboard.nextInt();

        System.out.print("Please enter a fraction: ");
        fract_1 = keyboard.nextDouble();

        product = num_1 * fract_1;

        JOptionPane.showMessageDialog(null, "The "+
                "product of " + num_1 + " and " + fract_1 +
                " is: " + product);
    }
}
