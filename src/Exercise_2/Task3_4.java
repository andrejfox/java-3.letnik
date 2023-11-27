package Exercise_2;

public class Task3_4 {
    public static void main(String[] args){
        double arg1 = Double.parseDouble(args[0]);
        double arg2 = Double.parseDouble(args[1]);

        double quotient = arg1 / arg2;

        System.out.printf("Količnik števil %s in %s znaša %s", arg1, arg2, quotient);
    }
}
