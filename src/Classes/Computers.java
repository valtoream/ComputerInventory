package Classes;
import java.util.Date;

public class Computers {
    private int id;
    private int brandId;
    private String model;
    private String serialNumber;
    private Date purchaseDate;
    private int userId;
    private int categoryId;

    public Computers(int id, int brandId, String model, String serialNumber, Date purchaseDate, int userId, int categoryId) {
        this.id = id;
        this.brandId = brandId;
        this.model = model;
        this.serialNumber = serialNumber;
        this.purchaseDate = purchaseDate;
        this.userId = userId;
        this.categoryId = categoryId;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBrandId() {
        return brandId;
    }

    public void setBrandId(int brandId) {
        this.brandId = brandId;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "id=" + id +
                ", brandId=" + brandId +
                ", model='" + model + '\'' +
                ", serialNumber='" + serialNumber + '\'' +
                ", purchaseDate=" + purchaseDate +
                ", userId=" + userId +
                ", categoryId=" + categoryId +
                '}';
    }
}
