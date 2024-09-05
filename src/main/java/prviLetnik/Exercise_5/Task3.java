package prviLetnik.Exercise_5;

public class Task3 {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int i = x;

        while (i > 1) {
            int num = 0;
            int b = i;

            while (b > 0) {
                num += (int) (b * Math.pow(10, b - 1));
                b--;
            }

            System.out.printf("%" + x + "s\n", num);
            i--;
        }
    }
}
