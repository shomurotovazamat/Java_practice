public class Task1_5 {
    public static void main(String[] args) {
        int[] array = {20, 7, 6, 9, 8, 99, 12, 35, 62, 18};
        int R = 5;
        int closest = array[0];
        int minDistance = Math.abs(R - array[0]);
        int smallNumber = 0;

        for (int i = 0; i < array.length; i++) {
            smallNumber = Math.abs(R - array[i]);

            if (smallNumber < minDistance) {
                closest = array[i];
                minDistance = smallNumber;
            }
        }
        System.out.print(closest);
    }
}


