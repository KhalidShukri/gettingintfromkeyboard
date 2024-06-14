import javax.swing.JOptionPane;

public class getinputusingJoption {
    public static void main (String[]args) {
//               Create a variable to store user input
        String name = JOptionPane.showInputDialog("Please Enter your name");
//        Display output message
        String msg = "Hello,"  +   name + "!";
        JOptionPane.showMessageDialog(null,msg);
    }
}
