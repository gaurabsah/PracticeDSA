package hakerRank;

import java.util.*;

public class InventoryClearanceSale {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("P1", 2, 20));
        products.add(new Product("P2", 1, 5));
        products.add(new Product("P3", 3, 35));

        List<String> clearanceItems = InventoryClearance.identifyClearanceItems(products);
        System.out.println(clearanceItems);
    }
}
