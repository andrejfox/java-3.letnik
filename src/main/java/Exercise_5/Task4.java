package Exercise_5;

public class Task4 {
    public static void main(String[] args) {
        int i = 0;
        while (i < args[0].length()) {
            System.out.println(args[0].charAt(i));
            i++;
        }
    }
}
