
public class AdvancedAstrology {

    public static void printStars(int number) {
        int i=0;
        while (i < number) {
            System.out.print("*");
            i++;
        }
    }
   
    public static void printSpaces(int number) {
        int i=0;
        while (i<number){
            System.out.print(" ");
            i++;
        }
    }

    public static void printTriangle(int size) {
        for(int i=0;i<=size;i++){
            for(int j=1;j<size;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printStars(4);
        System.out.println("---");
        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
