package Exercise_2;

public class Task4_5 {
    public static void main(String[] args){
        boolean x0 = false, y0 = false;
        boolean x1 = false, y1 = true;
        boolean x2 = true,  y2 = false;
        boolean x3 = true,  y3 = true;

        boolean x0NANDy0 = !(x0 && y0);
        boolean x1NANDy1 = !(x1 && y1);
        boolean x2NANDy2 = !(x2 && y2);
        boolean x3NANDy3 = !(x3 && y3);

        System.out.println("   x      y    | x NAND y");
        System.out.println("-------------------------");
        System.out.printf("%-5s   %-5s  |  %s\n", x0, y0, x0NANDy0);
        System.out.printf("%-5s   %-5s  |  %s\n", x1, y1, x1NANDy1);
        System.out.printf("%-5s   %-5s  |  %s\n", x2, y2, x2NANDy2);
        System.out.printf("%-5s   %-5s  |  %s",   x2, y3, x3NANDy3);
    }
}
