import java.util.Scanner;

public class paranthesisPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int i = 0;
        int j = s.length() - 1;
        String ans = "";
        String sub = "";
        String prev = "";
        String after = "";

        while (i <= j) {
            if (i == j) {
                prev = s.substring(0, i);
                after = s.substring(j + 1, s.length());
                ans = prev + "(" + s.charAt(i) + ")" + after;
            } else {
                sub = s.substring(i + 1, j);
                if (i > 0) {
                    prev = s.substring(0, i);
                    after = s.substring(j + 1, s.length());
                }
                ans = prev + "(" + s.charAt(i) + ")" + sub + "(" + s.charAt(j) + ")" + after;
            }
            i++;
            j--;
            System.out.println(ans);
        }
    }
}
