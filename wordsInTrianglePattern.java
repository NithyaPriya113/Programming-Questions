import java.util.*;

public class wordsInTrianglePattern {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String s = obj.nextLine();
        String[] st = s.split(" ");
        for (int i = 0; i < st.length; i++) {
            String ans = "";
            for (int j = 0; j < st[i].length(); j++) {
                ans = ans + st[i].charAt(j);
                System.out.println(ans);
            }
        }
    }
}
