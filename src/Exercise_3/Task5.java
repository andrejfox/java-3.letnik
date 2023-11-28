package Exercise_3;

public class Task5 {
    public static void main(String[] arg){
        int throw1 = (int)(Math.random()*6+1);
        int throw2 = (int)(Math.random()*6+1);

        String Line1 = null;
        String Line2 = null;
        String Line3 = null;

        switch (throw1) {
            case 1:
                Line1 = "|     |   ";
                Line2 = "|  *  |   ";
                Line3 = "|     |   ";
                break;
            case 2:
                Line1 = "|  *  |   ";
                Line2 = "|     |   ";
                Line3 = "|  *  |   ";
                break;
            case 3:
                Line1 = "|  *  |   ";
                Line2 = "|  *  |   ";
                Line3 = "|  *  |   ";
                break;
            case 4:
                Line1 = "| * * |   ";
                Line2 = "|     |   ";
                Line3 = "| * * |   ";
                break;
            case 5:
                Line1 = "| * * |   ";
                Line2 = "|  *  |   ";
                Line3 = "| * * |   ";
                break;
            case 6:
                Line1 = "| * * |   ";
                Line2 = "| * * |   ";
                Line3 = "| * * |   ";
                break;
            default:
                break;
        }

        switch (throw2) {
            case 1:
                Line1 = Line1 + "|     |";
                Line2 = Line2 + "|  *  |";
                Line3 = Line3 + "|     |";
                break;
            case 2:
                Line1 = Line1 + "|  *  |";
                Line2 = Line2 + "|     |";
                Line3 = Line3 + "|  *  |";
                break;
            case 3:
                Line1 = Line1 + "|  *  |";
                Line2 = Line2 + "|  *  |";
                Line3 = Line3 + "|  *  |";
                break;
            case 4:
                Line1 = Line1 + "| * * |";
                Line2 = Line2 + "|     |";
                Line3 = Line3 + "| * * |";
                break;
            case 5:
                Line1 = Line1 + "| * * |";
                Line2 = Line2 + "|  *  |";
                Line3 = Line3 + "| * * |";
                break;
            case 6:
                Line1 = Line1 + "| * * |";
                Line2 = Line2 + "| * * |";
                Line3 = Line3 + "| * * |";
                break;
            default:
                break;
        }

        System.out.println(" -----     ----- ");
        System.out.println(Line1);
        System.out.println(Line2);
        System.out.println(Line3);
        System.out.println(" -----     ----- ");
    }
}
