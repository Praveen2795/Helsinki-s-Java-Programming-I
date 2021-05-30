import java.util.Scanner;

    public class MainProgram {
        public static void main(String[] args) {
            //Scanner code
            Scanner scanner = new Scanner(System.in);
            //Creating new object
        PaymentCard paulsCard = new PaymentCard(20);
        PaymentCard mattsCard = new PaymentCard(30);
            
        paulsCard.eatHeartily();
        System.out.println("Paul: " + paulsCard);
        mattsCard.eatAffordably();
        System.out.println("Matt: " + mattsCard);
        
        paulsCard.addMoney(20);
        System.out.println("Paul: " + paulsCard);
        
        mattsCard.eatHeartily();
        System.out.println("Matt: " + mattsCard);
        
        paulsCard.eatAffordably();
        paulsCard.eatAffordably();
        System.out.println("Paul: " + paulsCard);
        
        mattsCard.addMoney(50);
        System.out.println("Matt: " + mattsCard);                    
        }
    }

