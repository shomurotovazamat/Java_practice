public class Task1_7 {
    public static void main(String[] args) {
        int[] array = {4, 5, 7, 8, 6, 9};
        int count = 0;

        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
                count++;
            }
        }

        System.out.println();
        System.out.print("Even numbers = " + count);
    }
}
