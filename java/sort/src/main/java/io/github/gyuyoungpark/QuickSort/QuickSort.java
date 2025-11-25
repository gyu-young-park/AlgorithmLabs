package io.github.gyuyoungpark.QuickSort;

public class QuickSort {
    public static void run(int[] arr) {
        partition(arr, 0, arr.length-1);
    }

    private static void swap(int[] arr, int a, int b) {
        int value = arr[a];
        arr[a] = arr[b];
        arr[b] = value;
    }

    public static void partition(int[] arr, int left, int right) {
        if (left < right) {
            int p = quickSort(arr, left, right);
            partition(arr, left, p-1);
            partition(arr, p+1, right);
        }
    }

    public static int quickSort(int[] arr, int left, int right) {
        int mid = (left + right) / 2;
        swap(arr, left, mid);
        int pivot = left;
        int l = pivot + 1;
        int r = right;
        while ( l <= r ) {
            while (l <= r && arr[l] <= arr[pivot]) l++;
            while (l <= r && arr[r] >= arr[pivot]) r--;
            if (l < r) {
                swap(arr, l, r);
            }
        }
        swap(arr, pivot, r);
        return r;
    }
}
