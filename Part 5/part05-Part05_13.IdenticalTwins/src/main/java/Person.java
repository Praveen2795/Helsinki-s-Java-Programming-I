
import java.util.Objects;

public class Person {

    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }
    // Comparing the positions of the variables
    public boolean equals(Object compared){
        if(this == compared){
            return true;
        }
        
        //Comparing the type of the objects
        if(!(compared instanceof Person)){
            return false;
        }
        //Converting the object to required type
        Person comparedPerson = (Person) compared;
        
        //Comparing each variable of the person object
        if(this.name.equals(comparedPerson.name) &&
                this.birthday.equals(comparedPerson.birthday) &&
                this.height == comparedPerson.height &&
                this.weight == comparedPerson.weight){
            return true;
        }
        else{
            return false;
        }
    }
}
