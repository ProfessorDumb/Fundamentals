package L2DataTypes;

import java.util.Scanner;

public class E4TownInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cityName = scanner.nextLine();
        int population = Integer.parseInt(scanner.nextLine());
        short area = Short.parseShort(scanner.nextLine());

        String result = String.format("Town %s has population of %d and area %d square km.", cityName, population, area);
        System.out.println(result);
    }
}
