
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        // implement here a program that reads user input
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 9999) {
                break;
            }
            list.add(input);
        }
        System.out.println();
        int smallestNumber = list.get(0);
        for(int i=0;i<list.size();i++){
            if(smallestNumber>list.get(i)){
                smallestNumber = list.get(i);
                System.out.println("Smallest number: " + smallestNumber);
                for(int j=0;j<list.size();j++){
                     if(list.get(j)==smallestNumber){
                         System.out.println("Found at index: " + j);
                     }
                }
            }
        }
    }
}

