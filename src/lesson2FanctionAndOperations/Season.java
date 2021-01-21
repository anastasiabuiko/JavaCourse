package lesson2FanctionAndOperations;

import java.util.Scanner;

public class Season {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите порядковый номер месяца");
        int inputValue = scanner.nextInt();

        if (inputValue == 1 || inputValue == 2 || inputValue == 12) {

            System.out.println("Зима");

        } else if (3 <= inputValue && inputValue <= 5) {
            System.out.println("Весна");
        } else if (6<= inputValue && inputValue <= 8) {
            System.out.println("Лето");
        } else if (9 <= inputValue && inputValue <= 11){
            System.out.println("Осень");
        } else
        System.out.println("Нет такого месяца");
    }
}
