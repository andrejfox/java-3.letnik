package Exercise_13;

import java.util.Random;

public class Task4 {
    static int dolzinaTabele = 7;
    static int index = 4;
    public static void main(String[] args) {
        int[] tab = generirajTabelo(dolzinaTabele);

        izpisiPrvoVrsticoTabele(tab);

        try{
            Thread.sleep(2000);
        } catch(InterruptedException ignored){}

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
        for (int i = 0; i < index; i++) {
            int curCount = Integer.toString(tabela[i]).length();
            for(int n = 0; n < curCount / 2 - 1; n++) System.out.print(" ");

            if (i != index - 1) {
                if (curCount % 2 != 0) {
                    System.out.print(" *");
                } else {
                    System.out.println("*");
                }
            } else {
                System.out.println("/\\");
                return;
            }

            try{
                Thread.sleep(2000);
            } catch(InterruptedException ignored){}

            clearConsole();

            izpisiPrvoVrsticoTabele(tabela);

            for (int z = 0; z <= i; z++) {
                int curCount2 = Integer.toString(tabela[z]).length();
                for(int n = 0; n < curCount2; n++) System.out.print(" ");
                System.out.print(" ");
            }
        }
    }

    public static void clearConsole() {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }
}
