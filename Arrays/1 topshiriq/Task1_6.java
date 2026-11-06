public class Task1_6 {
    public static void main(String[] args) {
        int[] array = {4, 5, 7, 8, 6, 9};
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.print(array[i] + " ");
                count++;
            }
        }

        System.out.println();
        System.out.print("Odd numbers = " + count);
    }
}
