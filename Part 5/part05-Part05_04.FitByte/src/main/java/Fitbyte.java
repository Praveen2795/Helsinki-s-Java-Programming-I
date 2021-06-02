/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author prave
 */
public class Fitbyte {
    private int age;
    private int rest;
    
    public Fitbyte(int age, int restingHeartRate){
        this.age = age;
        this.rest = restingHeartRate;
    }
    
    public double targetHeartRate(double percentageOfMaximum){
        double max = 206.3 - (0.711*age);
        return ((max - rest) * percentageOfMaximum + rest); 
    }
}
