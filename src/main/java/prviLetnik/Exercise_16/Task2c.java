package prviLetnik.Exercise_16;

import java.security.InvalidParameterException;
import java.util.Arrays;

class Task2c {
    public static void main(String[] arg) {
       char[][] tab = {{'s','o','s','e','d'},
                       {'o','p','e','r','a'},
                       {'k','r','a','v','a'}};

       izpisiVrstico(tab, 0);
    }

    private static void izpisiVrstico(char[][] tab, int row) {
        if (row < 1) {
            throw new InvalidParameterException("Row must be more or equal to 1");
        } else if (row > tab.length) {
            throw new InvalidParameterException("Row must be less or equal to the size of the array");
        }
        System.out.println(Arrays.toString(tab[row - 1]));
    }
}
