
public class HealthStation {
    private int weighings;
    
    public int weigh(Person person) {       
    weighings++;
    return person.getWeight() ;
    }
    
    public void feed(Person person){
        person.setWeight(person.getWeight() + 1); 
    }
    
    public int weighings(){
        return weighings;
    } 
}
       
