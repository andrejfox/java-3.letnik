package cetrtiLetnik.Exercise_2;

public class Task7 {
    public static void main(String[] args) {
        System.out.println(turnString("ecka pecka!"));
    }

    private static String turnString(String str) {
        return turnString(str, 1, new StringBuilder());
    }

    private static String turnString(String str, int i, StringBuilder strBuilder) {
        if (i > str.length()) return strBuilder.toString();
        strBuilder.append(str.charAt(str.length() - i));
        return turnString(str, ++i, strBuilder);
    }
}
