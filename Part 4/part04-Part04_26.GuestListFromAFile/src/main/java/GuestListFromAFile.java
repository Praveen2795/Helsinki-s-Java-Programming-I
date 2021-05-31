
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class GuestListFromAFile {

    // main program
    public static void main(String[] args) throws IOException {
        // Creating new scanner and array list
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        // Getting the name of the file from the user
        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        // we create a scanner for reading the file
        try (Scanner filescanner = new Scanner(Paths.get(file))){
            // Reading the contents in the file until empty line
            while(filescanner.hasNextLine()){
                // Adding the lines to the array list
                list.add(filescanner.nextLine());
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Enter names, an empty line quits.");
        while (true) {
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            if (list.contains(name)) {
                System.out.println("The name is on the list.");
            } else {
                System.out.println("The name is not on the list.");
            }
        }
        System.out.println("Thank you!");
    }
}
       