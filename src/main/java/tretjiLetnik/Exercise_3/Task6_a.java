package tretjiLetnik.Exercise_3;

public class Task6_a {
        public static void main(String[] args) {
            double x1 = Double.parseDouble(args[0]);
            double y1 = Double.parseDouble(args[1]);
            double x2 = Double.parseDouble(args[2]);
            double y2 = Double.parseDouble(args[3]);
            double x = Double.parseDouble(args[4]);
            double y = Double.parseDouble(args[5]);

            boolean znotrajKvadrata = (x >= Math.min(x1, x2) && x <= Math.max(x1, x2) &&
                    y >= Math.min(y1, y2) && y <= Math.max(y1, y2));

            boolean naRobuKvadrata = (x == x1 || x == x2 || y == y1 || y == y2);

            if (znotrajKvadrata) {
                System.out.println("Tocka lezi znotraj kvadrata.");
            } else if (naRobuKvadrata) {
                System.out.println("Tocka lezi na robu kvadrata.");
            } else {
                System.out.println("Tocka lezi izven kvadrata.");
            }
        }
}
