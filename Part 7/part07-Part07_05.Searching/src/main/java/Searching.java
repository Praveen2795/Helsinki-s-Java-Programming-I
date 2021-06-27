
import java.util.ArrayList;
import java.util.Scanner;

public class Searching {

    public static void main(String[] args) {
        // The program below is meant for testing the search algorithms you'll write
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
            System.out.println("How many books to create?");
            int numberOfBooks = Integer.valueOf(scanner.nextLine());
        for (int i = 0; i < numberOfBooks; i++) {
            books.add(new Book(i, "name for the book " + i));
        }

        System.out.println("Id of the book to search for?");
        int idToSearchFor = Integer.valueOf(scanner.nextLine());

        System.out.println("");
        System.out.println("Searching with linear search:");
        long start = System.currentTimeMillis();
        int linearSearchId = linearSearch(books, idToSearchFor);
        System.out.println("The search took " + (System.currentTimeMillis() - start) + " milliseconds.");
        if (linearSearchId < 0) {
            System.out.println("Book not found");
        } else {
            System.out.println("Found it! " + books.get(linearSearchId));
        }

        System.out.println("");

        System.out.println("");
        System.out.println("Seaching with binary search:");
        start = System.currentTimeMillis();
        int binarySearchId = binarySearch(books, idToSearchFor);
        System.out.println("The search took " + (System.currentTimeMillis() - start) + " milliseconds.");
        if (binarySearchId < 0) {
            System.out.println("Book not found");
        } else {
            System.out.println("Found it! " + books.get(binarySearchId));
        }

    }

    public static int linearSearch(ArrayList<Book> books, int searchedId) {
        for (Book book: books){
            if(book.getId() == searchedId){
                return books.indexOf(book);
            }
        } return -1;
    }

    public static int binarySearch(ArrayList<Book> books, long searchedId) {
        // initialize variables
        int startIndex = 0;
        int endIndex = books.size() - 1;
        int middleIndex = 0;        

        // perform binary search in this while loop
        while (startIndex <= endIndex) {
            // initialize middle at midpoint of list
            middleIndex = (startIndex + endIndex) / 2;
            
            // determine next search interval,
            // halving search space each iteration
            Book book = books.get(middleIndex);
            int bookId = book.getId();
            if (bookId == searchedId) {
                return middleIndex;
            } else if (bookId < searchedId) {
                startIndex = middleIndex + 1;
            } else if (bookId > searchedId) {
                endIndex = middleIndex - 1;
            }
        }
        return -1;
    }
}
         

