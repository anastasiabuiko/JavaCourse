package lesson2FanctionAndOperations;

import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите cумму");
        int rubles = scanner.nextInt();

        if (rubles % 10 == 1 && rubles % 100 != 11) {

        } else if ((rubles % 10 >= 2 && rubles % 10 <= 4)
                && !(rubles % 100 >= 12 && rubles % 100 <= 14)) {
            System.out.println(rubles + " рубля");
        } else {
            System.out.println(rubles + " рублей");
        }
    }
}



