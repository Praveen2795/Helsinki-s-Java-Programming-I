
import java.util.Scanner;
public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
        if(number1>number2 && number1>number3){
            return number1;
        }else if (number2>number3){
            return number2;
        }else {
            return number3;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        int num1 = Integer.valueOf(scanner.nextLine());
        System.out.print("Enter the second number: ");
        int num2 = Integer.valueOf(scanner.nextLine());
        System.out.print("Enter the third number: ");
        int num3 = Integer.valueOf(scanner.nextLine());
        
        int result = greatest(num1, num2, num3);
        System.out.println("Greatest: " + result);
    }
}