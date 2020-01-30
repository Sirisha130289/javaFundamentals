package be.intecbrussel.collections.exercises.shoppingCart;

public class Product implements Comparable<Product>{
    private String productName;
    private int productID;
    private int costOfProduct;

    public Product() {
    }

    public Product(String productName, int productID, int costOfProduct) {
        this.productName = productName;
        this.productID = productID;
        this.costOfProduct = costOfProduct;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public int getCostOfProduct() {
        return costOfProduct;
    }

    public void setCostOfProduct(int costOfProduct) {
        this.costOfProduct = costOfProduct;
    }

    @Override
    public String toString() {
        return
                "ProductName='" + productName + '\'' +
                ", ProductID=" + productID ;
    }

    @Override
    public int compareTo(Product o) {
        return this.getProductName().compareTo(o.getProductName());
    }
}
