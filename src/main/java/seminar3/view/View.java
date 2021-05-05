package seminar3.view;

import seminar3.controller.Controller;

/**
 * This is a placeholder for the real view. It contains a hardcoded execution with calls 
 * to all system operations in the controller.
 */
public class View {
    private Controller contr;

    /**
     * Creates a new instance, that uses the specified controller for all calls to other layers
     * @param contr The controller to use for all calls to other layers.
     */
    public View(Controller contr) {
        this.contr = contr;
    }

    /**
     * Performs a fake sale, by calling all system operations in the controller.
     */
    public void runFakeExecution(){
        contr.startSale();
        System.out.println("A new sale has started successfully.");
        contr.enterItem("1identifier");
        System.out.println("Added an item with the identifier: 1identifier");
        contr.pay(100, "SEK");
        System.out.println("A payment of 100 SEK was made");

        System.out.println("\n");
    }
}