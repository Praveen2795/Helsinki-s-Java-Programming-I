
import java.util.Scanner;

public class AdditionFormula {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int firstNo = Integer.valueOf(scanner.nextLine()); 
        System.out.println("Give the second number:");
        int secondNo = Integer.valueOf(scanner.nextLine());
        
        int sum = firstNo+secondNo;
        
        System.out.println(firstNo + " + " + secondNo + " = " + sum);

    }
}
