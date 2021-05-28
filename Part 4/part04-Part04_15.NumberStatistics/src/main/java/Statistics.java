
public class Statistics {
    private int  count;
    private int  sum;
    
public Statistics(){
    this.count = 0;
    this.sum = 0;
}

public void addNumber(int number){
    this.count++;
    this.sum = this.sum + number;
}

public int getCount(){
    return this.count;
}

public int sum(){
    return this.sum;
}

public double average(){
   if (this.count == 0){
       return 0;
   } else {
       double avg = (this.sum*1.0/this.count*1.0)*1.0;
       return avg;
   }
}
}

