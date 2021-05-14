
import java.util.Scanner;

public class SpeedingTicket {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give speed:");
        double speed = Double.valueOf(scanner.nextLine());
        if (speed > 120){
            System.out.println("Speeding ticket!");
        }
    }
}
