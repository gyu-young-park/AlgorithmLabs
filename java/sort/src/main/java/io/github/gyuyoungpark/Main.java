package io.github.gyuyoungpark;

import io.github.gyuyoungpark.HeapSort.HeapSort;
import io.github.gyuyoungpark.QuickSort.QuickSort;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // BubbleSort.run(new ArrayList<>(List.of(4,5,2,3,1,7,0,9,-1)));
        int[] arr = {4,5,2,3,1,7,0,9,-1, 100,-13, 55,4,2,38,6,10, 2, 0 ,0 ,1, -10};
        HeapSort.sortPair(arr);
    }
}