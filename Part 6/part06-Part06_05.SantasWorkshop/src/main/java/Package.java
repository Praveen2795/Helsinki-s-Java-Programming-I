
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
public class Package {
    
    private ArrayList<Gift> somethings;
    
    public Package(){
        this.somethings = new ArrayList<>();
    }
    
    public void addGift(Gift gift){
        this.somethings.add(gift);
    }
    
    public int totalWeight(){
        int sum = 0;
        if(this.somethings.isEmpty()){
            return -1;
        }
        for(Gift eachGift: this.somethings){
            sum = sum + eachGift.getWeight();
        }
        return sum;
    }
}
