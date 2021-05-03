package seminar3.Model;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import seminar3.DTO.*;
import seminar3.model.Item;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ItemTest {
    private Item instance;
    private ByteArrayOutputStream printoutBuffer;
    private PrintStream originalSysOut;

    @Before
    public void setUp(){
    
        printoutBuffer = new ByteArrayOutputStream();
        PrintStream inMemSysOut = new PrintStream(printoutBuffer);
        originalSysOut = System.out;
        System.setOut(inMemSysOut);
        
        ItemDTO item = new ItemDTO(null, 0, 0, null, null);
        instance = new Item(item);
    }

    @After
    public void tearDown(){
        printoutBuffer = null;
        System.setOut(originalSysOut);
    }


    @Test
    public void testItem()
    {
        String printout = printoutBuffer.toString();
        String expectedOutput = "success";
        assertTrue("Item did not start correctly.", printout.contains(expectedOutput));
    }


    @Test
    public void testIncreaseQuantity()
    {
        int quantityBefore = instance.getQuantity();
        instance.increaseQuantity();

        assertEquals(
            "Increase quantity did not give the expected result", 
            (quantityBefore + 1), 
            instance.getQuantity()
        );
    }
}
