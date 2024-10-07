package tretjiLetnik.Exercise_16;

import java.security.InvalidParameterException;

class Task2d {
    public static void main(String[] arg) {
       char[][] tab = {{'s','o','s','e','d'},
                       {'o','p','e','r','a'},
                       {'k','r','a','v','a'}};

       izpisiStolpec(tab, 6);
    }

    private static void izpisiStolpec(char[][] tab, int colum) {
        if (colum < 1) {
            throw new InvalidParameterException("Colum must be more or equal to 1");
        } else if (colum > tab[0].length) {
            throw new InvalidParameterException("Colum must be less or equal to the size of the array");
        }
        for (char[] chars : tab) {
            System.out.print(chars[colum - 1]);
        }
        System.out.println();
    }
}
