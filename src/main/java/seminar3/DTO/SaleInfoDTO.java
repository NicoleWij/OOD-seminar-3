package seminar3.DTO;

public class SaleInfoDTO {
    private String currentItemDescription;
    private double currentItemPrice;
    private String currentItemName;
    private double runningTotal;

    public SaleInfoDTO(ItemDTO item, double runningTotal){
        this.currentItemDescription = item.getDescription();
        this.currentItemPrice = item.getPrice();
        this.currentItemName = item.getName();
        this.runningTotal = runningTotal;
    }

    
    /** 
     * @return String
     */
    public String getItemDescription(){
        return this.currentItemDescription;
    }

    
    /** 
     * @return double
     */
    public double getCurrentItemPrice(){
        return this.currentItemPrice;
    }

    
    /** 
     * @return String
     */
    public String getCurrentItemName(){
        return this.currentItemName;
    }   

    
    /** 
     * @return double
     */
    public double getRunningTotal(){
        return this.runningTotal;
    }   
}
