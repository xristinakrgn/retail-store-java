public class Consoles extends Device {

    private String type;
    private String processor;
    private String graphics;
    private String sound;
    private String hardDrive;
    private String contype;

    public Consoles(String type, String processor, String graphics, String sound, String hardDrive, String contype, 
    String code, String model, int year, String manufacturer, double price, String category, int stock) {
        super(code, model, year, manufacturer, price, "Gaming", stock);
        this.type = type;
        this.processor = processor;
        this.graphics = graphics;
        this.sound = sound;
        this.hardDrive = hardDrive;
        this.contype = contype;
    }

    public String getType() {
        return type;
    }
    public String getProcessor() {
        return processor;
    }
    public String getGraphics() {
        return graphics;
    }
    public String getSound() {
        return sound;
    }
    public String getHardDrive() {
        return hardDrive;
    }
    public String getContype(){
        return contype;
    }

    public void setType(String type) {
        this.type = type;
    }
    public void setProcessor(String processor) {
        this.processor = processor;
    }
    public void setGraphics(String graphics) {
        this.graphics = graphics;
    }
    public void setSound(String sound) {
        this.sound = sound;
    }
    public void setHardDrive(String hardDrive) {
        this.hardDrive = hardDrive;
    }
    public void setConType(String contype){
        this.contype = contype;
    }

    @Override
    public String toString() {
        return ("Code: " + getCode() + "\nModel: " + getModel() + "\nYear: " + getYear() + "\nManufacturer: " + getManufacturer() + "\nStock: " + getStock() + "\nPrice: " + getPrice() + "$" + 
        "\nType: " + type + "\nProcessor: " + processor + "\nGraphics: " + graphics + "\nSound: " + sound + "\nHard Drive: " + hardDrive);
    }
}