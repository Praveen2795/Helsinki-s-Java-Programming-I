import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        //Getting info from the user:
        while(true){
            System.out.println("Name: ");
            String name = scanner.nextLine();
            if (name.isEmpty()){
                break;
            }
            System.out.println("Duration: ");
            int time = Integer.valueOf(scanner.nextLine());
            
            programs.add(new TelevisionProgram(name,time));
        }
        //Printing info taken from the user based on his feedback:
        System.out.println();
        System.out.println("Program's maximum duration? ");
        int userChoiceDuration = Integer.valueOf(scanner.nextLine());
        
        for(TelevisionProgram program:programs){
            if(program.getDuration() <= userChoiceDuration){
                System.out.println(program);
            }    
        }

    }
}
