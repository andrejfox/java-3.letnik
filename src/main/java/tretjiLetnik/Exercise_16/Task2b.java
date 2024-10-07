package tretjiLetnik.Exercise_16;

class Task2b {
    public static void main(String[] arg) {
       char[][] tab = {{'s','o','s','e','d'},
                       {'o','p','e','r','a'},
                       {'k','r','a','v','a'}};

       for (int i = 0; i < tab[0].length; i++) {
           for (char[] chars : tab) {
               System.out.print(chars[i]);
           }
           System.out.println();
       }
    }
}
