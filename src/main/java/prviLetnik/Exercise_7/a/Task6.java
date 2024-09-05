package prviLetnik.Exercise_7.a;

public class Task6 {
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);

        // Convert the number to a string
        String numberString = Integer.toString(number);

        // Sum of all digits
        int digitSum = 0;

        // Number of digits
        int numberOfDigits = numberString.length();

        // Largest digit
        int largestDigit = Integer.MIN_VALUE;

        // Most frequent digit
        int[] digitCount = new int[10];
        int mostFrequentDigit = -1;
        int maxFrequency = 0;

        for (int i = 0; i < numberOfDigits; i++) {
            char digitChar = numberString.charAt(i);
            int digitValue = Character.getNumericValue(digitChar);

            // Sum of all digits
            digitSum += digitValue;

            // Largest digit
            if (digitValue > largestDigit) {
                largestDigit = digitValue;
            }

            // Most frequent digit
            digitCount[digitValue]++;
            if (digitCount[digitValue] > maxFrequency) {
                mostFrequentDigit = digitValue;
                maxFrequency = digitCount[digitValue];
            }
        }

        System.out.println("Number: " + number);
        System.out.println("Sum of Digits: " + digitSum);
        System.out.println("Number of Digits: " + numberOfDigits);
        System.out.println("Largest Digit: " + largestDigit);
        System.out.println("Most Frequent Digit: " + mostFrequentDigit);
    }
}
