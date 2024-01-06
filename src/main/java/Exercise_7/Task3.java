package Exercise_7;

public class Task3 {
    public static void main(String[] args) {
        //[5..30]
        //preberi n
        //inicializiraj števec (nastavi začetno vrednost števca) večkratnikov
        //(inicializiraj generator naključnih števil, če je to potrebno)
        //ponovi petdesetkrat:
        //ustvari naključno število iz intervala [5..30]
        //če je dobljeno število večkratnik števila n, povečaj števec večkratnikov
        //izpiši števec večkratnikov.
        int n = Integer.parseInt(args[0]);
        int factorcounter=0;
        for(int randomcounter=0;randomcounter<50;randomcounter++){
            int random = (int)(Math.random()*50+1);
            if(random%n==0) factorcounter++;
        }
        System.out.println(factorcounter);
    }

}

