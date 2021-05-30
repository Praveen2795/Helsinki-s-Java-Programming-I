/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author prave
 */
public class Book {
    private String name;
    private int noOfPages;
    private int year;
          
public Book (String name,int noOfPages,int year){
    this.name = name;
    this.noOfPages = noOfPages;
    this.year = year;
}    

public String getName(){
    return this.name;
}
    
public int getpages(){
    return this.noOfPages;
}

public int getyear(){
    return this.year;
}

public String toString() {
    return this.name + "," + this.noOfPages + " pages," + this.year; 
}

}
