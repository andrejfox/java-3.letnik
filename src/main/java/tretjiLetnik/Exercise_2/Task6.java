package tretjiLetnik.Exercise_2;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number: ");
        int number = scanner.nextInt();

        String binaryStringOfNumber = Integer.toBinaryString(number);
        int lastCharIndex = binaryStringOfNumber.length() - 1;

        StringBuilder newBinaryString = new StringBuilder(binaryStringOfNumber);
        newBinaryString.setCharAt(lastCharIndex, '0');
        newBinaryString.setCharAt(lastCharIndex - 1, '0');
        newBinaryString.setCharAt(lastCharIndex - 2, '0');
        newBinaryString.setCharAt(lastCharIndex - 3 , '0');

        int newNumber = Integer.parseInt(String.valueOf(newBinaryString), 2);
        System.out.println("Without last 4 bits: " + newNumber);
        System.out.println(binaryStringOfNumber);
        System.out.println(newBinaryString);
    }
}
