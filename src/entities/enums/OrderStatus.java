package entities.enums;

public enum OrderStatus {
    PENDING_PAYMENT (1, "Pending Payment"),
    PROCESSING (2, "Processing"),
    SHIPPED (3, "Shipped"),
    DELIVERED (4, "Delivered");

    private int code;
    private String description;

    OrderStatus(int code, String description) {
        this.code = code;
        this.description = description;
    }
}