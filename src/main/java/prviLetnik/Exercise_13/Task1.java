package prviLetnik.Exercise_13;

public class Task1 {
    public static void main(String[] args) {
        long input = 1;
        System.out.println(steviloStevk(input));
    }

    static int steviloStevk(long input) {
        int counter = 1;
        if (input == 0L) {
            return 0;
        } else {
            while((input /= 10L) != 0L) ++counter;
            return counter;
        }
    }

    static int steviloStevk_v2(long input) {
        String inputString = Long.toString(input);
        if (inputString.charAt(0) == '0') return 0;
        return inputString.length();
    }
}
