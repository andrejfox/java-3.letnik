package Exercise_5;

public class Task8 {
    public static  void main(String[] args) {
        System.out.println("   x   |    y");
        System.out.println("---------------");
        for (double i = (- Math.PI / 4); i < (Math.PI / 4); i += 0.1) {
            double y = Math.sin(i);
            System.out.printf("%6.3f | %6.3f\n", i, y);
        }
    }
}
