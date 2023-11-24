public class Fridge extends Device {

    private String type;
    private String energyClass;
    private int storage;
    private int freezer;

    public Fridge(String type, String energyClass, int storage, int freezer, 
    String code, String model, int year, String manufacturer, double price, String category, int stock) {
        super(code, model, year, manufacturer, price, "HomeAppliances", stock);
        this.type = type;
        this.energyClass = energyClass;
        this.storage = storage;
        this.freezer = freezer;
    }

    public String getType() {
        return type;
    }
    public String getEnergyClass() {
        return energyClass;
    }
    public int getStorage() {
        return storage;
    }
    public int getFreezer() {
        return freezer;
    }

    public void setType(String type) {
        this.type = type;
    }
    public void setEnergyClass(String energyClass) {
        this.energyClass = energyClass;
    }
    public void setStorage(int storage) {
        this.storage = storage;
    }
    public void setFreezer(int freezer) {
        this.freezer = freezer;
    }

    @Override
    public String toString() {
        return ("Code: " + getCode() + "\nModel: " + getModel() + "\nYear: " + getYear() + "\nManufacturer: " + getManufacturer() + "\nStock: " + getStock() + "\nPrice: " + getPrice() + "$" + 
        "\nType: " + type + "\nEnergy Class: " + energyClass + "\nStorage: " + storage + "\nFreezer: " + freezer);
    }
}