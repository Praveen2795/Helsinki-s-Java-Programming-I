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
    private int pageCount;
    private String author;
    private String title;
    
    public Book(String author, String name, int pages){
        this.pageCount = pages;
        this.author = author;
        this.title = name;
    }
    
    public String getAuthor(){
        return this.author;
    }
    
    public String getName(){
        return this.title;
    }
    
    public int getPages(){
        return this.pageCount;
    }
    
    public String toString(){
        return this.author+ ", " + this.title+ ", "+ this.pageCount + " pages";
    }
}
