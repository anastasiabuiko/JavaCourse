package lesson2FanctionAndOperations;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год");
        int year = scanner.nextInt();

        if (isLeapYear(year)) {
            System.out.println("Високосный");
        } else {
            System.out.println("Не високосный");
        }
    }
    private static boolean isLeapYear(int year) {
        return year % 4 == 0 && !(year % 100 == 0) || year % 400 == 0;
    }

}


