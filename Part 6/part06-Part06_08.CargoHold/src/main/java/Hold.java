
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
public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> suitcases;
    
    public Hold(int maxWeight){
        this.maxWeight = maxWeight;
        this.suitcases = new ArrayList<Suitcase>();
    }
    
    public int totalWeight(){
        int sum = 0;
        for(Suitcase s : suitcases){
            sum = sum + s.totalWeight();
        } return sum;
    }
    
        public void printItems() {

        for (Suitcase e : this.suitcases) {
            e.printItems();
            }
        }
    
    public void addSuitcase(Suitcase s){
        if(totalWeight() + s.totalWeight() <= maxWeight){
            this.suitcases.add(s);
        } else {
            ;
        }
    }
    
    public String toString() {

        String weightOutput = " (" + totalWeight() + "kg)";
        String suitcaseOutput = "";

        if (this.suitcases.isEmpty()) {
            suitcaseOutput = "no suitcases";
        } else if (this.suitcases.size() == 1) {
            suitcaseOutput = "1 suitcase";
        } else {
            suitcaseOutput = this.suitcases.size() + " suitcases";
        }
        return suitcaseOutput + weightOutput;
    }
  
}
