package prviLetnik.Exercise_2;

public class Task4_3 {
    public static void main(String[] args){
        boolean x0 = false, y0 = false;
        boolean x1 = false, y1 = true;
        boolean x2 = true,  y2 = false;
        boolean x3 = true,  y3 = true;

        boolean x0ORy0 = x0 || y0;
        boolean x1ORy1 = x1 || y1;
        boolean x2ORy2 = x2 || y2;
        boolean x3ORy3 = x3 || y3;

        System.out.println("   x      y    | x OR y");
        System.out.println("-----------------------");
        System.out.printf("%-5s   %-5s  |  %s\n", x0, y0, x0ORy0);
        System.out.printf("%-5s   %-5s  |  %s\n", x1, y1, x1ORy1);
        System.out.printf("%-5s   %-5s  |  %s\n", x2, y2, x2ORy2);
        System.out.printf("%-5s   %-5s  |  %s",   x2, y3, x3ORy3);
    }
}
