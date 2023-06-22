package steps;

public class RestaurantMenuItem {

    public String getItemName() {
        return ItemName;
    }

    public void setItemName(String itemName) {
        ItemName = itemName;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    private String ItemName;
    private String Description;
    private int Price;

    public RestaurantMenuItem(String itemName, String description, int price) {
        ItemName = itemName;
        Description = description;
        Price = price;
    }
}

