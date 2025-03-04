package hakerRank;

import java.util.*;

public class InventoryClearance {
    public static List<String> identifyClearanceItems(List<Product> products) {
        List<String> clearanceItems = new ArrayList<>();
        
        for (Product product : products) {
            if (product.getStockLevel() >= 10 * product.getSalesVelocity()) {
                clearanceItems.add(product.getProductId());
            }
        }
        
        return clearanceItems;
    }
}
