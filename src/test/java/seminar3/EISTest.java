package seminar3;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import seminar3.DTO.*;
import seminar3.integration.*;

import static org.junit.Assert.assertTrue;

public class EISTest {
    private EISHandler instance;
    private ByteArrayOutputStream printoutBuffer;
    private PrintStream originalSysOut;

    
    @Before
    public void setUp(){
        
        printoutBuffer = new ByteArrayOutputStream();
        PrintStream inMemSysOut = new PrintStream(printoutBuffer);
        originalSysOut = System.out;
        System.setOut(inMemSysOut);

        instance = new EISHandler();
    }


    @After
    public void tearDown(){
        printoutBuffer = null;
        System.setOut(originalSysOut);
    }


    @Test
    public void testFindItem()
    {
        instance.findItem("Identifier");

        String printout = printoutBuffer.toString();
        String expectedOutput = "success";
        assertTrue("FindItem did not start correctly.", printout.contains(expectedOutput));
    }


    @Test
    public void testUpdateInventory()
    {
        SaleDTO sale = new SaleDTO(null, null, 0, 0);
        instance.updateInventory(sale);

        String printout = printoutBuffer.toString();
        String expectedOutput = "success";
        assertTrue("UpdateInventory did not start correctly.", printout.contains(expectedOutput));
    }
}
