import java.util.Scanner;

public class NumberConcatenation {
    public static void main(String[] args) {
        // HI
        Scanner sc = new Scanner(System.in);
        String x = sc.next();
        String y = sc.next();
        int l1 = x.length();
        String ans1 = "";
        ans1 += x.charAt(l1 - 2);
        ans1 += x.charAt(l1 - 1);
        String ans2 = "";
        ans2 += y.charAt(0);
        ans2 += y.charAt(1);
        int n1 = Integer.parseInt(ans1) * 100;
        int n2 = n1 + Integer.parseInt(ans2);
        System.out.println(n2);
    }
}
