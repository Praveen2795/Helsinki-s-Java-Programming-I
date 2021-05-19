
public class Averaging {

    // implement the sum method here again
    public static int sum(int number1, int number2, int number3, int number4) {
        int summation = number1+number2+number3+number4;
        return summation;
    }

    public static double average(int number1, int number2, int number3, int number4) {
        int addedValue = sum(number1,number2,number3,number4);
        double avg = addedValue /4.0; 
        return avg;
    }

    public static void main(String[] args) {
        double result = average(4, 3, 6, 1);
        System.out.println("Average: " + result);
    }
}
