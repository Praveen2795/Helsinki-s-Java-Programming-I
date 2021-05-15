
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int countOfNumbers = 0;
        
        while (true){
            System.out.println("Give a number:");
            int x = Integer.valueOf(scanner.nextLine());
            
            if (x < 0 || x > 0){
                countOfNumbers = countOfNumbers + 1;
            }
            if (x == 0){
                System.out.println("Number of numbers: " + countOfNumbers);
                break;
            }
        }
    }
}

       
        

