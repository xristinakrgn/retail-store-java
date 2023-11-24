import java.util.Date;
import java.text.SimpleDateFormat;

public class Retail {

    private int saleCode;
    private Device saleModel;
    private String fullName;
    private long phone;
    private Date saleDate;
    private double finalCost;

    public Retail(int saleCode, Device saleModel, String fullName, long phone, Date saleDate, double finalCost) {
        this.saleCode = saleCode;
        this.saleModel = saleModel;
        this.fullName = fullName;
        this.phone = phone;
        this.saleDate = saleDate;
        this.finalCost = finalCost;
    }

    public Retail() {
        
    }

    public int getSaleCode(){
        return saleCode;
    }
    public Device getSaleModel(){
        return saleModel;
    }
    public String getFullName(){
        return fullName;
    }
    public long getPhone(){
        return phone;
    }
    public Date getSaleDate(){
        return saleDate;
    }
    public double getFinalCost(){
        return finalCost;
    }

    public void setSaleCode(int saleCode){
        this.saleCode = saleCode;
    }
    public void setSaleModel(Device saleModel){
        this.saleModel = saleModel;
    }
    public void setFullName(String fullName){
        this.fullName = fullName;
    }
    public void setPhone(long phone){
        this.phone = phone;
    }
    public void setSaleDate(Date saleDate){
        this.saleDate = saleDate;
    }
    public void setFinalCost(double finalCost){
        this.finalCost = finalCost;
    }

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String saleDateStr = dateFormat.format(saleDate);
        return ("Sale Code: " + saleCode + "\nCustomer's Full Name: " + fullName + 
        "\nCustomer's Phone Number: " + phone + "\nSale Date: " + saleDateStr);
    }
}