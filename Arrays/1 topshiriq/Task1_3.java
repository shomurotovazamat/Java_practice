public class Task1_3 {
    public static void main(String[] args) {
        int[] array = {2, 7, 6, 5, 8, 99, 12, 35, 62, 18};
        for (int i = array.length - 1; i > 0; i -= 2) {
            System.out.print(array[i] + " ");
        }
    }
}
