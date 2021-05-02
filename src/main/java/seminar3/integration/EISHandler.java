package seminar3.integration;

import seminar3.DTO.*;

/**
 * EISHandler, external inventory system handler. This class fetches data and writes to the inventory database.
 */
public class EISHandler {
    /**
     * Finds the correct item from the external inventory system based on the items identifier
     * @param identifier
     * @return
     */
    public ItemDTO findItem(String identifier){
        return null;
    }
    /**
     * This function updates the invventory based on what items were purchased
     * @param sale the completed sale
     */
    public void updateInventory(SaleDTO sale){
        System.out.println("Inventory has been updated.");
    }
}
