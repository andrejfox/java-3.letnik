package Exercise_5;

public class Task13 {
    public static void main(String[] argsS){
        int args = Integer.parseInt(argsS[0]);

        for(int i = 0; i < args; i++){
            for(int j = 0; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}