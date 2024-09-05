package prviLetnik.Exercise_13;

import java.util.Random;

public abstract class Task2 {
    static int dolzinaTabele = 7;
    static int index = 5;
    public static void main(String[] args) {
        int[] tab = generirajTabelo(dolzinaTabele);

        izpisiPrvoVrsticoTabele(tab);
        izpisiKazalecTabele(tab, index);
    }

    public static int[] generirajTabelo(int length) {
        Random randy = new Random();
        int[] table = new int[length];
        for (int i = 0; i < length; i++) table[i] = randy.nextInt(100000);
        return table;
    }

    public static void izpisiPrvoVrsticoTabele(int[] tabela) {
        for (int element : tabela) System.out.print(element + " ");
        System.out.println();
    }

    public static void izpisiKazalecTabele(int[] tabela, int index) {
        for (int i = 0; i < index - 1; i++) {
            int curCount = Integer.toString(tabela[i]).length();
            for(int n = 0; n < curCount; n++) System.out.print(" ");
            System.out.print(" ");
        }

        for(int n = 0; n < Integer.toString(tabela[index - 1]).length() / 2; n++) System.out.print(" ");
        System.out.println("*");
    }
}