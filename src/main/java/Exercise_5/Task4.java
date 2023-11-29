package Exercise_5;

public class Task4 {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int i = x;

        while (i > 0) {
            System.out.println(args[0].charAt(x - i));
            i--;
        }
    }
}
