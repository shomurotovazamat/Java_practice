public class Task1_14 {
    public static void main(String[] args) {
        int[] array = {3, 8, 1, 6, 4, 9, 2};
        int K = 2;
        int L = 5;
        double sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (i < K || i > L) {
                sum += array[i];
            }
        }

        System.out.print(sum);
    }
}
