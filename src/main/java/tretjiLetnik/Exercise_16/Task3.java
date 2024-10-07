package tretjiLetnik.Exercise_16;

import java.util.Arrays;

class Task3 {
    public static void main(String[] arg) {
        char tab[][] = new char[3][5];

        char[][] primarnaTabela = {{'s','o','s','e','d'},
                                   {'o','p','e','r','a'},
                                   {'k','r','a','v','a'}};
        tab[0] = Arrays.copyOf(primarnaTabela[0], tab[0].length);
        tab[1] = Arrays.copyOf(primarnaTabela[1], tab[1].length);
        tab[2] = Arrays.copyOf(primarnaTabela[2], tab[2].length);

        izpisiTablelo(tab);
    }

    private static void izpisiTablelo(char[][] tab) {
        for (char[] row : tab) {
            System.out.println(Arrays.toString(row));
        }
    }
}
