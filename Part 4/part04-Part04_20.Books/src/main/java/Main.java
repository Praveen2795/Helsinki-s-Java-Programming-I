import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        // Getting info from the user
        while(true){
            System.out.println("Title: ");
            String name = scanner.nextLine();
            if(name.isEmpty()){
                break;
            }
            System.out.println("Pages: ");
            int noOfPages = Integer.valueOf(scanner.nextLine());
            System.out.println("Publication year: ");
            int year = Integer.valueOf(scanner.nextLine());
        // Adding the info into the list created to hold the values
         books.add(new Book(name,noOfPages,year));
        }
        // Displaying the required info
        System.out.println("What information will be printed? ");
        String response = scanner.nextLine();
        
        if(response.equals("everything")){
            for(Book book:books){
                System.out.println(book);
            }
        }else if(response.equals("name")){
            for(Book bookName:books){
                System.out.println(bookName.getName());
            }
        }
    }
}