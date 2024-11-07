package cetrtiLetnik.Exercise_2;

public class Task6 {
    public static void main(String[] args) {
        System.out.println(containsSubString("ecka pecka", "ka"));
    }

    private static int containsSubString(String main, String sub) {
        return containsSubString(main, sub, 0, 0);
    }

    private static int containsSubString(String main, String sub, int i, int ret) {
        if (i > main.length() - sub.length()) return ret;
        return main.startsWith(sub, i) ?
                containsSubString(main, sub, ++i, ++ret) :
                containsSubString(main, sub, ++i, ret);
    }
}
