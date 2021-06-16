
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
public class TextUI {
    private Scanner scanner;   
    private SimpleDictionary simpleDict;
    
    public TextUI(Scanner scanner, SimpleDictionary simpleDict){
        this.scanner = scanner;
        this.simpleDict = simpleDict;
    }
    
    public void start(){
        while(true){
            System.out.println("Command: ");
            String userInput = scanner.nextLine().toLowerCase();
            if(userInput.equals("end")){
                break;
            }
            if(userInput.equals("add")){
                System.out.println("Word: ");
                String word = scanner.nextLine().toLowerCase();
                System.out.println("Translation: ");
                String translation = scanner.nextLine().toLowerCase();
                simpleDict.add(word, translation);
            }else if(userInput.equals("search")){
                System.out.println("To be translated: ");
                String searchWord = scanner.nextLine().toLowerCase();
                     if(simpleDict.translate(searchWord) == null){
                         System.out.println("Word " + searchWord +" was not found");
                     }else{
                         System.out.println("Translation:" + simpleDict.translate(searchWord));
                     }
            }else{
                System.out.println("Unknown command");
            }
        }
        System.out.println("Bye bye!");
    }
}

