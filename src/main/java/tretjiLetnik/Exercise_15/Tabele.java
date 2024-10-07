package tretjiLetnik.Exercise_15;

public class Tabele {

    public static int[] kopiraj(int[] a){
        int[] c = new int[a.length];
        for(int i = 0; i < a.length; i++){
            c[i] = a[i];
        }
        return c;
    }

    public static int[] dodaj(int[] a, int x){
        int[] c = new int[a.length+1];
        for(int i = 0; i < a.length; i++){
            c[i] = a[i];
        }
        c[c.length-1] = x;
        return c;
    }

    public static int[] izbrisi(int[] a){
        int[] c = new int[a.length-1];
        for(int i = 0; i < c.length; i++){
            c[i] = a[i+1];
        }
        return c;
    }

    public static int[] zmanjsaj(int[] a, int size){
        int[] c = new int[a.length];
        for(int i = 0; i < c.length; i++)
            if(a[i] > size)
                c[i] = a[i]-1;
            else
                c[i] = a[i];
        return c;
    }
}