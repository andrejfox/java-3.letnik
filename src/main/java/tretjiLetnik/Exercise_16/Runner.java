package tretjiLetnik.Exercise_16;

public class Runner {
    public static void main(String[] args) {
        int[][] primaryArr = {{1, 7, 8, 1, 10},
                              {1, 2, 3, 4, 5},
                              {11, 1, 13, 14, 15}};
        Task6 arr = new Task6(primaryArr);
        System.out.println(arr.columWithSmallestInt().toString());
    }
}
