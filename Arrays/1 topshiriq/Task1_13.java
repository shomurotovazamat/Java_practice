public class Task1_13 {
    public static void main(String[] args) {
        int[] array = {3, 8, 1, 6, 4, 9, 2};
        int K = 1;
        int L = 2;
        double sum = 0;
        int count = 0;

        for (int i = K; i <= L; i++) {
            sum += array[i];
            count += 1;
        }
        System.out.print(sum / count);
    }
}
