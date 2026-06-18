import java.util.*;

public class Curtains {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextLine()) return;
        String s = sc.nextLine().trim();
        if (!sc.hasNextInt()) return;
        int L = sc.nextInt();
        int n = s.length();
        int max = 0;
        for (int i = 0; i < n; i += L) {
            int end = Math.min(i + L, n);
            int cnt = 0;
            for (int j = i; j < end; j++) if (s.charAt(j) == 'a') cnt++;
            if (cnt > max) max = cnt;
        }
        System.out.println(max);
    }
}
