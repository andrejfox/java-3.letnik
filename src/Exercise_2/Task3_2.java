package Exercise_2;

public class Task3_2 {
    public static void main(String[] args){
        int arg1 = Integer.parseInt(args[0]);
        int arg2 = Integer.parseInt(args[1]);

        int product = arg1 * arg2;

        System.out.printf("Produkt števil %s in %s znaša %s", arg1, arg2, product);
    }
}
