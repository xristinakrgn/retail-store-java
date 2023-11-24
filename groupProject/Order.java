import java.util.Date;
import java.text.SimpleDateFormat;

public class Order {
    
    private int ordrCode;
    private Device ordrModel;
    private String fullName;
    private long phone;
    private Date ordrDate;
    private Date estimated;
    private double finalCost;
    private Boolean state;

    public Order(int ordrCode, Device ordrModel, String fullName, long phone, Date ordrDate, Date estimated, double finalCost, Boolean state) {
        this.ordrCode = ordrCode;
        this.ordrModel = ordrModel;
        this.fullName = fullName;
        this.phone = phone;
        this.ordrDate = ordrDate;
        this.estimated = estimated;
        this.finalCost = finalCost;
        this.state = state;
    }

    public Order() {

    }

    public int getOrdrCode(){
        return ordrCode;
    }
    public Device getOrdrModel(){
        return ordrModel;
    }
    public String getFullName(){
        return fullName;
    }
    public long getPhone(){
        return phone;
    }
    public Date getOrdrDate(){
        return ordrDate;
    }
    public Date getEstimated(){
        return estimated;
    }
    public double getFinalCost(){
        return finalCost;
    }
    public Boolean getState(){
        return state;
    }

    public void setOrdrCode(int ordrCode){
        this.ordrCode = ordrCode;
    }
    public void setOrdrModel(Device ordrModel){
        this.ordrModel = ordrModel;
    }
    public void setFullName(String fullName){
        this.fullName = fullName;
    }
    public void setPhone(long phone){
        this.phone = phone;
    }
    public void setOrdrDate(Date ordrDate){
        this.ordrDate = ordrDate;
    }
    public void setEstimated(Date estimated){
        this.estimated = estimated;
    }
    public void setFinalCost(double finalCost){
        this.finalCost = finalCost;
    }
    public void setState(Boolean state){
        this.state = state;
    }

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String ordrDateStr = dateFormat.format(ordrDate);
        String estimatedStr = dateFormat.format(estimated);
        return ("Order Code: " + ordrCode + "\nCustomer's Full Name: " + fullName + 
        "\nCustomer's Phone Number: " + phone + "\nPlaced Order Date: " + ordrDateStr + "\nEstimated Order Arrival: " + estimatedStr);
    }
}