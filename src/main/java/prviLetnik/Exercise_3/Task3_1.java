package prviLetnik.Exercise_3;

import java.util.Scanner;

public class Task3_1 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number: ");
        int day = scanner.nextInt();

        if (day == 0) throw new Exception("Day in a month 0 is not valid!");
        if (day > 32) throw new Exception("Day in a month cant be bigger that 32!");
        if (day < 0) throw new Exception("Day in a month cant be negative!");

        int dayOfWeek = (day % 32) % 7;

        if (dayOfWeek == 1) System.out.println("Mon");
        if (dayOfWeek == 2) System.out.println("Tue");
        if (dayOfWeek == 3) System.out.println("Sat");
        if (dayOfWeek == 4) System.out.println("Thr");
        if (dayOfWeek == 5) System.out.println("Fri");
        if (dayOfWeek == 6) System.out.println("Sat");
        if (dayOfWeek == 0) System.out.println("Sun");
    }
}
