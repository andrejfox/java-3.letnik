package Exercise_8;

public class Task7 {
    static int razredna = 22;
    static void povecajI(int x){
        System.out.println("I v funkciji pred povečanjem: " + x);
        x = x + razredna;
        System.out.println("povečan I v funkciji: " + x);
    }
    public static void main(String[] a){
        int i= 6;

        System.out.println("I pred klicem funkcije " +i);
        povecajI(i);
        System.out.println("I po klicu funkcije " +i);

        // zakaj tako ? Poglejte primer klica :
        povecajI(122); // 122 je konstanta v tem delu programa!!!!
        // ali lahku tu pričakujete povečanje KONSTANTE ?

    }
}
