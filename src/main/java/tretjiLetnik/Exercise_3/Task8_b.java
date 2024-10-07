package tretjiLetnik.Exercise_3;

public class Task8_b {
    public static void main(String[] args) {
        byte b = 0b0001111;
        System.out.println("15? :> " + b);

        short s = b;
        System.out.println(s);

        int i = s;
        System.out.println(i);

        long l = i;
        System.out.println(l);

        char c = (char) b;
        System.out.println(c);

        float f = i;
        System.out.println(f);

        double d = l;
        System.out.println(d);
    }
}
