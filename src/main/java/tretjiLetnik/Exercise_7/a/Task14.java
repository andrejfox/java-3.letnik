package tretjiLetnik.Exercise_7.a;

public class Task14 {

    public static void main(String[] args) {
        // Specify the height of the missing object
        int missingObjectHeight = 4;

        // Dimensions
        int numRows = 7;
        int numCols = 21;

        drawRhombus(numRows, numCols, missingObjectHeight);
    }


    private static void drawRhombus(int numRows, int numCols, int missingObjectHeight) {
        for (int row = 0; row < numRows; row++) {
            for (int col = 0; col < numCols; col++) {

                if (row >= (numRows - missingObjectHeight) / 2 &&
                        row < (numRows - missingObjectHeight) / 2 + missingObjectHeight &&
                        col >= (numCols - (row + 1) * 2) / 2 &&
                        col < numCols - (numCols - (row + 1) * 2) / 2) {
                    System.out.print(" ");
                } else {
                    System.out.print("c");
                }
            }
            System.out.println();
        }
    }
}
