package Exercise_14;

public class Task3 extends Task2 {
    @Override
    public void insertionSort() {
        for (int i = 1; i < array.length; i++) {
            int target = array[i];
            int beforeTarget = i - 1;
            while (beforeTarget >= 0 && array[beforeTarget] > target) {
                array[beforeTarget + 1] = array[beforeTarget];
                counter += 2;
                beforeTarget--;
            }
            array[beforeTarget + 1] = target;
        }
    }
    @Override
    public void selectionSort() {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int targetIndex = i + 1; targetIndex < array.length; targetIndex++) {
                if (array[targetIndex] < array[minIndex]) minIndex = targetIndex;
                counter++;
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
            counter++;
        }
    }
    @Override
    public void bubbleSort() {
        boolean sorted = true;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                sorted = false;
            }
        }
        if (sorted){
            System.out.println("Array is sorted!");
            return;
        }

        boolean swapped;
        for (int i = 0; i < array.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                    counter += 2;
                }
            }
            if (!swapped) break;
        }
    }
}
