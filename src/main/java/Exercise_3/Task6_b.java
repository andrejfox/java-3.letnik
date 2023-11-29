package Exercise_3;

public class Task6_b {
    public static void main(String[] args) {
        if (args.length != 0) {
            System.out.println("Ta program ne zahteva argumentov ukazne vrstice.");
            return;
        }

        double x1 = Math.random();
        double y1 = Math.random();
        double x2 = Math.random();
        double y2 = Math.random();

        double x = Math.random();
        double y = Math.random();

        boolean znotrajKvadrata = (x >= Math.min(x1, x2) && x <= Math.max(x1, x2) &&
                y >= Math.min(y1, y2) && y <= Math.max(y1, y2));

        boolean naRobuKvadrata = (x == x1 || x == x2 || y == y1 || y == y2);

        if (znotrajKvadrata) {
            System.out.println("Točka leži znotraj kvadrata.");
        } else if (naRobuKvadrata) {
            System.out.println("Točka leži na robu kvadrata.");
        } else {
            System.out.println("Točka leži izven kvadrata.");
        }

        System.out.println("Kvadrat: (" + x1 + ", " + y1 + ") - (" + x2 + ", " + y2 + ")");
        System.out.println("Preverjena točka: (" + x + ", " + y + ")");
    }
}
