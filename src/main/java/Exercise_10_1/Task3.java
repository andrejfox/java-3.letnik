package Exercise_10_1;

public class Task3 {
    public static void main(String[] args) {
        int x = 2006;
        int[] arr = numToArr(x);

        System.out.printf("Letnica rojstva: %s%s%s%s\n", arr[0], arr[1], arr[2], arr[3]);
        System.out.printf("Razclenjena letnica rojstva: %s - %s - %s - %s", arr[0], arr[1], arr[2], arr[3]);
    }

    public static int[] numToArr(int number) {
        int[] arr = new int[getLengthOfInt(number)];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = getDigitAt(number, i);
        }

        return arr;
    }

    private static int getDigitAt(int number, int index) {
        if (index < 0) return -1;

        int divisor = (int) Math.pow(10, index);
        if (number < divisor) return -1;

        return (number / divisor) % 10;
    }

    private static int getLengthOfInt(int inputInt) {
        if (inputInt == 0) return 1;
        int length = 0;

        while (inputInt != 0) {
            inputInt = inputInt / 10;
            length++;
        }

        return length;
    }
}
