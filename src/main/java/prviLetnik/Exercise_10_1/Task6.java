package prviLetnik.Exercise_10_1;

import java.util.Objects;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Vnesi stevilo dijakov [25...34]: ");
        int n = scanner.nextInt();

        if (n < 25 || n > 34) {
            System.out.println("Stevilo dijakov ni v intervalu [25...34].");
            return;
        }

        String[] uspehi = new String[n];

        System.out.println("Vnesi uspehe dijakov [nzd, zd, db, pd, odl, neoc]:");

        for (int i = 0; i < n; i++) {
            System.out.print("Dijak " + (i + 1) + ": ");
            String uspeh = scanner.next().toLowerCase();

            String currUspeh = validacijaUspeha(uspeh);
            if (Objects.equals(currUspeh, "/")) {
                System.out.println("Neveljaven vnos, poskusite znova.");
                i--;
            } else {
                uspehi[i] = currUspeh;
            }
        }

        System.out.print("Uspehi: ");
        for (int i = 0; i < uspehi.length; i++) {
            if (i == uspehi.length - 1) System.out.print(uspehi[i]);
            else System.out.print(uspehi[i] + ",");
        }

        formattedPrint(uspehi);
    }

    private static int countOccurrences(String[] array, String value) {
        int count = 0;
        for (String element : array) {
            if (Objects.equals(element, value)) count++;
        }
        return count;
    }

    private static String validacijaUspeha(String uspeh) {
        return switch (uspeh) {
            case "neoc" -> "neoc";
            case "nzd" -> "1";
            case "zd" -> "2";
            case "db" -> "3";
            case "pd" -> "4";
            case "odl" -> "5";
            default -> "/";
        };
    }

    private static void formattedPrint(String[] uspehi) {
        System.out.println("\nNezadostni: " + countOccurrences(uspehi, "1"));
        System.out.println("Zadostni: " + countOccurrences(uspehi, "2"));
        System.out.println("Dobri: " + countOccurrences(uspehi, "3"));
        System.out.println("Pravdobri: " + countOccurrences(uspehi, "4"));
        System.out.println("Odlicni: " + countOccurrences(uspehi, "5"));
        System.out.println("Neocenjeni: " + countOccurrences(uspehi, "neoc"));
    }
}
