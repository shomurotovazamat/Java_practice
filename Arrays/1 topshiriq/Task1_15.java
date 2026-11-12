public class Task1_15 {
    public static void main(String[] args) {
        int[] array = {3, 8, 1, 6, 4, 9, 2};
        int K = 2;
        int L = 5;
        double sum = 0;
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (i < K || i > L) {
                sum += array[i];
                count += 1;
            }
        }
        System.out.print(sum / count);
    }
}
