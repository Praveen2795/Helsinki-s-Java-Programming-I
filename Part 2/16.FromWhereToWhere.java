
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Where to? ");
        int givenNumber = Integer.valueOf(scanner.nextLine());
        System.out.println("Where from? ");
        int another2Number  = Integer.valueOf(scanner.nextLine());
        for (int i=another2Number;i<=givenNumber;i++){
            System.out.println(i);
        }
    }
}
        
    