//User Team: #058 
//Authors: 3220040 , 3220067 , 3220081

import java.util.*;
import java.text.DecimalFormat;

public class mainApp {
    public static void main(String[] args) {

        Store.available.add(new TV("LCD", 43, "4k Ultra HD", "3 HDMI", "TV001", "Samsung-Smart-TV", 2021, "Samsung", 821.22, "VideoAudio", 1));
        Store.available.add(new TV("LED", 43, "4k Ultra HD", "3 HDMI", "TV002", "LG-3000", 2022, "LG", 299, "VideoAudio", 3));
        Store.available.add(new TV("Plasma", 50, "4k Ultra HD", "4 HDMI", "TV003", "Philips-Smart-TV", 2023, "Philips", 680.87, "VideoAudio", 0));
        
        Store.available.add(new BlueRayDVD("Blu-Ray", "3840 x 2160", "BD-R", "BLU001", "Panasonic-3D", 2020, "Panasonic", 479.99, "VideoAudio", 4));
        Store.available.add(new BlueRayDVD("DVD", "480i", "DVD+RW", "DVDU001", "Sony-3D", 2013, "Sony", 86.92, "VideoAudio", 8));

        Store.available.add(new Camera("Compact", 16, 25, 100, 3, "CAM001", "Nikon-Coolpix", 2022, "Nikon", 789.99, "VideoAudio", 3));
        Store.available.add(new Camera("Action Camera", 15, 20, 80, 3, "CAM002", "Sony-RX10", 2019, "Sony", 669.99, "VideoAudio", 2));
        Store.available.add(new Camera("DSLR", 13, 15, 90, 4, "CAM003", "Canon-DSLR-2000D", 2020, "Canon", 589.99, "VideoAudio", 0));

        Store.available.add(new Consoles("PS5", "AMD", "Radeon", "3,5 GHz", "16GB","console", "CON001", "Sony-Playstation-5-Digital-Edition", 2022, "Sony", 449.99, "Gaming", 1));
        Store.available.add(new Consoles("PS4", "AMD Jaguar", "Radeon", "Dolby Digital", "14GB", "console", "CON002", "Sony-Playstation-4", 2017, "Sony", 359.99, "Gaming", 3));
        Store.available.add(new Consoles("XBOX Series X", "AMD", "Radeon", "3,8 GHz", "16GB", "portableconsole","CON003", "Microsoft-Xbox-X", 2020, "Microsoft", 524.99, "Gaming", 0));
        Store.available.add(new Consoles("XBOX Series X", "NVIDIA", "Radeon", "3,5 GHz", "32GB", "portableconsole", "CON004", "Nintendo-Switch", 2017, "Nintendo", 253.99, "Gaming", 2));
        
        Store.available.add(new Fridge("Closet Fridge","F",409, 225,"FR001","Samsung-NoFrost",2019,"Samsung",1300.00,"HomeAppliances",1));
        Store.available.add(new Fridge("Double Door Fridge","E",279, 89,"FR002","Bosch-TotalNoFrost",2018,"Bosch",693.00,"HomeAppliances",2));
        Store.available.add(new Fridge("One Door Fridge","F",75, 8,"FR003","Morris-Retro-Fridge",2016,"Morris",344.00,"HomeAppliances",2));

        Store.available.add(new WashingMachine("Β", 10,1400,"WM001","LG-F4WV310S6E-Washing-Machine",2018,"LG",619.00,"HomeAppliances",0));
        Store.available.add(new WashingMachine("A",9,1400,"WM002","Bosch-WGG14400GR",2015,"Bosch",599.00,"HomeAppliances",2));

        FileWriter58.ItemFileWriter(Store.available);
        
        int i = 0;
        int j = 0;
        String x = "";
        boolean stop = false;
        System.out.println("");

        while (stop == false) {
            System.out.println("---------------------------------------------------------------------- \nPlease Select: \n---------------------------------------------------------------------- \n0. Overview of Available Devices \n1. Orders Overview \n2. Sales Overview \n3. Exit \n---------------------------------------------------------------------- \n");
            Scanner input = new Scanner(System.in);
            int ans = input.nextInt();
            System.out.println("");
            int counter = 0;
            
            if (ans == 0) {
                System.out.println("----------------------------------------------------------------------\nSelect Category: \n---------------------------------------------------------------------- \n1. Audio & Picture Devices \n2. Gaming Devices \n3. Home Devices \n---------------------------------------------------------------------- \n");
                int categ = input.nextInt();
                System.out.println("");

                if (categ == 1) {
                    System.out.println("----------------------------------------------------------------------\nSelect Device Type: \n---------------------------------------------------------------------- \n1. Televisions \n2. Blu-Ray/DVD players \n3. Cameras \n---------------------------------------------------------------------- \n");
                    int devType = input.nextInt();
                    System.out.println("");

                    if (devType == 1) {
                        System.out.println("----------------------------------------------------------------------\nHere are all the available TVs: \n----------------------------------------------------------------------");
                        
                        int k = 1;
                        for (Device item : Store.available) {
                            if (item instanceof TV) {
                                TV tv = (TV) item;
                                System.out.println(k + ". Model: " + tv.getModel() + ", Code: " + tv.getCode() + ", Stock: " + tv.getStock());
                                k++;
                            }
                        }                          

                        System.out.println("----------------------------------------------------------------------\n");
                        System.out.println("Input model code: ");
                        String modelCode = input.next();
                        x = modelCode;
                        System.out.println("");  
                    }
                    else if (devType == 2) {
                        System.out.println("----------------------------------------------------------------------\nHere are all the available Blu-Ray/DVD Players: \n----------------------------------------------------------------------");
                        
                        int k = 1;
                        for (Device item : Store.available) {
                            if (item instanceof BlueRayDVD) {
                                BlueRayDVD blueraydvd = (BlueRayDVD) item;
                                System.out.println(k + ". Model: " + blueraydvd.getModel() + ", Code: " + blueraydvd.getCode() + ", Stock: " + blueraydvd.getStock());
                                k++;
                            }
                        }

                        System.out.println("----------------------------------------------------------------------\n");
                        System.out.println("Input model code: ");
                        String modelCode = input.next();
                        x = modelCode;
                        System.out.println("");
                    }
                    else if (devType == 3) {
                        System.out.println("----------------------------------------------------------------------\nHere are all the available Cameras: \n----------------------------------------------------------------------");
                        
                        int k = 1;
                        for (Device item : Store.available) {
                            if (item instanceof Camera) {
                                Camera camera = (Camera) item;
                                System.out.println(k + ". Model: " + camera.getModel() + ", Code: " + camera.getCode() + ", Stock: " + camera.getStock());
                                k++;
                            }
                        }

                        System.out.println("----------------------------------------------------------------------\n");
                        System.out.println("Input model code: ");
                        String modelCode = input.next();
                        x = modelCode;
                        System.out.println("");
                    }
                }
                else if (categ == 2){
                    System.out.println("----------------------------------------------------------------------\nSelect Device Type: \n---------------------------------------------------------------------- \n1. Consoles \n2. Portable Consoles \n---------------------------------------------------------------------- \n");
                    int devType = input.nextInt();
                    System.out.println("");
                    if (devType == 1) {
                        System.out.println("----------------------------------------------------------------------\nHere are all the available Consoles: \n----------------------------------------------------------------------");
                        
                        int k = 1;
                        for (Device item : Store.available) {
                            if (item instanceof Consoles) {
                                Consoles fridge = (Consoles) item;
                                if (fridge.getContype().equals("console")) {
                                    System.out.println(k + ". Model: " + fridge.getModel() + ", Code: " + fridge.getCode() + ", Stock: " + fridge.getStock());
                                    k++;
                                }
                            }
                        }

                        System.out.println("----------------------------------------------------------------------\n");
                        System.out.println("Input model code: ");
                        String modelCode = input.next();
                        x = modelCode;
                        System.out.println("");
                    }
                    else if (devType == 2) {
                        System.out.println("----------------------------------------------------------------------\nHere are all the available Portable Consoles: \n----------------------------------------------------------------------");
                        
                        int k = 1;
                        for (Device item : Store.available) {
                            if (item instanceof Consoles) {
                                Consoles fridge = (Consoles) item;
                                if (fridge.getContype().equals("portableconsole")) {
                                    System.out.println(k + ". Model: " + fridge.getModel() + ", Code: " + fridge.getCode() + ", Stock: " + fridge.getStock());
                                    k++;
                                }
                            }
                        }

                        System.out.println("----------------------------------------------------------------------\n");
                        System.out.println("Input model code: ");
                        String modelCode = input.next();
                        x = modelCode;
                        System.out.println("");
                    }
                }
                else if (categ == 3){
                    System.out.println("----------------------------------------------------------------------\nSelect Device Type: \n---------------------------------------------------------------------- \n1. Refrigerators \n2. Washing Machines \n---------------------------------------------------------------------- \n");
                    int devType = input.nextInt();
                    System.out.println("");

                    if (devType == 1) {
                        System.out.println("----------------------------------------------------------------------\nHere are all the available Refrigerators: \n----------------------------------------------------------------------");
                        
                        int k = 1;
                        for (Device item : Store.available) {
                            if (item instanceof Fridge) {
                                Fridge fridge = (Fridge) item;
                                System.out.println(k + ". Model: " + fridge.getModel() + ", Code: " + fridge.getCode() + ", Stock: " + fridge.getStock());
                                k++;
                            }
                        }

                        System.out.println("----------------------------------------------------------------------\n");
                        System.out.println("Input model code: ");
                        String modelCode = input.next();
                        x = modelCode;
                        System.out.println("");
                    }
                    else if (devType == 2) {
                        System.out.println("----------------------------------------------------------------------\nHere are all the available Washing Machines: \n----------------------------------------------------------------------");
                        
                        int k = 1;
                        for (Device item : Store.available) {
                            if (item instanceof WashingMachine) {
                                WashingMachine washingmachine = (WashingMachine) item;                                    
                                System.out.println(k + ". Model: " + washingmachine.getModel() + ", Code: " + washingmachine.getCode() + ", Stock: " + washingmachine.getStock());
                                k++;
                            }
                        }

                        System.out.println("----------------------------------------------------------------------\n");
                        System.out.println("Input model code: ");
                        String modelCode = input.next();
                        x = modelCode;
                        System.out.println("");
                    }
                }
                for (Device device : Store.available) {
                    
                    if (device.getCode().equals(x)) {
                        counter = 1;
                        System.out.println("---------------------------------------------------------------------- \nDevice Specs: \n----------------------------------------------------------------------");
                        System.out.println(device.toString());
                        System.out.println("----------------------------------------------------------------------");
                        System.out.println("");

                        if (device.getStock() != 0) {
                            System.out.println("Do you want to buy the Device? (if Yes press 1, if No press 2):");
                            int ans2 = input.nextInt();
                            System.out.println("");

                            if (ans2 == 1) {
                                i++;
                                System.out.println("Give full name: ");
                                input.nextLine();
                                String saleName = input.nextLine(); 
                                System.out.println("----------------------------------------------------------------------");
                                System.out.println("Give phone: ");
                                Long salePhone = input.nextLong(); 
                                System.out.println("");
                                
                                Date today = new Date();    
                                Retail retail = new Retail(i, device, saleName, salePhone, today, 0);
                                
                                System.out.println("---------------------------------------------------------------------- \nSale Receipt: \n----------------------------------------------------------------------");
                                System.out.println(retail.toString());
                                System.out.println("----------------------------------------------------------------------");

                                if (categ == 1) {
                                    retail.setFinalCost(device.getPrice() - (0.25 * device.getPrice()));
                                    DecimalFormat decimalFormat = new DecimalFormat("#.##");
                                    String formattedValue = decimalFormat.format(retail.getFinalCost());
                                    String formattedAmount = decimalFormat.format(device.getPrice() - retail.getFinalCost());
                                    System.out.println("\nStarting Price: " + device.getPrice() + "$" + "\nDiscount: 25%" + "\nDiscount Amount: " + formattedAmount + "$ \n");
                                    System.out.println("Final Cost: " + formattedValue + "$");
                                }
                                else if (categ == 2) {
                                    retail.setFinalCost(device.getPrice() - (0.10 * device.getPrice()));
                                    DecimalFormat decimalFormat = new DecimalFormat("#.##");
                                    String formattedValue = decimalFormat.format(retail.getFinalCost());
                                    String formattedAmount = decimalFormat.format(device.getPrice() - retail.getFinalCost());
                                    System.out.println("\nStarting Price: " + device.getPrice() + "$" + "\nDiscount: 10%" + "\nDiscount Amount: " + formattedAmount + "$ \n");
                                    System.out.println("Final Cost: " + formattedValue + "$");
                                }
                                else if (categ == 3) {
                                    retail.setFinalCost(device.getPrice() - (0.20 * device.getPrice()));
                                    DecimalFormat decimalFormat = new DecimalFormat("#.##");
                                    String formattedValue = decimalFormat.format(retail.getFinalCost());
                                    String formattedAmount = decimalFormat.format(device.getPrice() - retail.getFinalCost());
                                    System.out.println("\nStarting Price: " + device.getPrice() + "$" + "\nDiscount: 20%" + "\nDiscount Amount: " + formattedAmount + "$ \n");
                                    System.out.println("Final Cost: " + formattedValue + "$");
                                }
                                
                                System.out.println("----------------------------------------------------------------------");
                                
                                device.setStock(device.getStock() - 1);
                                Store.sold.add(retail);
                                FileWriter58.SaleFileWriter(Store.sold);
                                System.out.println("");
                                System.out.println("Sale Completed. Thank you for shopping! :) \n\nYou are now being transferred back to the main menu...\n");
                            }
                            else if (ans2 == 2){
                                System.out.println("Will not proceed to sale. \nThank you for visiting our store! \n\nYou are now being transferred back to the main menu...");
                            }
                        }
                        else {
                            System.out.println("Product out of stock. Do you want to order the Device? (if Yes press 1, if No press 2):");
                            int ans3 = input.nextInt();
                            System.out.println("");

                            if (ans3 == 1) {
                                j++;
                                System.out.println("Give full name: ");
                                input.nextLine();
                                String ordName = input.nextLine();
                                System.out.println("----------------------------------------------------------------------"); 
                                System.out.println("Give phone: ");
                                Long ordPhone = input.nextLong(); 
                                System.out.println("");
                                
                                Date today = new Date();
                                Date estimated = new Date();
                                Calendar cal = Calendar.getInstance();
                                cal.add(Calendar.DATE, 7);
                                estimated = cal.getTime();
                                
                                Order order = new Order(j, device, ordName, ordPhone, today, estimated, 0, false);
                                
                                System.out.println("---------------------------------------------------------------------- \nOrder Receipt: \n----------------------------------------------------------------------");
                                System.out.println(order.toString());
                                System.out.println("----------------------------------------------------------------------");
                                
                                if (categ == 1) {
                                    order.setFinalCost(device.getPrice() - (0.25 * device.getPrice()));
                                    DecimalFormat decimalFormat = new DecimalFormat("#.##");
                                    String formattedValue = decimalFormat.format(order.getFinalCost());
                                    String formattedAmount = decimalFormat.format(device.getPrice() - order.getFinalCost());
                                    System.out.println("\nStarting Price: " + device.getPrice() + "$" + "\nDiscount: 25%" + "\nDiscount Amount: " + formattedAmount + "$ \n");
                                    System.out.println("Final Cost: " + formattedValue + "$");
                                }
                                else if (categ == 2) {
                                    order.setFinalCost(device.getPrice() - (0.10 * device.getPrice()));
                                    DecimalFormat decimalFormat = new DecimalFormat("#.##");
                                    String formattedValue = decimalFormat.format(order.getFinalCost());
                                    String formattedAmount = decimalFormat.format(device.getPrice() - order.getFinalCost());
                                    System.out.println("\nStarting Price: " + device.getPrice() + "$" + "\nDiscount: 10%" + "\nDiscount Amount: " + formattedAmount + "$ \n");
                                    System.out.println("Final Cost: " + formattedValue + "$");
                                }
                                else if (categ == 3) {
                                    order.setFinalCost(device.getPrice() - (0.20 * device.getPrice()));
                                    DecimalFormat decimalFormat = new DecimalFormat("#.##");
                                    String formattedValue = decimalFormat.format(order.getFinalCost());
                                    String formattedAmount = decimalFormat.format(device.getPrice() - order.getFinalCost());
                                    System.out.println("\nStarting Price: " + device.getPrice() + "$" + "\nDiscount: 20%" + "\nDiscount Amount: " + formattedAmount + "$ \n");
                                    System.out.println("Final Cost: " + formattedValue + "$");
                                }
                                
                                System.out.println("----------------------------------------------------------------------");
                                
                                Store.ordered.add(order);
                                FileWriter58.OrderFileWriter(Store.ordered);
                                System.out.println("");
                                System.out.println("Order PLaced. Thank you for shopping! :) \n\nYou are now being transferred back to the main menu...\n");
                            }
                            else if (ans3 == 2){
                                System.out.println("Will not proceed to order. \nThank you for visiting our store! \n\nYou are now being transferred back to the main menu...");
                            }
                        }
                    }
                }
                if (counter == 0) {
                    System.out.println("This model does not exist in our store. \nWe're very sorry for the inconvinience. \n\nYou are now being transferred back to the main menu...\n");
                }
            }
            else if (ans == 1) {
                if (Store.ordered.isEmpty()) {
                    System.out.println("No orders have been submitted. \nWe're very sorry for the inconvinience. \n\nYou are now being transferred back to the main menu...\n");
                }
                else{
                    System.out.println("---------------------------------------------------------------------- \nHere are all the Orders: \n----------------------------------------------------------------------");
                    int k = 1;
                    for (Order order : Store.ordered) {
                        if (k != 1) {System.out.println("\n----------------------------------------------------------------------");}
                        System.out.println(k + ") \n----------------------------------------------------------------------\n" + order.getOrdrModel());
                        k++;
                    }
                    System.out.print("---------------------------------------------------------------------- \n\nChoose one: ");
                    int ans4 = input.nextInt();
                    int index = ans4 - 1;
                    if (index >= 0 && index < Store.ordered.size()) {
                        Order selectedOrder = Store.ordered.get(index);
                        String str = "";
                        if (selectedOrder.getState() == false) {
                            str = "Pending";
                        }
                        System.out.println("\n----------------------------------------------------------------------\nOrder Details: \n----------------------------------------------------------------------\n" + selectedOrder + "\nState: " + str);
                        DecimalFormat decimalFormat = new DecimalFormat("#.##");
                        String formattedValue = decimalFormat.format(selectedOrder.getFinalCost());
                        System.out.println("Final Cost: " + formattedValue + "$");
                        System.out.println("----------------------------------------------------------------------\n\nHas the item arrived? (if Yes press 1, if No press 2):");
                        int ans5 = input.nextInt();
                        if (ans5 == 1) {
                            selectedOrder.setState(true);
                            Store.convertOrderToRetail(selectedOrder);
                            Store.ordered.remove(selectedOrder);
                            System.out.println("\n---------------------------------------------------------------------- \nOrder State: Completed.\n---------------------------------------------------------------------- \n\nThank you for shopping! \n\nYou are now being transferred back to the main menu...\n");
                        }
                        else if (ans5 == 2) {
                            System.out.println("\n---------------------------------------------------------------------- \nOrder State: still Pending.\n---------------------------------------------------------------------- \n\nThank you for your patience! \n\nYou are now being transferred back to the main menu...\n");
                        }
                    }
                    else {
                        System.out.println("\nInvalid order selection.\nYou are now being transferred back to the main menu...\n");
                    }
                }
            }
            else if (ans == 2) {
                if (Store.sold.isEmpty()) {
                    System.out.println("No sale has been made. \nWe're very sorry for the inconvinience. \n\nYou are now being transferred back to the main menu...\n");
                }
                else{
                    System.out.println("---------------------------------------------------------------------- \nHere are all the Sales: \n----------------------------------------------------------------------");
                    int k = 1;
                    for (Retail retail : Store.sold) {
                        if (k != 1) {System.out.println("\n----------------------------------------------------------------------");}
                        System.out.println(k + ") \n----------------------------------------------------------------------\n" + retail.getSaleModel());
                        k++;
                    }
                    System.out.print("---------------------------------------------------------------------- \n\nChoose one: ");
                    int ans4 = input.nextInt();
                    int index = ans4 - 1;
                    if (index >= 0 && index < Store.sold.size()) {
                        Retail selectedSale = Store.sold.get(index);
                        System.out.println("\n----------------------------------------------------------------------\nSale Details: \n----------------------------------------------------------------------\n" + selectedSale);
                        DecimalFormat decimalFormat = new DecimalFormat("#.##");
                        String formattedValue = decimalFormat.format(selectedSale.getFinalCost());
                        System.out.println("Final Cost: " + formattedValue + "$");
                        System.out.println("----------------------------------------------------------------------\n");
                        System.out.println("You are now being transferred back to the main menu...\n");
                    }
                    else {
                        System.out.println("\nInvalid sale selection.\nYou are now being transferred back to the main menu...\n");
                    }
                }
            }
            else if (ans == 3) {
                break;
            }
            else {
                System.out.println("!Error occured please re-select.");
            }
        }
    }    
}
