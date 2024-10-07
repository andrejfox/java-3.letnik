package tretjiLetnik.Exercise_13;

import java.util.Arrays;
import java.util.Random;

public class Task5_good {
    static int dolzinaTabele = 20;
    static int target = 26507;
    static int min = 0;
    static int max = 0;
    static int minIndex = 0;
    static int maxIndex = 0;
    public static void main(String[] args) throws Exception {
        int[] tab = generirajUrejenoTabelo(dolzinaTabele);

        try{
            Thread.sleep(2000);
        } catch(InterruptedException ignored){}

        binarySearch(tab, target);
    }

    public static int[] generirajUrejenoTabelo(int length) {
        Random randy = new Random();
        int[] table = new int[length];
        for (int i = 0; i < length; i++) table[i] = randy.nextInt(100000);
        table[0] = target;
        Arrays.sort(table);
        return table;
    }

    public static void izpisiPrvoVrsticoTabele(int[] tabela) {
        for (int element : tabela) System.out.print(element + " ");
        System.out.println();
    }

    public static void izpisiPredPrvoVrsticoTabele(int[] arr, int min, int max) throws Exception {
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
    public static void binarySearch(int[] tabela, int target) throws Exception {
        min = tabela[0];
        max = tabela[tabela.length - 1];
        int delta;
        int pointer;

        for (int i = 0; i < log2(tabela.length) + 1; i++) {
            izpisiPredPrvoVrsticoTabele(tabela, min, max);
            izpisiPrvoVrsticoTabele(tabela);

            delta = maxIndex - minIndex;
            pointer = minIndex + delta / 2;

            try{
                Thread.sleep(2000);
            } catch(InterruptedException ignored){}

            if (tabela[pointer] == target) {
                System.out.print(target + " je v tabeli");
                return;
            } else if (tabela[pointer] < target) {
                min = tabela[pointer];
            } else {
                max = tabela[pointer];
            }

            if (!(i < log2(tabela.length))) clearConsole();
        }
        System.out.print(target + " ni v tabeli");
    }
    public static int log2(int num) {
        return (int)(Math.log(num) / Math.log(2));
    }
    public static void clearConsole() {
        System.out.println();
    }
}
