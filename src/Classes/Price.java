package Classes;
import java.math.BigDecimal;
import java.util.Date;

public class Price {
    private int id;
    private int productId;
    private BigDecimal price;
    private BigDecimal discount;
    private Date startDate;
    private Date endDate;

    public Price(int id, int productId, BigDecimal price, BigDecimal discount, Date startDate, Date endDate) {
        this.id = id;
        this.productId = productId;
        this.price = price;
        this.discount = discount;
        this.startDate = startDate;
        this.endDate = endDate;
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

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Price{" +
                "id=" + id +
                ", productId=" + productId +
                ", price=" + price +
                ", discount=" + discount +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}
