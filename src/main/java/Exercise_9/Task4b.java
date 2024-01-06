package Exercise_9;

public class Task4b {
    public static void main(String[] args) {
        izpisi(Integer.parseInt(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[2]));
    }

    public static void izpisi(int number1, int number2, int width) {
        //int i=4;
        //for(;i<333;i++){
        //desna pravnava števil v dva stolpca;
        // prvi širine 12, drugi širine 6

        System.out.printf("%" + width + "d%" + width + "d\n", number1, number2);


    }

}