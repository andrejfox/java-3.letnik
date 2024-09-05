package prviLetnik.Exercise_7.a;

public class Task11 {

    public static void main(String[] args) {
        // Dimensions
        int numRows = 15;
        int numCols = 80;

        // Draw rectangle
        drawRectangle(numRows, numCols);
    }

    // Method to draw a rectangle with | as sides, - as top and bottom, + as corners
    private static void drawRectangle(int numRows, int numCols) {
        for (int row = 0; row < numRows; row++) {
            for (int col = 0; col < numCols; col++) {
                // Check if it's a corner or a side or the top/bottom
                if ((row == 0 || row == numRows - 1) && (col == 0 || col == numCols - 1)) {
                    System.out.print("+");
                } else if (col == 0 || col == numCols - 1) {
                    System.out.print("|");
                } else if (row == 0 || row == numRows - 1) {
                    System.out.print("-");
                } else {
                    System.out.print(" ");  // Print a space for the inner part
                }
            }
            System.out.println();  // Move to the next line after completing each row
        }
    }
}
