package seminar3.model;

import java.time.LocalTime;
import java.util.ArrayList;

import seminar3.DTO.PaymentDTO;
import seminar3.DTO.SaleDTO;

/**
 * Represents one receipt, which proves the payment of one sale.
 */
public class Receipt {
    private LocalTime timeOfSale;
    private ArrayList<Item> items = new ArrayList<Item>();
    private double totalPrice;
    private double totalVAT;
    private double paidAmount;
    private String currency;
    private String storeInformation = "Information about store xoxo";

    public Receipt(SaleDTO sale, PaymentDTO payment) {
        this.timeOfSale = sale.getTimeOfSale();
        this.items = sale.getItems();
        this.totalPrice = sale.getTotalPrice();
        this.totalVAT = sale.getTotalVAT();
        this.paidAmount = payment.getAmount();
        this.currency = payment.getCurrency();
    }

    public LocalTime getTimeOfSale() {
        return this.timeOfSale;
    }

    public ArrayList<Item> getItems() {
        return this.items;
    }

    public double getTotalPrice() {
        return this.totalPrice;
    }

    public double getTotalVAT() {
        return this.totalVAT;
    }

    public double getPaidAmount() {
        return this.paidAmount;
    }

    public String getCurrency() {
        return this.currency;
    }

    public String getStoreInformation() {
        return this.storeInformation;
    }
}
