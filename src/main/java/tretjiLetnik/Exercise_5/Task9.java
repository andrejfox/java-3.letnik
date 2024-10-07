package tretjiLetnik.Exercise_5;

public class Task9 {
    public static  void main(String[] args) {
        int val1 = Integer.parseInt(args[0]);
        int val2 = Integer.parseInt(args[1]);
        if(val1 > val2){
            val1 = val1+val2;
            val2 = val1-val2;
            val1 = val1-val2;
        }



        int height = 21;

        for (double i = val1; i <= val2; i += 0.1) {
            double y = Math.sin(i);
            int pozicija = (int) Math.round(((height-1)/2.0)*y);

            for (int j = -10; j <= 10; j++){
                if (j == pozicija){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}
