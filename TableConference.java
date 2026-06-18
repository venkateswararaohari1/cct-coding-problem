import java.util.*;
import java.math.BigInteger;

public class TableConference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int N = sc.nextInt();
        if (N < 2) {
            System.out.println(0);
            return;
        }
        BigInteger fact = BigInteger.ONE;
        for (int i = 1; i <= N - 1; i++) fact = fact.multiply(BigInteger.valueOf(i));
        fact = fact.multiply(BigInteger.valueOf(2));
        System.out.println(fact.toString());
    }
}
