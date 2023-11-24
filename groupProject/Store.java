import java.util.*;

public class Store {

    static ArrayList<Device> available = new ArrayList();
    static ArrayList<Order> ordered = new ArrayList();
    static ArrayList<Retail> sold = new ArrayList();

    public static void convertOrderToRetail(Order order) {
        Retail retail = new Retail(order.getOrdrCode(), order.getOrdrModel(), order.getFullName(), order.getPhone(), order.getOrdrDate(), order.getFinalCost());
        Date today = new Date();
        retail.setSaleDate(today);
        int j = sold.size();
        sold.add(j, retail);
    }
}