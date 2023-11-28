package Exercise_3;

import java.util.Scanner;

public class Task1_a {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("First number: ");
        int number1 = scanner.nextInt();
        System.out.print("Second number: ");
        int number2 = scanner.nextInt();

        String smallerNum;

        if (Math.min(number1, number2) == number1) {
            smallerNum = "First";
        } else {
            smallerNum = "Second";
        }

        System.out.println(smallerNum + " number is smaller.");
    }
}
