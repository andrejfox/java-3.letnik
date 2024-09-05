package prviLetnik.Exercise_15;

import java.util.Arrays;

public class CircleBuffer {
    private final int[] buffer;
    private int guard = 0;
    private int pointer = 0;
    private boolean empty = true;

    public CircleBuffer(int size) {
        this.buffer = new int[size];
    }

    public String show() {
        return Arrays.toString(buffer);
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isFull() {
        return !empty && guard == pointer;
    }

    public int peek() {
        return isEmpty() ? 1 : buffer[guard];
    }

    public int pop() {
        if (isEmpty()) {
            return -1;
        }

        if (guard == buffer.length - 1) {
            if (pointer == 0) {
                empty = true;
            }
            int ret = buffer[guard];
            guard = 0;
            return ret;
        }

        if (pointer - 1 == guard) empty = true;
        return buffer[guard++];
    }

    public void push(int num) {
        if (isFull()) {
            throw new IllegalStateException("Buffer is full!");
        }

        buffer[pointer++] = num;

        if (pointer == buffer.length) {
            pointer = 0;
        }
        empty = false;
    }
}
