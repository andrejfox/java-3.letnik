package cetrtiLetnik.Exercise_2;

public class Task8 {
    public static void main(String[] args) {
        System.out.println(biggestDevisitor(950, 643534534));
    }

    private static int biggestDevisitor(int num1, int num2) {
        return _biggestDevisitor(num1, num2, Math.min(num1, num2));
    }

    private static int _biggestDevisitor(int num1, int num2, int check) {
        if (num1 % check == 0 && num2 % check == 0) return check;
        return _biggestDevisitor(num1, num2, --check);
    }
}
