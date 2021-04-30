package seminar3.DTO;

public class ItemDTO{
    private String description;
    private double VAT;
    private double price;
    private String name;
    private int quantity;
    private String identifier;

    
    /** 
     * @param description
     * @param VAT
     * @param price
     * @param name
     */
    public void itemDTO(String description, double VAT, double price, String name){
        this.description = description;
        this.VAT = VAT;
        this.price = price;
        this.name = name;
    }

    
    /** 
     * @return String
     */
    public String getDescription(){
        return this.description;
    }

    
    /** 
     * @return double
     */
    public double getVAT(){
        return this.VAT;
    }

    
    /** 
     * @return double
     */
    public double getPrice(){
        return this.price;
    }

    
    /** 
     * @return String
     */
    public String getName(){
        return this.name;
    }

    
    /** 
     * @return int
     */
    public int getQuantity(){
        return this.quantity;
    }

    
    /** 
     * @return String
     */
    public String getIdentifier(){
        return this.identifier;
    }
}