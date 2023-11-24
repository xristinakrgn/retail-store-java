public class WashingMachine extends Device {

    private String energyClass;
    private int storage;
    private int turns;

    public WashingMachine(String energyClass, int storage, int turns, 
    String code, String model, int year, String manufacturer, double price, String category, int stock) {
        super(code, model, year, manufacturer, price, "HomeAppliances", stock);
        this.energyClass = energyClass;
        this.storage = storage;
        this.turns = turns;
    }

    public String getEnergyClass() {
        return energyClass;
    }
    public int getStorage() {
        return storage;
    }
    public int getTurns() {
        return turns;
    }

    public void setEnergyClass(String energyClass) {
        this.energyClass = energyClass;
    }
    public void setStorage(int storage) {
        this.storage = storage;
    }
    public void setTurns(int turns) {
        this.turns = turns;
    }

    @Override
    public String toString() {
        return ("Code: " + getCode() + "\nModel: " + getModel() + "\nYear: " + getYear() + "\nManufacturer: " + getManufacturer() + "\nStock: " + getStock() + "\nPrice: " + getPrice() + "$" + 
        "\nEnergy Class: " + energyClass + "\nStorage: " + storage + "\nTurns: " + turns);
    }
}