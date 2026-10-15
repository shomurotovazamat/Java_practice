// n soni berilgan. Geometrik shaklni ekranga chiqaring.
// n nechta bo'lsa diaganaliga chiqadigan yulduzchalar soni ham shuncha bo'lishi kerak.

public class task2_3 {
    public static void main(String[] args) {
        int n = 8;
        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j >= i; j--) {
                if (i == j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
