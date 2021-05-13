
import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int firstNo = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int secondNo = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the third number:");
        int thirdNo = Integer.valueOf(scanner.nextLine());
        
        int sum = firstNo+secondNo+thirdNo;
        
        System.out.println("The sum of the numbers is " + sum);
        
    }
}
