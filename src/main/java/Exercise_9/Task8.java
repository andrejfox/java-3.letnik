package Exercise_9;

public class Task8 {
    public static void main(String[] args) {
       izracunaj(666);
    }
    public static void izracunaj(int start){
        int number=start;
        for(start=start-1;start>0;--start) {
            System.out.println(number);
            number+=start;
        }
        System.out.println(number);
    }
    public static void izracunaj(int start, int end) {
        int number=start;
        for(start=start; start<=end; start++) {
            number+=start;
        }
        System.out.println(number);
    }
    public static void izracunaj(int start,int end, int frequency){
        int number=start;
        for(;start<end;start=start+frequency) {
            number+=start;
        }
        System.out.println(number);
    }

    }

