package cetrtiLetnik.Exercise_2;

public class Task9 {
    public static void main(String[] args) {
        System.out.println(factorial(4));
    }

    private static int factorial(int num) {
        if (num == 1) return 1;
        return factorial(num - 1) * num;
    }
}
