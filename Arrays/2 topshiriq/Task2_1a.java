import java.util.Arrays;

public class Task2_1a {
    public static void main(String[] args) {
        int n = 10;
        int[] numbers = new int[n];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 2 + 1;
        }
        System.out.println(Arrays.toString(numbers));
    }
}
