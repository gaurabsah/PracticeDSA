package Heap;

import java.util.*;

//minimize the total cost of purchasing n items

public class ItemsPurchase {
        public static long findMinimumPrice(List<Integer> price, int m) {
            PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

            for (int p : price) {
                maxHeap.add(p);
            }

            while (m > 0 && !maxHeap.isEmpty()) {
                int highestPrice = maxHeap.poll();
                if (highestPrice == 0) break;
                int discountedPrice = highestPrice - (highestPrice / 2);
                if (discountedPrice > 0){
                    maxHeap.add(discountedPrice);
                }
                m--;
            }

            long totalCost = 0;
            while (!maxHeap.isEmpty()) {
                totalCost += maxHeap.poll();
            }
            return totalCost;
        }

}
