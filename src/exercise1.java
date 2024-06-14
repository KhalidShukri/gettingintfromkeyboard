import java.util.Scanner;
import javax.swing.JOptionPane;

public class exercise1 {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Your Name");
        String name = scanner.next();

        System.out.print("Enter Your Age");
        int age = scanner.nextInt();

        System.out.print("Enter Your GPA");
        double gpa = scanner.nextDouble();

        System.out.println("hello," + name);
        System.out.println("Age:" + age);
        System.out.println("GPA:" + gpa);
        scanner.close();






    }
}
