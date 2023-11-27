package Exercise_2;

public class Task4_1 {
    public static void main(String[] args){
        boolean x0 = false;
        boolean x1 = true;

        boolean NOTx0 = !x0;
        boolean NOTx1 = !x1;

        System.out.println("  x   | NOT x");
        System.out.println("-------------");
        System.out.printf("%-5s | %s\n", x0, NOTx0);
        System.out.printf("%-5s | %s", x1, NOTx1);
    }
}
