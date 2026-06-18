import java.util.*;

public class MysteriousMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNext()) return;
        String Nstr = sc.next();
        if (!sc.hasNextInt()) return;
        int R = sc.nextInt();
        if (R == 0) {
            System.out.println(0);
            return;
        }
        int S = 0;
        for (char c : Nstr.toCharArray()) if (Character.isDigit(c)) S += c - '0';
        int total = S * R;
        while (total >= 10) {
            int t = 0;
            while (total > 0) { t += total % 10; total /= 10; }
            total = t;
        }
        System.out.println(total);
    }
}
