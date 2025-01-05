import java.util.Scanner;

public class MagicalBottles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();

        int bottles = 0;
        int coins = N;

        while (true) {
            if (coins % 2 == 1) {
                // Odd number of coins
                coins = coins * 3 + 1;
            } else {
                // Even number of coins
                coins = coins / 2;
            }
            bottles++;

            if (coins == 4) {
                break;
            }
        }

        System.out.println(bottles-1);
    }
}