package prviLetnik.Exercise_5;

public class Task4_For {
    public static void main(String[] args) {
        int x = args[0].length();
        for (int i = x; i > 0; i--) {
            System.out.println(args[0].charAt(x - i));
        }
    }
}
