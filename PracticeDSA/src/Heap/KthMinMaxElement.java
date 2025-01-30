package Heap;

import java.util.PriorityQueue;

public class KthMinMaxElement {

    public static int kthMinElement(int[] arr, int k){
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int i = 0; i < arr.length; i++) {
            minHeap.offer(arr[i]);
        }

        for (int i = 0; i < k - 1; i++) {
            minHeap.poll();
        }

        return minHeap.poll();
    }

    public static int kthMaxElement(int[] arr, int k){
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b) -> b - a);

        for (int i = 0; i < arr.length; i++) {
            maxHeap.offer(arr[i]);
        }

        for (int i = 0; i < k - 1; i++) {
            maxHeap.poll();
        }

        return maxHeap.poll();
    }

    public static void main(String[] args) {
        int[] arr = {7,10,4,20,15};
        int k = 4;

        int kthMinElement = kthMinElement(arr, k);
        System.out.println(kthMinElement);

        int kthMaxElement = kthMaxElement(arr, k);
        System.out.println(kthMaxElement);
    }
}
