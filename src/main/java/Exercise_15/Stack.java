package Exercise_15;

public class Stack {
    int[] stack;
    private int pointer = 0;
    Stack() {
        this.stack = new int[10];
    }
    Stack(int size) {
        this.stack = new int[size];
    }
    public void push(int num) {
        if (pointer == stack.length) {
            System.out.println("Stack is full!");
            return;
        }
        stack[pointer] = num;
        pointer++;
    }
    public int pop(){
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return 0;
        }
        pointer--;
        int ret = stack[pointer];
        stack[pointer] = 0;
        return ret;
    }
    public boolean isEmpty() {
        return pointer == 0;
    }
    public int peek() {
        if (isEmpty()) return 0;
        return stack[pointer - 1];
    }
}
