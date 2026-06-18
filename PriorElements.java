import java.util.*;

public class PriorElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        int count = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (!sc.hasNextInt()) break;
            int x = sc.nextInt();
            if (i == 0 || x > max) {
                count++;
            }
            if (x > max) max = x;
        }
        System.out.println(count);
    }
}
