package Exercise_3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("First number: ");
        int number1 = scanner.nextInt();
        System.out.print("Second number: ");
        int number2 = scanner.nextInt();
        System.out.print("Tired number: ");
        int number3 = scanner.nextInt();

        Integer[] numbers = {number1, number2, number3};
        Arrays.sort(numbers, Collections.reverseOrder());

        System.out.printf("%s | %s | %s", numbers[0], numbers[1], numbers[2]);

        /*
        if (Math.max(number1, number2)  == number1 && Math.max(number1, number3)  == number1) {
            System.out.print(number1 + " | ");

            if (Math.max(number2, number3) == number2) {
                System.out.print(number2 + " | " + number3);
            } else {
                System.out.print(number3 + " | " + number2);
            }

        } else if (Math.max(number2, number3) == number2) {
            System.out.print(number2 + " | ");

            if (Math.max(number1, number3) == number1) {
                System.out.print(number1 + " | " + number3);
            } else {
                System.out.print(number3 + " | " + number1);
            }

        } else {
            System.out.print(number3 + " | ");

            if (Math.max(number1, number2) == number1) {
                System.out.print(number1 + " | " + number2);
            } else {
                System.out.print(number2 + " | " + number1);
            }
        }
        */
    }
}
