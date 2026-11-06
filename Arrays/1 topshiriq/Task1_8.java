public class Task1_8 {
    public static void main(String[] args) {
        int[] array = {4, 5, 7, 8, 6, 9};

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
        
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] % 2 != 0) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
