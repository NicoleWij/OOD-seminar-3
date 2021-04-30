package seminar3.controller;

import seminar3.DTO.SaleInfoDTO;
import seminar3.integration.*;
import seminar3.model.Sale;
import seminar3.model.Register;

/**
 * This is the application's only controller. All calls through the model pass through this class.
 */
public class Controller {
    private Sale sale;
    private EISHandler eis;
    private EASHandler eas;
    private Printer printer;
    private Register register;

    /**
     * This function generates a new instance of the controller
     * @param eis as external inventory handler
     * @param eas as external account system
     * @param printer a printer that prints receipts
     */
    public Controller(EISHandler eis, EASHandler eas, Printer printer){
        this.eis = eis;
        this.eas = eas;
        this.printer = printer;

        this.register = new Register();

        System.out.println("Controller was started successfully.");
    }
    
    /**
     * Starts a new sale. This method must be called before doing anything else during a sale.
     */
    public void startSale(){
        sale = new Sale();
    }

    public SaleInfoDTO enterItem(String identifier){
        

        return null;
    }

    public double pay(double amount, String currency){

        return 1;
    }
}