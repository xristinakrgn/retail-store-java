public class BlueRayDVD extends Device {

    private String type;
    private String resolution;
    private String playbackFormat;

    public BlueRayDVD(String type, String resolution, String playbackFormat, 
    String code, String model, int year, String manufacturer, double price, String category, int stock) {
        super(code, model, year, manufacturer, price, "VideoAudio", stock);
        this.type = type;
        this.resolution = resolution;
        this.playbackFormat = playbackFormat;
    }

    public String getType() {
        return type;
    }
    public String getResolution() {
        return resolution;
    }
    public String getPlaybackFormat() {
        return playbackFormat;
    }

    public void setType(String type) {
        this.type = type;
    }
    public void setResolution(String resolution) {
        this.resolution = resolution;
    }
    public void setPlaybackFormat(String playbackFormat) {
        this.playbackFormat = playbackFormat;
    }

    @Override
    public String toString() {
        return ("Code: " + getCode() + "\nModel: " + getModel() + "\nYear: " + getYear() + "\nManufacturer: " + getManufacturer() + "\nStock: " + getStock() + "\nPrice: " + getPrice() + "$" + 
        "\nType: " + type + "\nResolution: " + resolution + "\nPlayback Format: " + playbackFormat);
    }
}