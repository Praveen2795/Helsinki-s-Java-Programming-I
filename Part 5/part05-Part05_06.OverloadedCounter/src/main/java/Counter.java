/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author prave
 */
public class Counter {
    private int startValue;
    
    public Counter(int startValue){
        this.startValue = startValue;
    }
    
    public Counter(){
        this.startValue = 0;
    }
    
    public int value(){
        return this.startValue;
    }
    
    public void increase(){
        this.startValue = this.startValue+1;
    }
    
    public void decrease(){
        this.startValue = this.startValue-1;
    }
    
    public void increase(int increaseBy){
        if(increaseBy<0){
            this.startValue = this.startValue;
        } else {
        this.startValue = this.startValue + increaseBy;
        }
    }
    
    public void decrease(int decreaseBy){
        if(decreaseBy<0){
            this.startValue = this.startValue;
        } else {
        this.startValue = this.startValue - decreaseBy; 
        }
    }
    boolean Value() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
