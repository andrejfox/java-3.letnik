package tretjiLetnik.Exercise_3;

import java.util.Scanner;

public class Task3_2 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number: ");
        int day = scanner.nextInt();

        if (day == 0) throw new Exception("Day in a month 0 is not valid!");
        if (day > 32) throw new Exception("Day in a month cant be bigger that 32!");
        if (day < 0) throw new Exception("Day in a month cant be negative!");

        int dayOfWeek = day % 7;

        switch (dayOfWeek) {
            case 1: System.out.println("Mon"); break;
            case 2: System.out.println("Tue"); break;
            case 3: System.out.println("Wen"); break;
            case 4: System.out.println("Thr"); break;
            case 5: System.out.println("Fri"); break;
            case 6: System.out.println("Sat"); break;
            case 0: System.out.println("Sun"); break;
            default: break;
        }
    }
}
