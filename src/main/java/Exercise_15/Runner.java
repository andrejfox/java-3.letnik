package Exercise_15;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.stage.Stage;

import java.util.Arrays;

public class Runner extends Application {
    private static Stage stage;
    public static void main(String[] args) {
//        naloga2();
//        naloga3();
        naloga5(args);
    }

    public static void naloga2() {
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

    public static void naloga3() {
        CircleBuffer buffer = new CircleBuffer(5);

        System.out.printf("peek %s | buffer: %s\n", buffer.peek(), buffer.show());
        System.out.printf("push %s | buffer: %s\n", buffer.pop(), buffer.show());
        System.out.printf("buffer.isEmpty() -> %s\n", buffer.isEmpty());

        System.out.println(" - - - - - - - - - - - - - - - - ");

        buffer.push(2);
        System.out.printf("push %s | buffer: %s\n", 2, buffer.show());
        buffer.push(3);
        buffer.push(4);
        buffer.push(5);
        System.out.println(". . . . .");
        buffer.push(6);
        System.out.printf("push %s | buffer: %s\n", 6, buffer.show());

        System.out.println(" - - - - - - - - - - - - - - - - ");

        System.out.printf("pop %s | buffer: %s\n", buffer.pop(), buffer.show());
        buffer.pop();
        buffer.pop();
        System.out.println(". . . . .");
        System.out.printf("pop %s | buffer: %s\n", buffer.pop(), buffer.show());

        System.out.println(" - - - - - - - - - - - - - - - - ");

        System.out.printf("peek %s | buffer: %s\n", buffer.peek(), buffer.show());

        System.out.println(" - - - - - - - - - - - - - - - - ");

        buffer.push(7);
        System.out.printf("push %s | buffer: %s\n", 7, buffer.show());
        buffer.push(8);
        buffer.push(9);
        System.out.println(". . . . .");
        buffer.push(10);
        System.out.printf("push %s | buffer: %s\n", 10, buffer.show());

        System.out.println(" - - - - - - - - - - - - - - - - ");

        try {
            buffer.push(11);
        } catch (IllegalStateException err) {
            System.out.println("buffer.push(11) -> " + err);
        }
    }

    @Override
    public void start(Stage primaryStage) {
        stage = primaryStage;
        Group root = new Group();
        Canvas canvas = new Canvas(600, 450);
        root.getChildren().add(canvas);
    }

    public static void naloga5(String[] args) {
        Application.launch(FxBuffer.class, args);
    }
}
