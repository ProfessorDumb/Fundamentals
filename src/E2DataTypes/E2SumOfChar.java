package E2DataTypes;

import java.util.Scanner;

public class E2SumOfChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            char value = scanner.nextLine().charAt(0);
            int code = (int) value;
            sum += code;

        }
        System.out.printf("The sum equals: %d", sum);

    }
}
