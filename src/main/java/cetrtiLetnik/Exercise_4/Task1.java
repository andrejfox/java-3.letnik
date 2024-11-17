package cetrtiLetnik.Exercise_4;

import java.util.LinkedList;

public class Task1 {
    public static void main(String[] args) {
        LinkedList<Integer> lList = new LinkedList<>();

        lList.add(1);
        lList.add(2);
        lList.add(3);
        System.out.println(lList);

        lList.addFirst(0);
        System.out.println(lList);

        lList.addLast(4);
        System.out.println(lList);

        System.out.println("prvi: " + lList.getFirst());
        System.out.println("zadnji: " + lList.getLast());
    }
}
