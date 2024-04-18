package Classes;
import java.math.BigDecimal;
import java.util.Date;

public class SalesTransaction {
    private int id;
    private Date transactionDate;
    private int productId;
    private int quantity;
    private BigDecimal price;

    public SalesTransaction(int id, Date transactionDate, int productId, int quantity, BigDecimal price) {
        this.id = id;
        this.transactionDate = transactionDate;
        this.productId = productId;
        this.quantity = quantity;
        this.price = price;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
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

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "SalesTransaction{" +
                "id=" + id +
                ", transactionDate=" + transactionDate +
                ", productId=" + productId +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}
