package prviLetnik.Exercise_5;

public class Task16{
    public static void main(String[] argsS){
        int args = Integer.parseInt(argsS[0]);

        for(int i = 0; i < args-1; i++){

            for(int j = args-1; j > i; j--){
                System.out.print("  ");
            }
            System.out.print(i);
            for(int k = i; k > 0; k--){
                System.out.print("  ");
            }
            System.out.print(" ");
            for(int j = 1; j <= i-1; j++){
                System.out.print("  ");
            }
            if(i > 0)System.out.print(i);
            System.out.println();
        }

        for(int i = args; i > 0; i--){
            for(int k = 0; k < args-i; k++){
                System.out.print("  ");
            }
            System.out.print(i-1);
            for(int j = i-1; j > 0; j--){
                System.out.print("  ");
            }
            System.out.print(" ");
            for(int j = 1; j < i-1; j++){
                System.out.print("  ");
            }
            if(i > 1) System.out.print(i-1);
            System.out.println();
        }
    }
}