public class Task1_9 {
    public static void main(String[] args) {
        int[] array = {2, 6, 8, 1, 2, 9, 12, 5, 81, 90};
        int k = 3;

        for (int i = k; i < array.length; i += k) {
            System.out.print(array[i] + " ");
        }
    }
}
