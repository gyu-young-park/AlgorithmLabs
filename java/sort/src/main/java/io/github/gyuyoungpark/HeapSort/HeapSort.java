package io.github.gyuyoungpark.HeapSort;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class HeapSort {
    public static void downSort(int[] arr) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
        for(int a: arr) {
            minHeap.add(a);
        }
        while (!minHeap.isEmpty()) {
            System.out.print(minHeap.poll() + " ");
        }
    }

    public static void upSort(int[] arr) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(Collections.reverseOrder());
        for(int a: arr) {
            maxHeap.add(a);
        }
        while (!maxHeap.isEmpty()) {
            System.out.print(maxHeap.poll() + " ");
        }
    }

    public static void sortPair(int[] arr) {
        PriorityQueue<Pair> minHeap = new PriorityQueue<>();
        for(int a: arr) {
            minHeap.add(new Pair(a, "name: " + a));
        }
        while (!minHeap.isEmpty()) {
            System.out.print(minHeap.poll().name + " ");
        }
    }

    public static class Pair implements Comparable<Pair> {
        public int a;
        public String name;

        public Pair(int a, String name) {
            this.a = a;
            this.name = name;
        }

        @Override
        public int compareTo(Pair o) {
            return a - o.a;
        }
    }
}
