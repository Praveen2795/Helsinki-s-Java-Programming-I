/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author prave
 */
public class PaymentCard {
    private double balance;


public PaymentCard(double openingBalance){
    this.balance = openingBalance;
}

public String toString(){
    return "The card has a balance of " + this.balance + " euros";
}

public void eatAffordably(){
    this.balance = this.balance-2.60;
    if (this.balance < 0){
        this.balance = this.balance+2.60;
    }
    
}

public void eatHeartily(){
    this.balance = this.balance-4.60;
    if (this.balance < 0){
        this.balance = this.balance+4.60;
    }
}

public void addMoney(double amount){
    double x = this.balance + amount;
    if (amount < 0){
    this.balance = this.balance;
    } else {
        if(x > 150){
            this.balance = 150;
        } else{
            this.balance = x;
        }
    } 
}
}

