package cetrtiLetnik.Exercise_2;

public class Task5 {
    private static String str = "";

    public static void main(String[] args) {
        System.out.println(pal("1234", false));
        System.out.println(pal("1234", true));
        System.out.println(pal(1234, false));
        System.out.println(pal(1234, true));
        
    }

    private static String pal(String s, boolean sod) {
        str = "";
        return pal(s, sod, 0);
    }

    private static int pal(int num, boolean sod) {
        str = "";
        return Integer.parseInt(pal(String.valueOf(num), sod, 0));
    }

    private static String pal(String s, boolean sod, int i) {
        if (i < s.length()) {
            str = str + s.charAt(i);
            pal(s, sod, i + 1);
            if (!sod && i == s.length() - 1) str = str.substring(0, str.length() - 1);
            str = str + s.charAt(i);
        }
        return str;
    }
}
