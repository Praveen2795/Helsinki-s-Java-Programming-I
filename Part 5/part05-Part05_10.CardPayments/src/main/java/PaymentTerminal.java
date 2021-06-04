
public class PaymentTerminal {


    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals


    public PaymentTerminal() {
        this.money = 1000; // register initially has 1000 euros of money
    }

    public double eatAffordably(double payment) {
        if (payment>=2.5){
            affordableMeals++;
            this.money = this.money+2.5;
            return payment-2.5;
        } else {
        return payment; // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        }
    }
    public double eatHeartily(double payment) {
        if (payment>=4.30){
           heartyMeals++;
           this.money = this.money+4.30;
           return payment-4.30;
        } else {
         return payment; // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        }
    }
    
    public boolean eatAffordably(PaymentCard card) {
        if(card.balance()>=2.50){
            affordableMeals++;
            return card.takeMoney(2.50);
        } else {
           return false;
        }
    }
    
    public boolean eatHeartily(PaymentCard card) {
        if(card.balance()>=4.30){
            heartyMeals++;
            return card.takeMoney(4.30);
        } else {
            return false;
        }
    }

    public void addMoneyToCard(PaymentCard card, double sum) {
        if(sum > 0){
            card.addMoney(sum);
            this.money = this.money+sum;
        }else {
           ;
        }    
    }

    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
