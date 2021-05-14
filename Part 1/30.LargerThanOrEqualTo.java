
import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Give the first number:");
        int firstNo = Integer.valueOf(scan.nextLine());
        
        System.out.println("Give the second number:");
        int secondNo = Integer.valueOf(scan.nextLine());
        
        if (firstNo > secondNo){
            System.out.println("Greater number is: " + firstNo);
        } else if (firstNo == secondNo) {
            System.out.println("The numbers are equal!");
        } else {
            System.out.println("Greater number is: " + secondNo);
        }
    }
}
