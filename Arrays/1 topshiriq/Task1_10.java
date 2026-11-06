public class Task1_10 {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};

        for (int i = 0; i < (array.length) / 2; i++) {
            System.out.print(array[i] + " " + array[array.length - i - 1] + " ");
        }

        if (array.length % 2 != 0) {
            System.out.print(array[array.length / 2]);
        }
    }
}
