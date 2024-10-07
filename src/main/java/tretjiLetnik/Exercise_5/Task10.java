package tretjiLetnik.Exercise_5;

public class Task10 {
    public static void main(String[] argsS){
        int args = Integer.parseInt(argsS[0]);

        for(int i = args; i > 0; i--){
            for(int j = 0; j < i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}