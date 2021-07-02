
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.nio.file.Paths;

public class Recipe {
    
    //instance varibales
    private String name;
    private int time;
    private ArrayList<String> ingredients;
    
    //Contructors
    public Recipe(String name, int time, ArrayList<String> ingredients){
        this.name = name;
        this.time = time;
        this.ingredients = ingredients;
    }
    
    //setters
    public void setName(String name){
        this.name = name;
    }
    
    public void setTime(int time){
        this.time = time;
    }
    
    public void ingredients(ArrayList<String> ingredients){
        this.ingredients = ingredients;
    } 
    
    //Getters
    public String getName(){
        return this.name;
    }
    
    public int getTime(){
        return this.time;
    }
    
    public ArrayList<String> getIngredients(){
        return this.ingredients;
    }
    
    //Specific format for printing the 
    public String toString(){
        return this.name + ", " + "cooking time: " + this.time;
    }
    
}