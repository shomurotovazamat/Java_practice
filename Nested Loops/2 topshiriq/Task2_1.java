// n soni berilgan. Geometrik shaklni ekranga chiqaring.
// n nechta bo'lsa diaganaliga chiqadigan  yulduzchalar soni ham shuncha bo'lishi kerak.

public class Task2_1 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    System.out.print(" * ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}
