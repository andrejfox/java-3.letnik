package Exercise_14;

public class Task4a {
    public static void main(String[] args) {
        Task3 magic = new Task3();

        magic.generateRandomArray(30, 20);

        System.out.println("         sort          | com | swa ");
        System.out.println("-----------------------------------");

        magic.resetCounters();
        magic.insertionSort();
        System.out.printf("     insertionSort     | %-3s | %-3s\n", magic.compareCounter, magic.swapCounter);
        System.out.println("-----------------------------------");

        magic.resetCounters();
        magic.unsort();
        magic.selectionSort();
        System.out.printf("     selectionSort     | %-3s | %-3s\n", magic.compareCounter, magic.swapCounter);
        System.out.println("-----------------------------------");

        magic.resetCounters();
        magic.unsort();
        magic.bubbleSortBrezMeje();
        System.out.printf("  bubbleSortBrezMeje   | %-3s | %-3s\n", magic.compareCounter, magic.swapCounter);
        System.out.println("-----------------------------------");

        magic.resetCounters();
        magic.unsort();
        magic.bubbleSort();
        System.out.printf("       bubbleSort      | %-3s | %-3s\n", magic.compareCounter, magic.swapCounter);
        System.out.println("-----------------------------------");

        magic.resetCounters();
        magic.unsort();
        magic.bubbleSortSortedCheck();
        System.out.printf(" bubbleSortSortedCheck | %-3s | %-3s\n", magic.compareCounter, magic.swapCounter);
        System.out.println("-----------------------------------");

        System.out.println();

        magic.unsort();
        magic.arrayPrint();
        magic.insertionSort();
        magic.arrayPrint();
    }
}
