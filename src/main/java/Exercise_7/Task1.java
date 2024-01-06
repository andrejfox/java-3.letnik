package Exercise_7;

public class Task1 {
    public static void main(String[] args) {
        char x='O';            // je črka O
        final char y='A';      // to je konstanta
        do{
            x--; x--;
            System.out.print(x);
        } while (x>=y);
    }
}
