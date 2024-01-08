package Exercise_5;

public class Task14 {
    public static void main(String[] argsS){
        int args = Integer.parseInt(argsS[0]);

        for(int i = 0; i < args; i++){

            for(int j = args-1; j > i; j--){
                System.out.print("  ");
            }

            for(int k = i; k >= 0; k--){
                System.out.print(k + " ");
            }
            for(int j = 0; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }

        for(int i = args; i > 0; i--){
            for(int k = 0; k < args-i; k++){
                System.out.print("  ");
            }
            for(int j = i; j > 0; j--){
                System.out.print((j - 1)+ " ");
            }
            for(int j = 0; j < i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}