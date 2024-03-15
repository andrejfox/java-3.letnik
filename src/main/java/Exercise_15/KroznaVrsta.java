package Exercise_15;

import java.util.Arrays;

public class KroznaVrsta {
    private final int[] vrsta;
    private int guard = 0;
    private int pointer = 0;
    private boolean empty = true;

    public KroznaVrsta(int size) {
        this.vrsta = new int[size];
    }

    public String show() {
        return Arrays.toString(vrsta);
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isFull() {
        return !empty && guard == pointer;
    }

    public int peek() {
        return isEmpty() ? 1 : vrsta[guard];
    }

    public int pop() {
        if (isEmpty()) {
            return -1;
        }

        if (guard == vrsta.length - 1) {
            if (pointer == 0) {
                empty = true;
            }
            int ret = vrsta[guard];
            guard = 0;
            return ret;
        }

        if (pointer - 1 == guard) empty = true;
        return vrsta[guard++];
    }

    public void push(int num) {
        if (isFull()) {
            throw new IllegalStateException("vrsta is full!");
        }

        vrsta[pointer++] = num;

        if (pointer == vrsta.length) {
            pointer = 0;
        }
        empty = false;
    }
}
