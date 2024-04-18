package Classes;
import java.util.Date;

public class Peripheral {
    private int id;
    private String type;
    private int brandId;
    private String model;
    private String serialNumber;
    private Date purchaseDate;
    private Date warrantyExpiryDate;
    private int userId;
    private int categoryId;

    public Peripheral(int id, String type, int brandId, String model, String serialNumber, Date purchaseDate, Date warrantyExpiryDate, int userId, int categoryId) {
        this.id = id;
        this.type = type;
        this.brandId = brandId;
        this.model = model;
        this.serialNumber = serialNumber;
        this.purchaseDate = purchaseDate;
        this.warrantyExpiryDate = warrantyExpiryDate;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    public Date getWarrantyExpiryDate() {
        return warrantyExpiryDate;
    }

    public void setWarrantyExpiryDate(Date warrantyExpiryDate) {
        this.warrantyExpiryDate = warrantyExpiryDate;
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
        return "Peripheral{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", brandId=" + brandId +
                ", model='" + model + '\'' +
                ", serialNumber='" + serialNumber + '\'' +
                ", purchaseDate=" + purchaseDate +
                ", warrantyExpiryDate=" + warrantyExpiryDate +
                ", userId=" + userId +
                ", categoryId=" + categoryId +
                '}';
    }
}
