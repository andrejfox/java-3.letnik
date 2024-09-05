package prviLetnik.Exercise_2;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("First number: ");
        int number1 = scanner.nextInt();
        System.out.print("Second number: ");
        int number2 = scanner.nextInt();

        String binaryStringOfNumber1 = Integer.toBinaryString(number1);
        int lastCharIndex1 = binaryStringOfNumber1.length() - 1;
        String binaryStringOfNumber2 = Integer.toBinaryString(number2);
        int lastCharIndex2 = binaryStringOfNumber2.length() - 1;

        boolean mach1 = binaryStringOfNumber1.charAt(lastCharIndex1) == binaryStringOfNumber2.charAt(lastCharIndex2);
        boolean mach2 = binaryStringOfNumber1.charAt(lastCharIndex1 - 1) == binaryStringOfNumber2.charAt(lastCharIndex2 - 1);
        boolean mach3 = binaryStringOfNumber1.charAt(lastCharIndex1 - 2) == binaryStringOfNumber2.charAt(lastCharIndex2 - 2);
        boolean mach4 = binaryStringOfNumber1.charAt(lastCharIndex1 - 3) == binaryStringOfNumber2.charAt(lastCharIndex2 - 3);

        int numberOfMatches = 0;

        if (mach1) numberOfMatches++;
        if (mach2) numberOfMatches++;
        if (mach3) numberOfMatches++;
        if (mach4) numberOfMatches++;

        System.out.println("Vneseni stevili se ujemata v " + numberOfMatches + "-ih spodnjih bitih.");
        System.out.printf("%" + (Math.max(lastCharIndex1, lastCharIndex2) + 1) + "s\n", binaryStringOfNumber1);
        System.out.printf("%" + (Math.max(lastCharIndex1, lastCharIndex2) + 1) + "s", binaryStringOfNumber2);
    }
}
