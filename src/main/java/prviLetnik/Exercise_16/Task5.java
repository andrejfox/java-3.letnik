package prviLetnik.Exercise_16;

import java.security.InvalidParameterException;
import java.util.Arrays;

class Task5 {
    public static void main(String[] arg) {
        char[][] tab;
        tab = new char[5][3];
        char[][] primarnaTabela = {{'s','o','s','e','d'},
                                   {'o','p','e','r','a'},
                                   {'k','r','a','v','a'}};

        prepisiTabeloVDrugo(primarnaTabela, tab);

//        tab[0] = Arrays.copyOf(primarnaTabela[0], tab[0].length);
//        tab[1] = Arrays.copyOf(primarnaTabela[1], tab[1].length);
//        tab[2] = Arrays.copyOf(primarnaTabela[2], tab[2].length);

        izpisiTablelo(tab);
    }

    private static void prepisiTabeloVDrugo(char[][] izvorna, char[][] dodelana) {
        if (izvorna.length != dodelana[0].length || izvorna[0].length != dodelana.length) {
            throw new InvalidParameterException("Izvorna ali dodeljena tabela ni pravih velikosti!");
        }
        for (int i = 0; i < izvorna.length; i++) {
            for (int j = 0; j < izvorna[0].length; j++) {
                dodelana[j][i] = izvorna[i][j];
            }
        }
    }

    private static void izpisiTablelo(char[][] tab) {
        for (char[] row : tab) {
            System.out.println(Arrays.toString(row));
        }
    }
}
