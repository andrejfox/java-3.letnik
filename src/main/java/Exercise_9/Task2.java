package Exercise_9;

public class Task2 {
    public static void main(String[] a) {
        nekaj(Integer.parseInt(a[0]));
    }
    public static void nekaj(int i){
        while(i-- > 0)
            System.out.println( i + " Sem v metodi nekaj(int)" );
    }
}
