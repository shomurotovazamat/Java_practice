public class Task1_11 {
    public static void main(String[] args) {
        int[] array = {5, 8, 2, 9, 3, 4};
        int last = array[array.length - 1];
        int res = 0;
        for (int i = 0; i < array.length; i++) {
            if (last > array[i]) {
                res = array[i];
                break;
            }
        }
        System.out.print(res);
    }
}
