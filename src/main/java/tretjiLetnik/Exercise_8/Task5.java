package tretjiLetnik.Exercise_8;

public class Task5 {
    public static void main(String[] args) {


        // tabela
        System.out.printf("%10c |%3c\n",'x','y');
        System.out.printf("%18s\n","-----------");
        for(int x = -5; x<=5;x++)
        {
            int y = (int) Math.signum(x);
            System.out.printf("%10d |%3d\n", x, y);
        }

        // izris : kot na sliki podanega URL
        izrisiFunkcijoSgn(-5,5);

    }
    public static void izrisiFunkcijoSgn(int start, int end){
        System.out.println();
        System.out.println("       |------"+end);
        System.out.println("       |       ");
        System.out.println("-------O-------");
        System.out.println("       |       ");
        System.out.println(start+"-----|       ");


    }

}