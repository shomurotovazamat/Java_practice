public class Task1_17 {
    public static void main(String[] args) {
        int[] array = {2, 6, 18, 54};
        double q = (double) array[1] / array[0];
        for (int i = 1; i < array.length - 1; i++) {
            if ((double) array[i + 1] / array[i] != q) {
                q = 0;
                break;
            }
        }
        System.out.print(q);
    }
}
