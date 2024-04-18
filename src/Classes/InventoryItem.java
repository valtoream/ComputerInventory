package Classes;
public class InventoryItem {
    private int id;
    private int productId;
    private int quantity;
    private String location;

    public InventoryItem(int id, int productId, int quantity, String location) {
        this.id = id;
        this.productId = productId;
        this.quantity = quantity;
        this.location = location;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "InventoryItem{" +
                "id=" + id +
                ", productId=" + productId +
                ", quantity=" + quantity +
                ", location='" + location + '\'' +
                '}';
    }
}
