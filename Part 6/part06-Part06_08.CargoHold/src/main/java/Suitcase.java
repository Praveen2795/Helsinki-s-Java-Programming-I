
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
public class Suitcase {
    
    private int maxWeight;
    private ArrayList<Item> items;
    
    public Suitcase(int maxWeight){
        this.maxWeight = maxWeight;
        this.items = new ArrayList<Item>();
    }
    
    
    public int totalWeight(){
        int sum = 0;
        for(Item i : items){
            sum = sum + i.getWeight();
        } return sum;
    }
            
    public void addItem(Item item){
        if(totalWeight() + item.getWeight() < this.maxWeight){
            this.items.add(item);
        }else{
            ;
        }
    }
    
    public String toString(){
        int resultWeight = totalWeight(); 
        if(this.items.isEmpty()){
            return "0 items " + "(" + resultWeight + "kg)";
        }
        if(this.items.size() > 1){
            return this.items.size() + " items " + "(" + resultWeight + "kg)";
        } else {
            return this.items.size() + " item " + "(" + resultWeight + "kg)";
        }
    }
    
    public void printItems(){
        for(Item i : this.items){
            System.out.println(i);
        }
    } 
    
    public Item heaviestItem(){
       Item heaviest = this.items.get(0);
       for(Item i : this.items){
           if(heaviest.getWeight() < i.getWeight()){
               heaviest = i;
           }
       } return heaviest;
    }
}
