package Exercise_2;

import java.util.Scanner;

public class Task9_3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number: ");
        double number = scanner.nextDouble();

        double fac9 = number / ((double) 1 / 9);

        System.out.println((int) Math.round(fac9));
    }
}
