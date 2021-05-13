
import java.util.Scanner;

public class BooleanInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write something:");
        Boolean someBoolean = Boolean.valueOf(scanner.nextLine());
        System.out.println("True or false? " + someBoolean);
    }
}
