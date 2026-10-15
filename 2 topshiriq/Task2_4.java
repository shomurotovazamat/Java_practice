// n soni berilgan. Geometrik shaklni ekranga chiqaring.
// n nechta bo'lsa bo'yiga  chiqadigan  yulduzchalar soni ham shuncha bo'lishi kerak.
// Namuna:  n = 5;
public class Task2_4 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
