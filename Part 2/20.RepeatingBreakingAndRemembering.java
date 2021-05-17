
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give numbers:");
        int sum = 0;
        int count = 0;
        double avg = 0;
        int nOfE= 0;
        int nOfO= 0;
        while(true){
            int givenNumber = Integer.valueOf(scanner.nextLine());
            
            if(givenNumber==-1){
                break;
            }else if(givenNumber!=-1){
                sum+=givenNumber;
                count+=1;
                avg = 1.0*(sum/count);
                if (givenNumber%2==0){
                    nOfE+=1;
                }else{
                    nOfO+=1;
                }
                continue;
            }
        }
        System.out.println("Thx! Bye!");
        System.out.println("Sum:" + sum);
        System.out.println("Numbers: " + count);
        System.out.println("Average:" + avg);
        System.out.println("Even:" + nOfE);
        System.out.println("Odd:" + nOfO);
    }
}