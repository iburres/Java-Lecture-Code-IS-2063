// This is a comment
/*
    This is a block comment
    So is this ....
    ....
 */

// This is the import section, or what is commonly referred to as the pre-processor section
import javax.swing.JOptionPane;

public class Module1 {

    public static void main(String[] args) {

        String name = "";

        //System.out.print("Hello World");

        //JOptionPane.showMessageDialog(null,"Please enter your name");
        name = JOptionPane.showInputDialog("Please enter your name: ");
        JOptionPane.showMessageDialog(null, "Hello " + name + ", welcome to IS-2063");
        System.exit(0);
    }

}




