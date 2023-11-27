package Exercise_2;

import java.util.Scanner;

public class Task9_2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number: ");
        int number = scanner.nextInt();

        int fac9 = number + number + number + number + number + number + number + number + number;

        System.out.println(fac9);
    }
}
