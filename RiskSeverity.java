import java.util.*;

public class RiskSeverity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        int[] cnt = new int[3];
        for (int i = 0; i < n; i++) {
            if (!sc.hasNextInt()) break;
            int v = sc.nextInt();
            if (v >= 0 && v <= 2) cnt[v]++;
        }
        boolean first = true;
        StringBuilder sb = new StringBuilder();
        for (int v = 0; v <= 2; v++) {
            for (int k = 0; k < cnt[v]; k++) {
                if (!first) sb.append(' ');
                sb.append(v);
                first = false;
            }
        }
        System.out.println(sb.toString());
    }
}
