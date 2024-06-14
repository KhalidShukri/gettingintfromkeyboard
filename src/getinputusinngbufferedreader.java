import java.io.*;

public class getinputusinngbufferedreader {
    public static void main(String[] args) {
//        Create bufferedReader object/instance
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
//        Create a string variable to store username
        String name = "";
        System.out.print("Please enter your name");
        try {
            name = dataIn.readLine();
        } catch (IOException ex) {
            System.out.println("Eroor in getting input!");
        }
        System.out.println("Hello" + name + "!");

////        Create a strring variable
//        String temp =  "";
//        try {
//           temp = dataIn.readLine();
//        } catch (IOException ex) {
//            System.out.println("Error in getting input");
//
//    }

    }
}
