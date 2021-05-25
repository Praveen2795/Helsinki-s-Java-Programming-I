
import java.util.Scanner;

public class IsItTrue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Grabbing input from the user
        System.out.println("Give a string: ");
        String userInput = scanner.nextLine();
        //Checking is the user input is correct
        if(userInput.equals("true")){
            System.out.println("You got it right");
        }else{
            System.out.println("Try again!");
        }   
    }
}
