package Exercise_10;

import java.util.Random;

public class Task2_b {
    private static final Random randi = new Random();
    public static void main(String[] args) {
        char[] arr = generateSamoglasniki(randi.nextInt(11) + 10);

        System.out.print("Vsebina tabele:");
        for (char c : arr) {
            System.out.print(" " + c);
        }
        System.out.println();

        System.out.printf("Prvi dve crki: %s %s\n", arr[0], arr[1]);

        System.out.printf("Zadnji dve crki: %s %s", arr[arr.length - 2], arr[arr.length - 1]);
    }

    public static char[] generateSamoglasniki(int stSamoglasnikov) {
        char[] arr = new char[stSamoglasnikov];

        for (int i = 0; i < stSamoglasnikov; i++) {
            arr[i] = "aeiou".charAt(randi.nextInt(5));
        }

        return arr;
    }
}
