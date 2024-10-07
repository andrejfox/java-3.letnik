package tretjiLetnik.Exercise_16;

import java.util.Arrays;

class Task2a {
    public static void main(String[] arg) {
       char[][] tab = {{'s','o','s','e','d'},
                       {'o','p','e','r','a'},
                       {'k','r','a','v','a'}};

       for (char[] row : tab) {
           System.out.println(Arrays.toString(row));
       }
    }
}
