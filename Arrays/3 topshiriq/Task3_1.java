import java.util.Arrays;

public class Task3_1 {
    public static void main(String[] args) {
        int k = 4;
        int[] array = {1, 2, 7, 9};
        int increment = array[k - 1];
        for (int i = 0; i < array.length; i++) {
            array[i] += increment;
        }
        System.out.print(Arrays.toString(array));
    }
}
