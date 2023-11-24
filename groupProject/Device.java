public class Device {
    
    private String code;
    private String model;
    private int year;
    private String manufacturer;
    private double price;
    private String category;
    private int stock;

    public Device(String code, String model, int year, String manufacturer, double price, String category, int stock) {
        this.code = code;
        this.model = model;
        this.year = year;
        this.manufacturer = manufacturer;
        this.price = price; 
        this.category = category;
        this.stock = stock;   
    }

    public String getCode() {
        return code;
    }
    public String getModel() {
        return model;
    }
    public int getYear() {
        return year;
    }
    public String getManufacturer() {
        return manufacturer;
    }
    public double getPrice() {
        return price;
    }
    public String getCategory() {
        return category;
    }
    public int getStock() {
        return stock;
    }

    public void setCode(String code) {
        this.code = code;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
}