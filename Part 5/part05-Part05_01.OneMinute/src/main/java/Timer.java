/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author prave
 */
public class Timer {
    private ClockHand seconds ;
    private ClockHand hundredthsOfSecond ;
    
    public Timer(){
        this.seconds = new ClockHand(60);
        this.hundredthsOfSecond = new ClockHand(100);
    }
    
    public void advance(){
        this.hundredthsOfSecond.advance();
        
        if(this.hundredthsOfSecond.value()==0){
            this.seconds.advance();
        }
    }
    public String toString(){
        return seconds + ":" + hundredthsOfSecond; 
    }   
}
