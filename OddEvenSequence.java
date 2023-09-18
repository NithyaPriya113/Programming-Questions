import java.util.ArrayList;
import java.util.Scanner;

public class OddEvenSequence {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int k = obj.nextInt();
        ArrayList<Integer> a = new ArrayList<Integer>();
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                a.add(i);
            }
        }
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                a.add(i);
            }
        }
        System.out.println(a.get(k - 1));
    }
}
