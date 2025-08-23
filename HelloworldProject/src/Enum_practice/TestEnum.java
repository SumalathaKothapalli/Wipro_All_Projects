package Enum_practice;

import java.util.Scanner;

enum DaysOfWeek {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY
}

public class TestEnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a day of the week: ");
        String input = sc.nextLine().toUpperCase();

        try {
            DaysOfWeek day = DaysOfWeek.valueOf(input);
            System.out.println(day + " is day number " + day.ordinal());

            // Check if weekend
            if(day == DaysOfWeek.SATURDAY || day == DaysOfWeek.SUNDAY) {
                System.out.println(day + " is a weekend.");
            } else {
                System.out.println(day + " is a weekday.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid day name.");
        }

        sc.close();
    }
}

