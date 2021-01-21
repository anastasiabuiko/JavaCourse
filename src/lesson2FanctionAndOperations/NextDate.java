package lesson2FanctionAndOperations;

import java.util.Scanner;

public class NextDate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите день:");
        int date = scanner.nextInt();
        if (date >31 && date < 1 ) {
            System.out.println("Вы ввели неправильный день");
            return;
        }
        System.out.print("Введите месяц:");
        int month = scanner.nextInt();
        if (month >12 && month<1) {
            System.out.println("Вы ввели неправильный месяц");
            return;
        }
        System.out.print("Введите год:");
        int year = scanner.nextInt();
        if (year<0){
            System.out.println("Вы ввели неверный год");
            return;
        }


        System.out.printf("Ваша дата:%d.%d.%d", date, month,year);
    }
}
