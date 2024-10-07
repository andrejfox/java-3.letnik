package tretjiLetnik.Exercise_15;

public class Stack {
    private final int[] stack;
    private int pointer = 0;

    public Stack() {
        this(10);
    }

    public Stack(int size) {
        this.stack = new int[size];
    }

    public int size() {
        return stack.length;
    }
    public int getPointer() {
        return pointer;
    }

    public boolean isEmpty() {
        return pointer == 0;
    }

    public boolean isFull() {
        return pointer == stack.length;
    }

    public void push(int num) {
        if (isFull()) {
            throw new IllegalStateException("Stack is full!");
        }
        stack[pointer] = num;
        pointer++;
    }

    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty!");
        }
        pointer--;
        int ret = stack[pointer];
        stack[pointer] = 0;
        return ret;
    }

    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty!");
        }
        return stack[pointer - 1];
    }
}
