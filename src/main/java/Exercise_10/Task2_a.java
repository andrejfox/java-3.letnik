package Exercise_10;

import java.util.Random;

public class Task2_a {
    public static void main(String[] args) {
        char[] arr = generateSamoglasniki(20);

        System.out.print("Vsebina tabele:");
        for (char c : arr) {
            System.out.print(" " + c);
        }
        System.out.println();

        System.out.printf("Prvi dve crki: %s %s", arr[0], arr[1]);
        System.out.println();

        System.out.printf("Zadnji dve crki: %s %s", arr[arr.length - 2], arr[arr.length - 1]);
    }

    public static char[] generateSamoglasniki(int stSamoglasnikov) {
        Random randi = new Random();
        char[] arr = new char[stSamoglasnikov];

        for (int i = 0; i < stSamoglasnikov; i++) {
            arr[i] = "aeiou".charAt(randi.nextInt(5));
        }

        return arr;
    }
}
