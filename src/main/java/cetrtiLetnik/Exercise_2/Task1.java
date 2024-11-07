package cetrtiLetnik.Exercise_2;

public class Task1 {
    public static void main(String[] args) {
        izpisiStevila(3, 9);
    }
    public static void izpisiStevila (int a, int b) {
        if(a<=b) {
            System.out.print(a);
            izpisiStevila(a + 1, b);
        }
    }
}
