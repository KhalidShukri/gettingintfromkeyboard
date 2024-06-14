import java.util.InputMismatchException;
import java.util.Scanner;

public class getinputusingscanner {
    public static void main (String [] args) {
//        CreatS a scanner object
        Scanner scanner = new Scanner(System.in);

//        close scanner object
//        get username
        System.out.println("Please enter your name");
        String name = scanner.nextLine();
//        get age
        System.out.println("Please enter your age too");
        int age = scanner.nextInt();

//        get height
        System.out.println("Please enter your height too");
        double height = scanner.nextDouble();

//        Output user information
        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
        System.out.println("Height:" + height);
//        Close scanner object
        scanner.close();



    }
}
