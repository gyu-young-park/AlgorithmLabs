package io.github.gyuyoungpark.InsertionSort;

public class InsertionSort {

    public static void run(int[] array) {
        int size = array.length;
        for(int i = 1; i < size; i++) {
            while (i - 1 >= 0 && array[i - 1] > array[i]) {
                int temp = array[i];
                array[i] = array[i-1];
                array[i-1] = temp;
                i--;
            }
        }

        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
