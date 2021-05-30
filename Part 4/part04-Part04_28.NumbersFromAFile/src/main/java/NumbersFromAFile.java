

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class NumbersFromAFile {

    public static void main(String[] args) throws IOException {
        // Creating a scanner and array list for storing values
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> finalList = new ArrayList<>();
        // Getting the file name from the user
        System.out.print("File? ");
        String file = scanner.nextLine();
        try(Scanner filescanner = new Scanner(Paths.get(file))){
            while(filescanner.hasNextLine()){
                //Adding the numbers to the array list
                list.add(Integer.valueOf(filescanner.nextLine()));
            }
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        // Using the Collections.sort to sort the numbers in ascending order
        Collections.sort(list);
        // Getting the upper limir and lower limit from the user
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        if(lowerBound==0){
            for(int number:list){
                if(number<=upperBound){
                    finalList.add(number);
                }
            }
        }else{
            for(int number:list){
                if(number>=lowerBound && number<=upperBound){
                    finalList.add(number);
                }
            }
        }
        //Displaying the output             
        System.out.println("Numbers: "+ finalList.size());
        //Checking
        //System.out.println(list);
        //System.out.println(finalList);
        }
}
        

