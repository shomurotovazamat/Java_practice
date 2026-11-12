public class Task1_12 {
    public static void main(String[] args) {
        int[] array = {3, 8, 1, 6, 4, 9, 2};
        int K = 2;
        int L = 5;
        int sum = 0;

        for (int i = K; i <= L; i++) {
            sum += array[i];
        }
        System.out.print(sum);
    }
}
