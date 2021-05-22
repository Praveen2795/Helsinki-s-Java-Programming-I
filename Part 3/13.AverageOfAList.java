
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
    
        while (true){
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }
            list.add(input);
        }
        System.out.println("");
        
        int sum = 0;
        for(int i=0;i<list.size();i++){
            sum = sum + list.get(i);
        }
        System.out.println(sum);
        System.out.println(list.size());
        double avg = sum/((1.0) * list.size());
        System.out.println("Average: " + avg);  
    }
}
