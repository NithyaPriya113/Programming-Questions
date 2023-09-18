import java.util.Scanner;

class UncommonFactors {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int x = obj.nextInt();
        int y = obj.nextInt();
        int max = 0;
        if (x > y)
            max = x;
        else
            max = y;
        for (int i = y; i >= 2; i--) {
            if ((x % i == 0) && !(y % i == 0)) {
                System.out.print(i + " ");
            } else if (!(x % i == 0) && (y % i == 0)) {
                System.out.print(i + " ");
            } else {
                continue;
            }
        }
    }
}