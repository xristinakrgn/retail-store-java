import java.io.IOException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class FileWriter58 {

    public static void SaleFileWriter(ArrayList<Retail> salelist) {

        java.io.FileWriter writer = null;
        try {
            writer = new java.io.FileWriter("retail.txt");
            writer.write("SALES_LIST" + "\n" + "{");
            for(Retail sale:salelist) {
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                String saleDateStr = dateFormat.format(sale.getSaleDate());
                DecimalFormat decimalFormat = new DecimalFormat("#.##");
                String formattedValue = decimalFormat.format(sale.getFinalCost());
                writer.write("\n" + "\t" + "SALE" + "\n" + "\t" + "{" + "\n" + "\t" + "\t" + "MODEL " + sale.getSaleModel()
                        + "\n" + "\t" + "\t" + "SALES_NUMBER " + sale.getSaleCode() + "\n" + "\t" + "\t" + "NAME " + sale.getFullName() 
                        + "\n" + "\t" + "\t" + "PHONE_NUMBER " + sale.getPhone() + "\n" + "\t" + "\t" + "SALE_DATE " + saleDateStr
                        + "\n" + "\t" + "\t" + "PRICE " + formattedValue + "\n" + "\t" + "}");
            }
            writer.write("\n" + "}");
            writer.close();
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }

    }

    public static void OrderFileWriter(ArrayList<Order> orderlist) {

        java.io.FileWriter writer = null;
        try {
            writer = new java.io.FileWriter("order.txt");
            writer.write("ORDER_LIST" + "\n" + "{");
            for(Order order: orderlist) {
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                String ordrDateStr = dateFormat.format(order.getOrdrDate());
                String estimatedStr = dateFormat.format(order.getEstimated());
                DecimalFormat decimalFormat = new DecimalFormat("#.##");
                String formattedValue = decimalFormat.format(order.getFinalCost());
                writer.write("\n" + "\t" + "ORDER" + "\n" + "\t" + "{" + "\n" + "\t" + "\t" + "MODEL " + order.getOrdrModel()
                        + "\n" + "\t" + "\t" + "ORDER_NUMBER " + order.getOrdrCode() + "\n" + "\t" + "\t" + "NAME " + order.getFullName() 
                        + "\n" + "\t" + "\t" + "PHONE_NUMBER " + order.getPhone() + "\n" + "\t" + "\t" + "ORDER_DATE " + ordrDateStr
                        + "\n" + "\t" + "\t" + "DELIVERY_DATE " + estimatedStr + "\n" + "\t" + "\t" + "PRICE " + formattedValue 
                        + "\n" + "\t" + "\t" + "STATUS " + order.getState() + "\n" + "\t" + "}");
            }
            writer.write("\n" + "}");
            writer.close();
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
    }

    public static void ItemFileWriter(ArrayList<Device> devicelist) {

        java.io.FileWriter writer = null;
        try {
            writer = new java.io.FileWriter("products.txt");
            writer.write("ITEM_LIST" + "\n" + "{");
            for(Device device: devicelist) {
                writer.write("\n" + "\t" + "ITEM" + "\n" + "\t" + "{" + "\n" + "\t" + "\t" + "CODE " + device.getCode()
                        + "\n" + "\t" + "\t" + "ITEM_TYPE " + device.getCategory() + "\n" + "\t" + "\t" + "MODEL " + device.getModel() 
                        + "\n" + "\t" + "\t" + "MODEL_YEAR " + device.getYear() + "\n" + "\t" + "\t" + "MANUFACTURER " + device.getManufacturer() 
                        + "\n" + "\t" + "\t" + "PRICE " + device.getPrice() + "\n" + "\t" + "\t" + "PIECES " + device.getStock() + "\n" + "\t" + "}");
            }
            writer.write("\n" + "}");
            writer.close();
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
    }
}