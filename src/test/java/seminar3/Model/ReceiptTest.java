package seminar3.Model;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import seminar3.DTO.*;
import seminar3.model.Receipt;

import static org.junit.Assert.assertTrue;

public class ReceiptTest {
    private ByteArrayOutputStream printoutBuffer;
    private PrintStream originalSysOut;

    @Before
    public void setUp(){
    
        printoutBuffer = new ByteArrayOutputStream();
        PrintStream inMemSysOut = new PrintStream(printoutBuffer);
        originalSysOut = System.out;
        System.setOut(inMemSysOut);
        
        SaleDTO sale = new SaleDTO(null, null, 0, 0);
        PaymentDTO payment = new PaymentDTO(0, null);
        new Receipt(sale, payment);
    }

    @After
    public void tearDown(){
        printoutBuffer = null;
        System.setOut(originalSysOut);
    }


    @Test
    public void testReceipt()
    {
        String printout = printoutBuffer.toString();
        String expectedOutput = "success";
        assertTrue("Item did not start correctly.", printout.contains(expectedOutput));
    }
}
