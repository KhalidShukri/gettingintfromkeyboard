import java.util.InputMismatchException;
import java.util.Scanner;
public class Exceptions {
    public static void main (String [] args) {
//        Create Scanner object
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter Any number");
            int anyNumber = scanner.nextInt();

        } catch (InputMismatchException ex) {
            System.out.println("Invalid Input! Expected an integer");
        }
        if (scanner.hasNextInt()) {
            int num = scanner.nextInt();

        } else {
            System.out.println("Invalid Input! Expected an integer");
        }
        scanner.close();

    }
}
