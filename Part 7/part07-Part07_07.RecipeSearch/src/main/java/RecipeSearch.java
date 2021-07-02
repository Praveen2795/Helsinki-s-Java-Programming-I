  
import java.util.Scanner;

public class RecipeSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserInterface UI = new UserInterface(scanner);
        UI.start();
    }
}
