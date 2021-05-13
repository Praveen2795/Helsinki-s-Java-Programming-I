
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a string:");
        String someString = String.valueOf(scan.nextLine());
        System.out.println("Give an integer:");
        int someInteger = Integer.valueOf(scan.nextLine());
        System.out.println("Give a double:");
        double someDouble = Double.valueOf(scan.nextLine());
        System.out.println("Give a boolean:");
        boolean someBoolean = Boolean.valueOf(scan.nextLine());
        
        System.out.println("You gave the string " + someString);
        System.out.println("You gave the integer " + someInteger);
        System.out.println("You gave the double " + someDouble);
        System.out.println("You gave the boolean " + someBoolean);
        
    }
}
