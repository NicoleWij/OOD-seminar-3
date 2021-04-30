package seminar3.model;

import seminar3.DTO.ItemDTO;
import seminar3.DTO.PaymentDTO;
import seminar3.DTO.SaleInfoDTO;

import java.util.ArrayList;
import java.time.LocalTime;

/**
 * One single sale made by one single customer and payed with one payment
 */
public class Sale {
    private LocalTime timeOfSale;
    private ArrayList<Item> items = new ArrayList<Item>();
    private double totalPrice;
    private double totalVAT;
    private double runningTotal = totalPrice + totalVAT;

    /**
     * Creates a new instance and saves the time of the sale.
     */
    public Sale(){
        timeOfSale = LocalTime.now();
    }

    
    /** 
     * @param itemDTO
     * @return SaleInfoDTO
     */
    public SaleInfoDTO addItem(ItemDTO itemDTO){
        Item item = new Item(itemDTO, 1);
        SaleInfoDTO saleInformation = new SaleInfoDTO(itemDTO, runningTotal);
        return saleInformation;
    }

    
    /** 
     * @param createdItem
     */
    private void calculateRunningTotal(Item createdItem){
        totalPrice += createdItem.getPrice();
        totalVAT += (createdItem.getVAT() * createdItem.getPrice());
    }

    
    /** 
     * @return LocalTime
     */
    public LocalTime getTimeOfSale() {
        return this.timeOfSale;
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

    
    /** 
     * @return double
     */
    public double getRunningTotal() {
        return this.runningTotal;
    }

    
    /** 
     * @return ArrayList<Item>
     */
    public ArrayList<Item> getItems() {
        return this.items;
    }

    
    /** 
     * @param payment
     */
    public void completeSale(PaymentDTO payment){

    }

    
    /** 
     * @param identifier
     * @param quantity
     * @return SaleInfoDTO
     */
    public SaleInfoDTO duplicateIdentifier(String identifier, int quantity){
        return null;
    }

    
    /** 
     * @param identifier
     * @return boolean
     */
    public boolean checkForDuplicate(String identifier){
        for(Item item : items){
            if(identifier.equals(item.getIdentifier())){
                return true;
            }
        }
        return false;
    }
}
