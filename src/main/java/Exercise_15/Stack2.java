package Exercise_15;

public class Stack2 extends Stack{
    final int[] stack;
    private int pointer;
    int start;
    private int size;

    public Stack2() {
        this(10);
    }

    public Stack2(int size) {
        this.stack = new int[size];
    }

    public Stack2(int[] arr, int start, int size) {
        this.stack = arr;
        this.start = start;
        this.pointer = start;
        this.size = size;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return pointer == start;
    }

    @Override
    public boolean isFull() {
        return pointer == stack.length;
    }

    public int getPointer() {
        return pointer;
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
