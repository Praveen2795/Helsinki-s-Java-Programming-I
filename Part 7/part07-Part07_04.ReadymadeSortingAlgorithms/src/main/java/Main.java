
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;



public class Main {

    public static void main(String[] args) {
        // Creating required arrays and lists
        int[] array = {3, 1, 5, 99, 3, 12};
        String[] names = {"Praveen", "Gowtham", "Keshav", "Suhail"};
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(8);
        numbers.add(3);
        numbers.add(7);
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Chennai");
        cities.add("Rochester");
        cities.add("Mumbai");
        
        // array of integers
        System.out.println("Array of integers");
        System.out.println(Arrays.toString(array));
        sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println("");
        
        // Another sorting method to sort strings
        System.out.println("Array of strings");
        System.out.println(Arrays.toString(names));
        sort(names);
        System.out.println(Arrays.toString(names));
        System.out.println("");
        
        //// Use method to sort an ArrayList of numbers
        System.out.println("Array List of numbers");
        System.out.println(numbers);
        sortIntegers(numbers);
        System.out.println(numbers);
        System.out.println("");

        // Another method to sort an ArrayList of strings        
        System.out.println("Array List of Strings");
        System.out.println(cities);
        sortStrings(cities);
        System.out.println(cities);
        System.out.println("");
    }
    // Sorting the values from default utilities
    public static void sort(int[] array){
        Arrays.sort(array);
    }
    
    public static void sort(String[] names) {
        Arrays.sort(names);
    }
    
    public static void sortIntegers(ArrayList<Integer> numbers){
        Collections.sort(numbers);
    }
    
    public static void sortStrings(ArrayList<String> cities){
        Collections.sort(cities);
    }
}
