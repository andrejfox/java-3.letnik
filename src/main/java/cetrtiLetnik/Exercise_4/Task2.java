package cetrtiLetnik.Exercise_4;

import javafx.scene.paint.Color;
import java.util.LinkedList;

public class Task2 {
    public record RTocka(int x, int y, Color barva) {}

    public static void main(String[] args) {
        var ll = new LinkedList<RTocka>();
        for (int i = 5; i < 12; i++) ll.add(new RTocka(i, 5, Color.YELLOW));
        krožniPremik2(ll);
    }

    private static void krožniPremik(LinkedList<RTocka> ll) {
        System.out.println(ll.stream().map((tocka) -> tocka.x).toList());
        for (int i = 0; i < ll.size(); i++) {
            ll.addLast(ll.getFirst());
            ll.removeFirst();
            System.out.println(ll.stream().map((tocka) -> tocka.x).toList());
        }
    }

    private static void krožniPremik2(LinkedList<RTocka> ll) {
        StringBuilder barve = new StringBuilder();
        System.out.println(ll.stream().map(rTocka -> rTocka.x).toList());
        barve.append(ll.stream().map(rTocka -> rTocka.barva).toList()).append("\n");
        for (int i = 0; i < ll.size(); i++) {
            RTocka first = ll.getFirst();
            ll.addLast(new RTocka(first.x + 1, first.y, Color.RED));
            ll.removeFirst();
            System.out.println(ll.stream().map((tocka) -> tocka.x).toList());
            barve.append(ll.stream().map(rTocka -> rTocka.barva).toList()).append("\n");
        }
        System.out.println(barve);
    }
}
