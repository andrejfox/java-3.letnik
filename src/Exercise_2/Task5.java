package Exercise_2;

public class Task5 {
    public static void main(String[] args){
        int number = Integer.parseInt(args[0]);
        String binaryStringOfNumber = Integer.toBinaryString(number);

        int lastCharIndex = binaryStringOfNumber.length() - 1;

        int bin1 = binaryStringOfNumber.charAt(lastCharIndex - 3) - '0';
        int bin2 = binaryStringOfNumber.charAt(lastCharIndex - 2) - '0';
        int bin3 = binaryStringOfNumber.charAt(lastCharIndex - 1) - '0';
        int bin4 = binaryStringOfNumber.charAt(lastCharIndex) - '0';

        int numberOfOnes = bin1 + bin2 + bin3 + bin4;
        System.out.println(numberOfOnes);
    }
}
