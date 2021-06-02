
public class MainProgram {

    public static void main(String[] args) {
        Counter counter = new Counter(1);
        counter.increase();
        counter.increase();
        counter.increase();
        System.out.println(counter.value());
    }
}
