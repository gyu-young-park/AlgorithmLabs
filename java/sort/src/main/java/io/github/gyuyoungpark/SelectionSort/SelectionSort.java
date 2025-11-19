package io.github.gyuyoungpark.SelectionSort;

public class SelectionSort {
    public static void run(int[] array) {
        int size = array.length;
        for (int i = 0; i < size; i++) {
            int index = i;
            for (int j = i+1; j < size; j++) {
                if (array[index] > array[j]) {
                    index = j;
                }
            }
            int temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }

        for (int i = 0; i < size; i++) {
            System.out.println(array[i] + " ");
        }
    }
}
