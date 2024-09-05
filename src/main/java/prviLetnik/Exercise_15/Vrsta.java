package prviLetnik.Exercise_15;

import java.util.Arrays;

public class Vrsta {

    public static int n = 0;
    public static int dno = 0;
    public static int vrh = 0;
    static int vrsta[];

    Vrsta(int x){
        n = x;
        vrsta = new int[n];
    }

    public static void dodaj(int x){
        if((vrh+1)%vrsta.length == dno%vrsta.length){
            System.out.println("Polno!");
        }else{
            vrsta[vrh%vrsta.length] = x;
            vrh++;
        }
    }


    public static int odvzemi(){
        if(isEmpty()){
            return -1;
        }else{
            return vrsta[(dno++)%vrsta.length];
        }

    }

    public static int peek(){
        if(!isEmpty())
            return vrsta[(vrh-1)%vrsta.length];
        return -1;
    }

    static boolean isEmpty(){
        if(vrh%vrsta.length == dno%vrsta.length)
            return true;
        return false;
    }

    public static void show(){
        int[] x = new int[vrh-dno];
        int j = 0;
        for(int i = dno; i < vrh; i++){
            x[j] = vrsta[i%vrsta.length];
            j++;
        }
        System.out.println(Arrays.toString(x));
    }



}