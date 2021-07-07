import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        UserInterface UI = new UserInterface(scan);
        
        UI.start();

    }

}
