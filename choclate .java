import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChocolateFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) {
            return;
        }

        int n = scanner.nextInt();
        List<Integer> result = new ArrayList<>(n);
        int zeroCount = 0;

        for (int i = 0; i < n && scanner.hasNextInt(); i++) {
            int value = scanner.nextInt();
            if (value == 0) {
                zeroCount++;
            } else {
                result.add(value);
            }
        }

        for (int i = 0; i < zeroCount; i++) {
            result.add(0);
        }

        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i));
            if (i < result.size() - 1) {
                System.out.print(" ");
            }
        }
    }
}