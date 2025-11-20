package io.github.gyuyoungpark.MergeSort;

public class MergeSort {
    public static void run(int[] arr) {
        divide(arr,0, arr.length - 1);
        for (var v : arr) {
            System.out.println(v + " ");
        }
    }

    private static void divide(int[] arr, int left, int right) {
        if (left >= right) return;
        int mid = (left + right) / 2;
        divide(arr, left, mid);
        divide(arr, mid+1, right);
        conquer(arr, left, right);
    }

    private static void conquer(int[] arr, int left, int right) {
        int mid = (left + right) / 2;
        int l = left;
        int r = mid + 1;
        int c = left;
        int[] temp = new int[arr.length];
        while (l <= mid && r <= right) {
            if (arr[l] <= arr[r]) {
                temp[c++] = arr[l++];
            } else {
                temp[c++] = arr[r++];
            }
        }
        while (l <= mid) temp[c++] = arr[l++];
        while (r <= right) temp[c++] = arr[r++];
        for (int i = left; i <= right; i++) {
            arr[i] = temp[i];
        }
    }
}
