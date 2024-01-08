package Exercise_5;

public class Task11 {
    public static void main(String[] argsS){
        int args = Integer.parseInt(argsS[0]);

        for(int i = args; i > 0; i--){
            for(int k = 0; k < args-i; k++){
                System.out.print("  ");
            }
            for(int j = i; j > 0; j--){
                System.out.print((j - 1)+ " ");
            }
            System.out.println();
        }
    }
}