package io.github.gyuyoungpark.bubblesort;

import java.util.List;

public class BubbleSort {
    private static void swap(List<Integer> data,int cur, int next) {
        int temp = data.get(cur);
        data.set(cur, data.get(next));
        data.set(next, temp);
    }

    public static void run(List<Integer> data) {
        for(int i = 0; i < data.size(); i++) {
            for (int j = 0; j < data.size() - i; j++) {
                if (j + i + 1 < data.size()) {
                    int curValue = data.get(j);
                    int nextValue = data.get(j + 1);
                    if (curValue > nextValue) {
                        swap(data, j, j + 1);
                    }
                }
            }
        }
        System.out.println(data);
    }
}
