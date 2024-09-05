package prviLetnik.Exercise_2;

public class Task3_4 {
    public static void main(String[] args){
        double arg1 = Double.parseDouble(args[0]);
        double arg2 = Double.parseDouble(args[1]);

        double quotient = arg1 / arg2;

        System.out.printf("Kolicnik stevil %s in %s znasa %s", arg1, arg2, quotient);
    }
}
