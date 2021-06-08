
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }

    public void addMeal(String meal){
        if(!(this.meals.contains(meal))){
            this.meals.add(meal);
        }else{
            ;
        }           
    }
    
    public void printMeals(){
        for(String food :this.meals){
            System.out.println(food);
        }
    }
    
    public void clearMenu(){
        this.meals.clear();
    }
    
   // public boolean equals(Object compared){
        //Comparing positions
        
    //}
}
