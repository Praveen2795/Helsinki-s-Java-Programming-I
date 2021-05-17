
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int result = 1;
        System.out.println("Give a number:");
        int givenNumber = Integer.valueOf(scanner.nextLine());
        
        for(int i=1;i<=givenNumber;i++){
            result = i*result;
        }
        System.out.println("Factorial: " + result);
    }
}
