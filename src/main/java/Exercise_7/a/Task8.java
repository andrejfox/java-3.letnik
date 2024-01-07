package Exercise_7.a;

public class Task8 {

    public static void main(String[] args) {
        int haltCounter = 0;
        int usefulNumberCounter = 0;
        boolean masterHalt = false;
        boolean currDigit = false;
        boolean[] digits = new boolean[16];
        int usefulbit = 0;
        for(int randomCounter=0;!masterHalt;randomCounter++) {
            if (!(usefulbit==0)) usefulNumberCounter++;
            usefulbit=0;
            int random = (int) ((Math.random() * Integer.MAX_VALUE) + 1);
            String bitString = Integer.toBinaryString(random);
            bitString = stringParser(bitString);
            //System.out.println("to je nakljucno stevilo: " + bitString);
            for (int counter = 0; counter < 16; counter++) {
                if (digits[counter]) {
                    //System.out.println("To mesto je zapolnjeno: " + counter);

                } else {
                    if(bitString.charAt(counter) == '1') {
                        currDigit = true; //V array položi vrednost posamezne števke.

                        digits[counter] = currDigit;
                        System.out.println("stevilo " + random + " ima 1 uporaben bit");
                        usefulbit++;

                    } else {
                        //System.out.println("stevilo " + random + " nima 1 uporabnega bita");
                    }

                }
            }
            //System.out.println(masterHalt + "to je vrednost masterhalt" + haltCounter);
            for(int i=0;i<16;i++) {
                //System.out.println(digits[i]);
                if (digits[i]==true) {
                    haltCounter++;
                }
                if(haltCounter >= 16) masterHalt=true;



            }
            if(masterHalt) {
                float usefulPrecentage = ((float) usefulNumberCounter /randomCounter)*100;
                System.out.println("vsa mesta so polna: " + usefulbit);
                System.out.println("Vseh generiranih stevil je: " + randomCounter + " Uporabljenih stevil je: " + usefulNumberCounter + " Odstotek uporabljenih stevil je: " + usefulPrecentage + "%");
            }

            haltCounter = 0;
                //če je array poln, se program ustavi

        }

    }

    public static String stringParser(String inputString) {
        int stringLength = inputString.length();
        if (stringLength == 32) {
            inputString = inputString.substring(16);
            return inputString;
        }
        for(; stringLength<32; stringLength++) {
            inputString = "0" + inputString;

        }
        inputString = inputString.substring(16);
        return inputString;


    }
}
