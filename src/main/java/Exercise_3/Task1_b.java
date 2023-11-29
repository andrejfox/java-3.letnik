package Exercise_3;

import java.util.Scanner;

public class Task1_b {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("First number: ");
        int number1 = scanner.nextInt();
        System.out.print("Second number: ");
        int number2 = scanner.nextInt();

        if (Math.max(number1, number2) == number1) {
            System.out.println(number1 + " | " + number2);
        } else {
            System.out.println(number2 + " | " + number1);
        }
    }
}
