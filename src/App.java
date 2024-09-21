import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        final Integer[] numbers = {1,2,3};
        numbers[0] = 6;
        System.out.println(Arrays.toString(numbers));
    }
}
