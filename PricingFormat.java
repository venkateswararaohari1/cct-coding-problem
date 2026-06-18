import java.util.*;

public class PricingFormat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNext()) return;
        String s = sc.next();
        long prod = 1;
        for (char c : s.toCharArray()) {
            if (!Character.isDigit(c)) continue;
            prod *= (c - '0');
        }
        System.out.println(prod);
    }
}
