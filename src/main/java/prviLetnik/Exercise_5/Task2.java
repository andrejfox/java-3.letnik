package prviLetnik.Exercise_5;

public class Task2 {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int i = x;

        while (i > 0) {
            int b = x;
            while (b > 0) {
                System.out.print(x);
                b--;
            }
            System.out.printf("\n");
            i--;
        }
    }
}