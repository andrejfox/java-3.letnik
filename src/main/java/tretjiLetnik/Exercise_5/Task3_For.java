package tretjiLetnik.Exercise_5;

public class Task3_For {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);

        for (int i = x; i > 1; i--) {
            int num = 0;

            for (int b = i; b > 0; b--) {
                num += (int) (b * Math.pow(10, b - 1));
            }

            System.out.printf("%" + x + "s\n", num);
        }
    }
}
