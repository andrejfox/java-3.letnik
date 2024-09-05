package prviLetnik.Exercise_3;

public class Task9_c {
    public static void main(String[] args) {
        int Število1 = 9;
        int Število2 = 2;

        int resultFloorDiv = floorDiv(Število1, Število2);
        int resultCeilDiv = ceilDiv(Število1, Število2);

        System.out.println("floorDiv " + resultFloorDiv);
        System.out.println("ceilDiv " + resultCeilDiv);
    }

    public static int floorDiv(int Število1, int Število2) {
        return (int) Math.floor((double) Število1 / Število2);
    }

    public static int ceilDiv(int Število1, int Število2) {
        return (int) Math.ceil((double) Število1 / Število2);
    }
}
