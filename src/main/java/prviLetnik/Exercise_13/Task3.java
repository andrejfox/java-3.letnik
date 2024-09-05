package prviLetnik.Exercise_13;

public class Task3 extends Task2{
    public static void main(String[] args) {
        int[] tab = generirajTabelo(dolzinaTabele);

        izpisiPrvoVrsticoTabele(tab);

        try{
            Thread.sleep(2000);
        } catch(InterruptedException ignored){}

        izpisiKazalecTabele(tab, index);
    }
}