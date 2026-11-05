public class Task1_4 {
    public static void main(String[] args) {
        int[] array = {2, 7, 6, 5, 8, 99, 12, 35, 62, 18};

        for (int i = 0; i < array.length; i += 2) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = 1; i < array.length; i += 2) {
            System.out.print(array[i] + " ");
        }
    }
}

