package Exercise_5;

public class Task2_For {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);

        for (int i = x; i > 0; i--) {
            int b = x;
            while (b > 0) {
                System.out.print(x);
                b--;
            }
            System.out.printf("\n");
        }
    }
}
