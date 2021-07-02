
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author prave
 */
public class UserInterface {
    private Scanner scanner;
    private ArrayList<Recipe> recipeList = new ArrayList<>(); //Makes a list of all recipes in the file
    
    public UserInterface(Scanner scanner){
        this.scanner = scanner;
    }
    
    public void start(){
        System.out.println("File to read: ");
        String fileName = scanner.nextLine();
        readFile(fileName); //readFile method coded below
        System.out.println("");
        
        
        //User commands
        System.out.println("Commands: ");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("Find cooking time - searches recipes by cooking time");
        System.out.println("Find ingredient - searches recipes by ingredient");
        
        while(true){
            System.out.println("");
            System.out.println("Enter command: ");
            String command = scanner.nextLine().toLowerCase();
            if(command.equals("stop")){
                break;
            }
            //Prints the recipes from the recipeList arraylist in the required format
            else if(command.equals("list")){
                System.out.println("");
                 System.out.println("Recipes:");
                 for(Recipe r: this.recipeList){
                     System.out.println(r);
                 }
            }
            else if(command.equals("find name")){
                System.out.println("Searched word: ");
                String SearchWord = scanner.nextLine().toLowerCase();
                for(Recipe r: this.recipeList){
                    if(r.getName().contains(SearchWord)){
                        System.out.println(r);
                    }
                }
            }
            else if(command.equals("find cooking time")){
                System.out.println("Max cooking time: ");
                int searchTime = Integer.valueOf(scanner.nextLine());
                for(Recipe r: this.recipeList){
                    if(r.getTime() <= searchTime){
                        System.out.println(r);
                    }
                } 
            }
            else if(command.equals("find ingredient")){
                System.out.println("Ingredient: ");
                String searchIngredient = scanner.nextLine().toLowerCase();
                for(Recipe r: this.recipeList){
                    if(r.getIngredients().contains(searchIngredient)){
                        System.out.println(r);
                    }
                }
            }
        }
    }
    //Method for reading the file 
    public void readFile(String fileName) {
        //Created a new scanner for saving the file Name
        try (Scanner fileReader = new Scanner(Paths.get(fileName))) {
            //Loop to get each line from the txt file
            while(fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                //If the line is empty, the loop goes starts from the first to capture the data of next recipe
                if(line.isEmpty()){
                    continue;
                }
                //otherwise, set a name variable to the string on the first line
                String name = line;
                //Set the time which is on the second line to a int variable
                int time = Integer.valueOf(fileReader.nextLine());
                //Next line in the txt file are things needed for making the dish and they are saved in a new arraylist 
                ArrayList<String> things = new ArrayList();
                //Every next line is checked 
                while(fileReader.hasNextLine()){
                    String ingredient = fileReader.nextLine();
                    //If the line is empty, loop is broken
                    if(ingredient.isEmpty()){
                        break;
                    }                    
                    //Otherwise the ingredients are added to the arraylist
                    things.add(ingredient);
                }
                recipeList.add(new Recipe(name, time, things));
            }
        }catch (Exception e){
            System.out.println(e);
        }
    } 
}
