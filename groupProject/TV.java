public class TV extends Device {
    
    private String type;
    private double size;
    private String resolution;
    private String ports;

    public TV(String type, double size, String resolution, String ports, 
    String code, String model, int year, String manufacturer, double price, String category, int stock) {
        super(code, model, year, manufacturer, price, "VideoAudio", stock);
        this.type = type;
        this.size = size;
        this.resolution = resolution;
        this.ports = ports;
    }

    public String getType() {
        return type;
    }
    public double getSize() {
        return size;
    }
    public String getResolution() {
        return resolution;
    }
    public String getPorts() {
        return ports;
    }

    public void setType(String type) {
        this.type = type;
    }
    public void setSize(double size) {
        this.size = size;
    }
    public void setResolution(String resolution) {
        this.resolution = resolution;
    }
    public void setPorts(String ports) {
        this.ports = ports;
    }

    @Override
    public String toString() {
        return ("Code: " + getCode() + "\nModel: " + getModel() + "\nYear: " + getYear() + "\nManufacturer: " + getManufacturer() + "\nStock: " + getStock() + "\nPrice: " + getPrice() + "$" + 
        "\nType: " + type + "\nScreen dimention: " + size + "\"" + "\nResolution: " + resolution + "\nPorts: " + ports);
    }
}