# Heap 정렬
힙을 이용해서 정렬하는 방법이다. 

heap은 트리이자, 이진 트리이며, 완전 이진 트리의 특성을 가진다. 따라서, 힙의 높이는 `log(n)`이다. 힙의 특징을 정리하면 다음과 같다.

1. 완전 이진 트리이다. 따라서, 높이는 log(n)이다.
2. 부모가 i이면 자식은 left=i*2, right=i*2+1 이다.
3. 반대로 자식이 i이면 부모는 i/2이다.
4. 최대 힙은 각 부모가 자식보다 큰 값을 가질 때이고, 최소 힙은 각 부모가 자식보다 작은 값을 가질 때이다. 이때 자식들 간의 크기 비교는 하지 않는다.
5. 데이터를 추가할 때는 리프에 넣고 up heapify를 한다.
6. 데이터를 삭제할 때는 루프 데이터를 삭제하고, 가장 끝의 리프를 부모에 넣은 다음 down heapify를 한다.

자바에서의 heap 사용 방법으로는 `PriorityQueue`를 사용하면 된다. 단, `PriorityQueue`는 thread-safe하지 않으므로 thread-safe한 경우가 필요하다면 synchronized 키워드나 `PriorityBlockingQueue`를 사용하는 것이 좋다. 

```java
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
}
```

기본적으로 min heap이기 때문에 max heap을 사용하고 싶다면 `Collections.reverseOrder`를 생성자에 넣어줘야 한다.

```java
public static void upSort(int[] arr) {
    PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(Collections.reverseOrder());
    for(int a: arr) {
        maxHeap.add(a);
    }
    while (!maxHeap.isEmpty()) {
        System.out.print(maxHeap.poll() + " ");
    }
}
```

만약 객체를 넣는다면 객체에 `Comparable<>`를 구현하면 그 기준으로 정렬해준다.
```java
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
```

단 힙정렬은 O(nlogn)을 보장하지만 stable하지 않다는 단점이 있다.