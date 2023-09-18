import java.util.Scanner;

public class OddDigitsRange {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int x = obj.nextInt();
        int y = obj.nextInt();
        int k = 0;
        int c = 0;
        for (int i = x; i <= y; i++) {
            int n = i;
            while (n > 0) {
                int r = n % 10;
                if (r % 2 == 0) {
                    k = 0;
                    break;
                } else {
                    k = 1;
                    n /= 10;
                }
            }
            if (k == 1) {
                c = 1;
                System.out.print(i + " ");
            }
        }
        if (c == 0)
            System.out.print("-1");
    }
}
