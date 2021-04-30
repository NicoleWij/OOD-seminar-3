package seminar3.model;

import seminar3.DTO.ItemDTO;

public class Item {
    private int quantity;
    private String name;
    private double VAT;
    private double price;
    private String description;
    private String identifier;

    public Item(ItemDTO item, int quantity){
        this.quantity = item.getQuantity();
        this.VAT = item.getVAT();
        this.price = item.getPrice();
        this.description = item.getDescription();
        this.quantity = quantity;
    }

    public int getQuantity(){
        return this.quantity;
    }

    public String getName(){
        return this.name;
    }

    public double getVAT(){
        return this.VAT;
    }

    public double getPrice(){
        return this.price;
    }

    public String getDescription(){
        return this.description;
    }

    public String getIdentifier(){
        return this.identifier;
    }

    public void updateDuplicate(int quantity, double weight){

    }
}
