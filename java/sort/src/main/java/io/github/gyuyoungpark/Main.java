package io.github.gyuyoungpark;

import io.github.gyuyoungpark.InsertionSort.InsertionSort;
import io.github.gyuyoungpark.MergeSort.MergeSort;
import io.github.gyuyoungpark.bubblesort.BubbleSort;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // BubbleSort.run(new ArrayList<>(List.of(4,5,2,3,1,7,0,9,-1)));
        int[] arr = {4,5,2,3,1,7,0,9,-1};
        MergeSort.run(arr);
    }
}