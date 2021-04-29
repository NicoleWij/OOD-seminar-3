package seminar3.model;

/**
 * Virtual register used for keeping track of the money
 */
public class Register {
    double amount;

    /**
     * This function generates a new instance of a register
     */
    public Register(){
        this.amount = 1000;
    }

    /**
     * 
     * @return the amount of money in the register (double)
     */
    public double getAmount(){
        return amount;
    }
}
