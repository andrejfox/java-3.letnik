package Exercise_7.a;

import javafx.scene.paint.Color;

public class Task9 {
    public static void main(String[] args) {
        final int numOfShots = 10;
        final int accuracy = 60; //accuracy from center in %
        final int targetSize = 500;

        float sum = 0;
        float[] list = new float[numOfShots];
        for (int i = 0; i < numOfShots; i++) {
            float newShot = (float) Math.round((Math.random() * accuracy / 10 + (10 - (double) accuracy / 10)) * 10) / 10;
            System.out.printf("Shot %2s: %s | %s\n", i + 1, newShot, (float) Math.round(sum * 10) / 10);
            sum += newShot;
            list[i] = newShot;
        }

        float[] max = {0, 0};
        for (int i = 0; i < numOfShots; i++) {
            if (Math.max(max[0], list[i]) != max[0]) {
                max[0] = list[i];
                max[1] = i;
            }
        }
        System.out.printf("Best was: %s (shot: %s)\n", max[0], Math.round(max[1]) + 1);

        float[] min = {10, 0};
        for (int i = 0; i < numOfShots; i++) {
            if (Math.min(min[0], list[i]) != min[0]) {
                min[0] = list[i];
                min[1] = i;
            }
        }
        System.out.printf("Worst was: %s (shot: %s)\n", min[0], Math.round(min[1]) + 1);
        System.out.printf("Result: " + sum);
    }

    private static Color targetColour(int currCircle) {
        return switch (currCircle) {
            case 1, 2 -> Color.YELLOW;
            case 3, 4 -> Color.RED;
            case 5, 6 -> Color.BLUE;
            case 7, 8 -> Color.BLACK;
            case 9, 10 -> Color.WHITE;
            default -> Color.LIME;
        };
    }
}
