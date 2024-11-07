package cetrtiLetnik.Exercise_2;

public class Task2 {
    public static void main(String[] args) {
        int[] e = new int[]{4, 2, 3, 5, 5, 6, 6, 5, 5, 3, 2, 4};
        System.out.println(aliJePalindrom(0, e, new int[e.length / 2], 0));
    }
    public static boolean aliJePalindrom (int i, int[] a, int[] buf, int y) {
        if(i < a.length / 2) {
            buf[i] = a[i];
            return aliJePalindrom(++i, a, buf, y);
        }
        if (a.length % 2 != 0 && y == 0) {
            i++;
            y++;
        }
        if (a.length - 1 == i) {
            return buf[0] == a[i];
        }
        if (buf[buf.length - (i - buf.length) + y - 1] == a[i]) {
            return aliJePalindrom(++i, a, buf, y);
        }
        return false;
    }
}

