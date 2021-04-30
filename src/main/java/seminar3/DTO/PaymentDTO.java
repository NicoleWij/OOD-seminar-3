package seminar3.DTO;

public class PaymentDTO {
    private int amount;
    private String currency;


    public PaymentDTO(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    
    /** 
     * @return int
     */
    public int getAmount() {
        return this.amount;
    }


    
    /** 
     * @return String
     */
    public String getCurrency() {
        return this.currency;
    }

    
}
