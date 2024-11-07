package cetrtiLetnik.Exercise_2;

public class Task3 {
    public static void main(String[] args) {
        System.out.println(min(new int[]{4, 5, 3, 6, 0}));
    }

    private static int min(int[] arr) {
        return min(arr, 0, arr[0]);
    }

    private static int min(int[] arr, int index, int min) {
        if (arr.length - 1 == index) {
            return Math.min(min, arr[index]);
        }
        return min(arr, ++index, Math.min(min, arr[index]));
    }
}
