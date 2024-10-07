package tretjiLetnik.Exercise_7.a;

import java.util.Random;

public class Task10 {

    public static void main(String[] args) {

        int numRows = 15;
        int numCols = 85;

        Random random = new Random();

        for (int i = 0; i < 15; i++) {
            char randomLetter = generateRandomLowercaseLetter();
            int randomRow = random.nextInt(numRows);
            int randomCol = random.nextInt(numCols);

            displayLetterAt(randomLetter, randomRow, randomCol);
        }
    }

    private static char generateRandomLowercaseLetter() {
        Random random = new Random();
        return (char) (random.nextInt(26) + 'a');
    }


    private static void displayLetterAt(char letter, int row, int col) {
        // Check if the position is within the terminal dimensions
        if (row >= 0 && row < 15 && col >= 0 && col < 85) {
            // Display the letter at the specified position
            StringBuilder emptyLine = new StringBuilder(" ".repeat(85));
            emptyLine.setCharAt(col, letter);
            System.out.println(emptyLine.toString());
        }
    }
}
