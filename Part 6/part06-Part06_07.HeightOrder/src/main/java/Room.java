
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
public class Room {
    private ArrayList<Person> people;
    
    public Room(){
        this.people = new ArrayList<>();
    }
    
    public void add(Person person){
        this.people.add(person);
    }
    
    public boolean isEmpty(){
        if(this.people.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
    
    public ArrayList<Person> getPersons(){
        return this.people;
    }
    
    public Person shortest(){
        if(this.people.isEmpty()){
            return null;
        }
        Person shortest = this.people.get(0);
        for(Person x : this.people){
            if (shortest.getHeight() > x.getHeight()){
                shortest = x; 
            }
        }return shortest;
    }
    
    public Person take(){
        if(this.people.isEmpty()){
            return null;
        }
        Person shortest = this.people.get(0);
        for(Person x : this.people){
            if (shortest.getHeight() > x.getHeight()){
                shortest = x;
            }
        }this.people.remove(shortest);
        return shortest;
    }
}
