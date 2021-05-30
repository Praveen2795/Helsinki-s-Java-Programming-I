
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;

public class IsItInTheFile {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        try (Scanner filescanner = new Scanner(Paths.get(file))){
            while(filescanner.hasNextLine()){
                list.add(filescanner.nextLine());
            }
        // Error message is the file is not available
        }catch (Exception e) {
            System.out.println("Reading the file " + e.getMessage() + " failed.");
        }
        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        if (list.contains(searchedFor)){
            System.out.println("Found!");
        }else{
            System.out.println("Not found.");
        }
    }
}
