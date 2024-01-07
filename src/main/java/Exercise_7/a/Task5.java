package Exercise_7.a;
public class Task5 {
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]); // Replace 42 with the integer you want to convert

        // Binary representation
        String binary = Integer.toBinaryString(number);
        System.out.println("Binarno: " + binary);

        // Hexadecimal representation
        String hexadecimal = Integer.toHexString(number);
        System.out.println("Sestnajstisko: 0x" + hexadecimal);

        // Octal representation
        String octal = Integer.toOctalString(number);
        System.out.println("Oktalno: 0" + octal);

    }
}
