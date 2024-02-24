package Exercise_13;

import java.util.Arrays;
import java.util.Random;

public class Task5_bad {
    static int dolzinaTabele = 7;
    static int index = 4;
    static int min = 1000;
    static int max = 90000;
    static int minIndex = 0;
    static int maxIndex = 0;
    public static void main(String[] args) throws Exception {
        int[] tab = generirajUrejenoTabelo(dolzinaTabele);

        izpisiPredPrvoVrsticoTabele(tab, min, max);
        izpisiPrvoVrsticoTabele(tab);

        try{
            Thread.sleep(2000);
        } catch(InterruptedException ignored){}

        izpisiKazalecTabele(tab, index);
    }

    public static int[] generirajUrejenoTabelo(int length) {
        Random randy = new Random();
        int[] table = new int[length];
        for (int i = 0; i < length; i++) table[i] = randy.nextInt(100000);
        Arrays.sort(table);
        return table;
    }

    public static void izpisiPrvoVrsticoTabele(int[] tabela) {
        for (int element : tabela) System.out.print(element + " ");
        System.out.println();
    }

    public static void izpisiPredPrvoVrsticoTabele(int[] arr, int min, int max) throws Exception {
        if (arr[0] > max || arr[arr.length - 1] < min) {
            throw new Exception("Search range out of bounds!");
        }

        for (int i = 0; i < arr.length; i++) {
            int curCount = Integer.toString(arr[i]).length();
            if (arr[i] >= min) {
                for (int n = 0; n < curCount / 2 - 1; n++) System.out.print(" ");
                if (curCount % 2 != 0) {
                    if (arr[i] >= max) {
                        System.out.print(" ><");
                        for (int n = 0; n < curCount / 2; n++) System.out.print(" ");
                        System.out.println();
                        maxIndex = i;
                        return;
                    }
                    System.out.print(" >");
                    for (int n = 0; n < curCount / 2 + 1; n++) System.out.print(" ");
                } else {
                    if (arr[i] >= max) {
                        System.out.print("><");
                        for (int n = 0; n < curCount / 2; n++) System.out.print(" ");
                        System.out.println();
                        maxIndex = i;
                        return;
                    }
                    System.out.print(">");
                    for (int n = 0; n < curCount / 2 + 1; n++) System.out.print(" ");
                }
                minIndex = i;
                break;
            }

            for (int n = 0; n < curCount + 1; n++) System.out.print(" ");
        }

        for (int i = minIndex + 1; i < arr.length; i++) {
            int curCount = Integer.toString(arr[i - 1]).length();
            if (i == arr.length - 1 || arr[i] <= max && arr[i + 1] > max) {
                for (int n = 0; n < curCount / 2 - 1; n++) System.out.print(" ");
                if (curCount % 2 != 0) {
                    System.out.print(" <");
                    for (int n = 0; n < curCount / 2 + 1; n++) System.out.print(" ");
                } else {
                    System.out.print("<");
                    for (int n = 0; n < curCount / 2 + 1; n++) System.out.print(" ");
                }
                maxIndex = i;
                break;
            }

            for (int n = 0; n < curCount + 1; n++) System.out.print(" ");
        }
        System.out.println();
    }
    public static void izpisiKazalecTabele(int[] tabela, int index) throws Exception {
        for (int i = 0; i < minIndex; i++) {
            int curCount = Integer.toString(tabela[i]).length();
            for(int n = 0; n < curCount + 1; n++) System.out.print(" ");
        }

        for (int i = minIndex; i < index + minIndex || i < maxIndex; i++) {
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

            izpisiPredPrvoVrsticoTabele(tabela, min, max);
            izpisiPrvoVrsticoTabele(tabela);

            for (int z = 0; z <= i; z++) {
                int curCount2 = Integer.toString(tabela[z]).length();
                for(int n = 0; n < curCount2; n++) System.out.print(" ");
                System.out.print(" ");
            }
        }
    }

    public static void clearConsole() {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }
}
