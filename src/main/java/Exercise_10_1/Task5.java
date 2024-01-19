package Exercise_10_1;

public class Task5 {
    public static void main(String[] args) {
        int[] t1 = {1,2,3,4};
        int[] t2 = new int[t1.length];
        System.arraycopy(t1, 0, t2, 0, t1.length);

        t2[1] = 6;
        t2[3] = 9;

        int i;
        System.out.print("Prva tabela: ");
        for (i = 0; i < t1.length; i++){
            System.out.print(t1[i] +  " ");
        }
        System.out.println();

        System.out.print("Druga tabela: ");
        for (i = 0; i < t2.length; i++){
            System.out.print(t2[i] +  " ");
        }
    }
}
