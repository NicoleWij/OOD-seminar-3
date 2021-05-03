package seminar3.Model;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import seminar3.DTO.*;
import seminar3.model.Sale;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SaleTest {
    private Sale instance;
    private ByteArrayOutputStream printoutBuffer;
    private PrintStream originalSysOut;

    @Before
    public void setUp(){
    
        printoutBuffer = new ByteArrayOutputStream();
        PrintStream inMemSysOut = new PrintStream(printoutBuffer);
        originalSysOut = System.out;
        System.setOut(inMemSysOut);
        
        instance = new Sale();
    }

    @After
    public void tearDown(){
        printoutBuffer = null;
        System.setOut(originalSysOut);
    }


    @Test
    public void testSale()
    {
        String printout = printoutBuffer.toString();
        String expectedOutput = "success";
        assertTrue("Item did not start correctly.", printout.contains(expectedOutput));
    }


    @Test
    public void testAddItem()
    {
        ItemDTO item = new ItemDTO(null, 0, 0, null, "Identifier");
        instance.addItem(item);

        assertEquals(
            "Item was not added.", 
            item.getIdentifier(), 
            instance.getItems().get(0).getIdentifier()
        );
    }


    @Test
    public void testUpdateRunningTotal()
    {
        double runningTotalBefore = instance.getTotalPrice();
        ItemDTO item = new ItemDTO(null, 0.2, 100, null, null);
        instance.addItem(item);

        assertEquals(
            "Running Total was not updated.", 
            (item.getPrice() + runningTotalBefore), 
            instance.getTotalPrice(),
            0.01
        );
    }
}
