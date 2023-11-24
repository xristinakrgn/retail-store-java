import java.util.*;
import java.io.*;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class FileReader58 {

    public static void ReadSalesFile() {

        BufferedReader reader = null;
        Retail sale = null;
        String line;
        try {
            reader = new BufferedReader(new java.io.FileReader("retail.txt"));
            line = reader.readLine();
            while (line.equals("")){
                line = reader.readLine();
            }
            if (line.trim().equals("SALES_LIST")) {
                line = reader.readLine();
                while (line.equals("")){
                    line = reader.readLine();
                }
                while (line != null) {
                    while (line.trim().equals("{") || line.trim().startsWith("SALE")) {
                        line = reader.readLine();
                        while (line.equals("")){
                            line = reader.readLine();
                        }
                    }
                    if (line.trim().startsWith("NAME")) {
                        sale = new Retail();
                        sale.setFullName(line.trim().substring(5).trim());
                        line = reader.readLine();
                        while (line.equals("")){
                            line = reader.readLine();
                        }
                        if (line.trim().startsWith("PHONE_NUMBER")) {
                            sale.setPhone(Long.parseLong(line.trim().substring(13).trim()));
                            line = reader.readLine();
                            while (line.equals("")){
                                line = reader.readLine();
                            }
                        }
                        if (line.trim().startsWith("PRICE")) {
                            sale.setFinalCost(Float.parseFloat(line.trim().substring(6).trim()));
                            line = reader.readLine();
                            while (line.equals("")){
                                line = reader.readLine();
                            }
                        }
                        if (line.trim().startsWith("SALES_NUMBER")) {
                            sale.setSaleCode(Integer.parseInt(line.trim().substring(13).trim()));
                            line = reader.readLine();
                            while (line.equals("")){
                                line = reader.readLine();
                            }
                        }
                        if (line.trim().startsWith("MODEL")) {
                            Device device = new Device();
                            device.setModel(line.trim().substring(6).trim());
                            sale.setSaleModel(device);
                            line = reader.readLine();
                            while (line.equals("")) {
                                line = reader.readLine();
                            }
                        }
                        if (line.trim().startsWith("SALE_DATE")) {
                            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                            Date date = dateFormat.parse(line.trim().substring(10).trim());
                            sale.setSaleDate(date);
                            line = reader.readLine();
                            while (line.equals("")) {
                                line = reader.readLine();
                            }
                        }
                        if (line.trim().equals("}")) {
                            Store.sold.add(sale);
                            line = reader.readLine();
                            while (line.equals("")){
                                line = reader.readLine();
                            }
                            if (line.trim().equals("}")) {
                                line = reader.readLine();
                            }
                        }
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading line ...");
        }
    }

    public static void ReadOrderFile()  {

        BufferedReader reader = null;
        Order order = null;
        String line;
        try{

            reader = new BufferedReader(new java.io.FileReader("order.txt"));
            line = reader.readLine();
            if (line.trim().equals("ORDER_LIST")){
                line = reader.readLine();
                while (line.equals("")){
                    line = reader.readLine();
                }
                while (line != null) {
                    while (line.trim().equals("{") || line.trim().startsWith("ORDER")) {
                        line = reader.readLine();
                        while (line.equals("")){
                            line = reader.readLine();
                        }
                    }
                    if (line.trim().startsWith("NAME")) {
                        order = new Order();
                        order.setFullName(line.trim().substring(5).trim());
                        line = reader.readLine();
                        while (line.equals("")){
                            line = reader.readLine();
                        }
                        if (line.trim().startsWith("PHONE_NUMBER")) {
                            order.setPhone(Long.parseLong(line.trim().substring(13).trim()));
                            line = reader.readLine();
                            while (line.equals("")){
                                line = reader.readLine();
                            }
                        }
                        if (line.trim().startsWith("PRICE")) {
                            order.setFinalCost(Float.parseFloat(line.trim().substring(6).trim()));
                            line = reader.readLine();
                            while (line.equals("")){
                                line = reader.readLine();
                            }
                        }
                        if (line.trim().startsWith("ORDER_NUMBER")) {
                            order.setOrdrCode(Integer.parseInt(line.trim().substring(13).trim()));
                            line = reader.readLine();
                            while (line.equals("")){
                                line = reader.readLine();
                            }
                        }
                        if (line.trim().startsWith("MODEL")) {
                            String model = line.trim().substring(6).trim();
                            Device device = new Device(model);
                            order.setOrdrModel(device);
                            line = reader.readLine();
                            while (line.equals("")) {
                                line = reader.readLine();
                            }
                        }
                        if (line.trim().startsWith("ORDER_DATE")) {
                            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                            Date date = dateFormat.parse(line.trim().substring(11).trim());
                            order.setOrdrDate(date);
                            line = reader.readLine();
                            while (line.equals("")) {
                                line = reader.readLine();
                            }
                        }
                        if (line.trim().startsWith("DELIVERY_DATE")) {
                            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                            Date date = dateFormat.parse(line.trim().substring(14).trim());
                            order.setEstimated(date);
                            line = reader.readLine();
                            while (line.equals("")) {
                                line = reader.readLine();
                            }
                        }
                        if (line.trim().startsWith("STATUS")) {
                            order.setState(Boolean.parseBoolean(line.trim().substring(7).trim()));
                            line = reader.readLine();
                            while (line.equals("")){
                                line = reader.readLine();
                            }
                        }
                        if (line.trim().equals("}")) {
                            Store.ordered.add(order);
                            line = reader.readLine();
                            while (line.equals("")){
                                line = reader.readLine();
                            }
                            if (line.trim().equals("}")) {
                                line = reader.readLine();
                            }
                        }
                    }
                }
            }
        }
        catch (IOException e) {
            System.out.println("Error reading line ...");
        }
    }

    public static void ReadItemFile() {

        BufferedReader reader = null;
        Device item = null;
        String line;
        try {
            reader = new BufferedReader(new java.io.FileReader("products.txt"));
            line = reader.readLine();
            while (line.equals("")){
                line = reader.readLine();
            }
            if (line.trim().equals("ITEM_LIST")) {
                line = reader.readLine();
                while (line.equals("")){
                    line = reader.readLine();
                }
                while (line != null) {
                    while (line.trim().equals("{") || line.trim().startsWith("ITEM")) {
                        line = reader.readLine();
                        while (line.equals("")){
                            line = reader.readLine();
                        }
                    }
                    if (line.trim().startsWith("MODEL")) {
                        item.setModel(line.trim().substring(6).trim());
                        line = reader.readLine();
                        while (line.equals("")){
                            line = reader.readLine();
                        }
                        if (line.trim().startsWith("CODE")) {
                            item.setCode(line.trim().substring(5).trim());
                            line = reader.readLine();
                            while (line.equals("")){
                                line = reader.readLine();
                            }
                        }
                        if (line.trim().startsWith("PRICE")) {
                            item.setPrice(Float.parseFloat(line.trim().substring(6).trim()));
                            line = reader.readLine();
                            while (line.equals("")){
                                line = reader.readLine();
                            }
                        }
                        if (line.trim().startsWith("MODEL_YEAR")) {
                            item.setYear(Integer.parseInt(line.trim().substring(11).trim()));
                            line = reader.readLine();
                            while (line.equals("")){
                                line = reader.readLine();
                            }
                        }
                        if (line.trim().startsWith("MANUFACTURER")) {
                            item.setManufacturer(line.trim().substring(13).trim());
                            line = reader.readLine();
                            while (line.equals("")){
                                line = reader.readLine();
                            }
                        }
                        if (line.trim().startsWith("PIECES")) {
                            item.setStock(Integer.parseInt(line.trim().substring(7).trim()));
                            line = reader.readLine();
                            while (line.equals("")){
                                line = reader.readLine();
                            }
                        }
                        if (line.trim().startsWith("ITEM_TYPE")) {
                            item.setCategory(line.trim().substring(10).trim());
                            line = reader.readLine();
                            while (line.equals("")){
                                line = reader.readLine();
                            }
                        }
                        if (line.trim().equals("}")) {
                            Store.available.add(item);
                            line = reader.readLine();
                            while (line.equals("")){
                                line = reader.readLine();
                            }
                            if (line.trim().equals("}")) {
                                line = reader.readLine();
                            }
                        }
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading line ...");
        }
    }
}