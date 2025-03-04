package Heap;

import java.util.PriorityQueue;
import java.util.List;
import java.util.Collections;

//Minimum Total Weight After d Days

public class MinimumTotalWeight {
    public static int findMinWeight(List<Integer> weights, int d) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for (int w : weights) {
            maxHeap.add(w);
        }

        while (d > 0 && !maxHeap.isEmpty()) {
            int maxWeight = maxHeap.poll();
            if (maxWeight == 0) break;
            int remainingWeight = maxWeight - (maxWeight / 2);
            if (remainingWeight > 0) {
                maxHeap.add(remainingWeight);
            }

            d--;
        }
        int totalWeight = 0;
        while (!maxHeap.isEmpty()) {
            totalWeight += maxHeap.poll();
        }
        return totalWeight;
    }
}
