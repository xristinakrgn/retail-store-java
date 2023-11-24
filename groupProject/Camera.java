public class Camera extends Device {

    private String type;
    private double megapixel;
    private double visualZoom;
    private double digitalZoom;
    private double size;

    public Camera(String type, double megapixel, double visualZoom, double digitalZoom, double size, 
    String code, String model, int year, String manufacturer, double price, String category, int stock) {
        super(code, model, year, manufacturer, price, "VideoAudio", stock);
        this.type = type;
        this.megapixel = megapixel;
        this.visualZoom = visualZoom;
        this.digitalZoom = digitalZoom;
        this.size = size;
    }

    public String getType(){
        return type;
    }
    public double getMegapixel(){
        return megapixel;
    }
    public double getVisualZoom(){
        return visualZoom;
    }
    public double getDigitalZoom(){
        return digitalZoom;
    }
    public double getSize(){
        return size;
    }

    public void setType(String type) {
        this.type = type;
    }
    public void setMegapixel(double megapixel) {
        this.megapixel = megapixel;
    }
    public void setVisualZoom(double visualZoom) {
        this.visualZoom = visualZoom;
    }
    public void setDigitalZoom(double digitalZoom) {
        this.digitalZoom = digitalZoom;
    }
    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return ("Code: " + getCode() + "\nModel: " + getModel() + "\nYear: " + getYear() + "\nManufacturer: " + getManufacturer() + "\nStock: " + getStock() + "\nPrice: " + getPrice() + "$" + 
        "\nType: " + type + "\nMegapixels: " + megapixel + "\nVisual Zoom: " + visualZoom + "\nDigital Zoom: " + digitalZoom + "\nMonitor Size: " + size + "\"");
    }
}