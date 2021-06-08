
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author prave
 */
public class Stack {
    private ArrayList<String> somethings;
    
    public Stack(){
        this.somethings = new ArrayList<>();
    }
    
    public boolean isEmpty(){
        return this.somethings.isEmpty();
    } 
    
    public void add(String value){
        this.somethings.add(value);
    }
    
    public ArrayList<String> values(){
        return this.somethings;
    }
    
    public String take(){
        return this.somethings.remove(this.somethings.size()-1);   
    }
}

