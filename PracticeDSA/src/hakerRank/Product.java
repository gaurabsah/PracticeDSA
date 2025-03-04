package hakerRank;

public class Product implements IProduct{
    String productId;
    int salesVelocity;
    int stockLevel;

    public Product() {
    }

    public Product(String productId, int salesVelocity, int stockLevel) {
        this.productId = productId;
        this.salesVelocity = salesVelocity;
        this.stockLevel = stockLevel;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public int getSalesVelocity() {
        return salesVelocity;
    }

    public void setSalesVelocity(int salesVelocity) {
        this.salesVelocity = salesVelocity;
    }

    public int getStockLevel() {
        return stockLevel;
    }

    public void setStockLevel(int stockLevel) {
        this.stockLevel = stockLevel;
    }
}
