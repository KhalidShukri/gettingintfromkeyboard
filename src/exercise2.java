import java.util.Scanner;
public class exercise2 {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the radius of the circle");
        double radius = scanner.nextDouble();
//        double area = (22 * radius * radius) / 7;
        double area = Math.PI * radius * radius ;
        System.out.println("The area of the Circles is: " + area+ "14" +
                "cm\u00b2");
        scanner.close();

    }
}
