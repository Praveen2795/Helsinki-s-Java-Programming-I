
import java.util.Scanner;

public class Program {

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    JokeManager manager = new JokeManager();
   
    UserInterface userInterface = new UserInterface(manager, scanner);
    userInterface.start();
    }
    }





