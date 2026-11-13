public class Task1_16 {
    public static void main(String[] args) {
        int[] array = {2, 5, 8, 11, 14};
        int d = array[1] - array[0];
        for (int i = 1; i < array.length - 1; i++) {
            if ((array[i + 1] - array[i]) != d) {
                d = 0;
                break;
            }
        }
        System.out.print(d);
    }
}
