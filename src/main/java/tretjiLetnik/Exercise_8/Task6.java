package tretjiLetnik.Exercise_8;

public class Task6 {
    static void povecajI(int x){
        System.out.println("I v funkciji pred povečanjem: " + x);
        x = x + 1;
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


        //ODGOVOR: Konstanta i je v metodi predstavljena kot X. Ko se x poveča ni razloga, da bi se enako zgodilo tudi z i
        //Pri povecaj 122 bo 122 ostalo 122, ker nima zveze z drugo metodo. Ni razloga, da bi bili spremenljivko i in x povezani in sinhronizirani.
    }
}
