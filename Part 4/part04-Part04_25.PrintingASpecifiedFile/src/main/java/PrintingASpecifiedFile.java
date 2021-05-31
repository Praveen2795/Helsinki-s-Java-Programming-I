
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        // Getting the input from the user for the file name
        System.out.println("Which file should have its contents printed? ");
        String fileName = scanner.nextLine();
        // Using user input as file name to search
        try (Scanner filescanner = new Scanner(Paths.get(fileName))){
            while(filescanner.hasNextLine()){
                String row = filescanner.nextLine();
                System.out.println(row);
            }
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}