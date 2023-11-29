package Exercise_3;

public class Task7 {
    public static void main(String[] args) {
        int x1 = Integer.parseInt(args[0]);
        int y1 = Integer.parseInt(args[1]);
        int x2 = Integer.parseInt(args[2]);
        int y2 = Integer.parseInt(args[3]);

        int stranica_kvadrata = Math.abs(x2 - x1) * Math.abs(y2 - y1);
        System.out.println("Ploščina kvadrata: " + stranica_kvadrata);

        int polmer_kroga = Math.min(Math.abs(x2 - x1), Math.abs(y2 - y1)) / 2;
        double ploscina_kroga = Math.PI * polmer_kroga * polmer_kroga;
        System.out.println("Ploščina območja z največjo krožnico: " + ploscina_kroga);

        double ploscina_trikotnika = (Math.pow(polmer_kroga, 2) * Math.sqrt(3)) / 4;
        System.out.println("Ploščina največjega enakostraničnega trikotnika: " + ploscina_trikotnika);
    }
}
