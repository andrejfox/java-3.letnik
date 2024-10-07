package tretjiLetnik.Exercise_5;

public class Task12 {
    public static void main(String[] argsS){
        int args = Integer.parseInt(argsS[0]);

        for(int i = 0; i < args; i++){
            for(int j = args-1; j > i; j--){
                System.out.print("  ");
            }

            for(int k = i; k >= 0; k--){
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}