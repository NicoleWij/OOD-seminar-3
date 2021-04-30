package seminar3.DTO;

import java.time.LocalTime;
import java.util.ArrayList;

import seminar3.model.Item;

public class SaleDTO {
    private LocalTime timeOfSale;
    private ArrayList<Item> items;
    private double totalPrice;
    private double totalVAT;


    public SaleDTO(LocalTime time, ArrayList<Item> items, double totalPrice, double totalVAT) {
        this.timeOfSale = time;
        this.items = items;
        this.totalPrice = totalPrice;
        this.totalVAT = totalVAT;
    }
    
    /** 
     * @return LocalTime
     */
    public LocalTime getTimeOfSale() {
        return this.timeOfSale;
    }
    
    /** 
     * @return ArrayList<Item>
     */
    public ArrayList<Item> getItems() {
        return this.items;
    }
    
    /** 
     * @return double
     */
    public double getTotalPrice() {
        return this.totalPrice;
    }
    
    /** 
     * @return double
     */
    public double getTotalVAT() {
        return this.totalVAT;
    }

    public String getStoreInformation() {
        return null;
    }  
}
