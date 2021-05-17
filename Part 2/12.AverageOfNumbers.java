
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double  sum = 0;
        int count = 0;
        
        while (true){
            System.out.println("Give a number:");
            double givenNumber = Double.valueOf(scanner.nextLine());
            if (givenNumber > 0 || givenNumber < 0){
                sum = sum+givenNumber;
                count = count+1;
            }          
            if (givenNumber == 0){
                double avg = (sum/count);
                System.out.println("Average of the numbers: "+ avg);
                break;
            }
        }

    }
}
