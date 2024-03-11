package Exercise_15;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        int[] arr = new int[20];

        Stack2 stack1 = new Stack2(arr, 0, 5);
        Stack2 stack2 = new Stack2(arr, 5, 3);
        Stack2 stack3 = new Stack2(arr, 8, 12);

        stack1.push(7);
        stack1.push(3);

        stack1.push(5);
        System.out.printf("stack1: push %s | stack: %s\n", stack1.peek(), Arrays.toString(readStack(stack1)));

        stack1.push(7);
        System.out.printf("stack1: push %s | stack: %s\n", stack1.peek(), Arrays.toString(readStack(stack1)));

        stack2.push(1);
        stack2.push(2);

        stack2.push(12);
        System.out.printf("stack2: push %s - stack is full | stack: %s\n", stack2.peek(), Arrays.toString(readStack(stack2)));

        System.out.printf("stack3: pop - stack is empty | stack: %s\n", Arrays.toString(readStack(stack3)));

        System.out.println(Arrays.toString(stack1.stack));
    }

    public static int[] readStack(Stack2 stack) {
        return Arrays.copyOfRange(stack.stack, stack.start, stack.start + stack.size());
    }
}
