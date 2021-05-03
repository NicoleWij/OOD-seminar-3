package seminar3;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import seminar3.DTO.*;
import seminar3.integration.*;
import seminar3.model.Receipt;

import static org.junit.Assert.assertTrue;

public class PrinterTest {
    private Printer instance;
    private ByteArrayOutputStream printoutBuffer;
    private PrintStream originalSysOut;

    @Before
    public void setUp(){

        printoutBuffer = new ByteArrayOutputStream();
        PrintStream inMemSysOut = new PrintStream(printoutBuffer);
        originalSysOut = System.out;
        System.setOut(inMemSysOut);

        instance = new Printer();
    }

    @After
    public void tearDown(){
        printoutBuffer = null;
        System.setOut(originalSysOut);
    }


    @Test
    public void testPrintReceipt()
    {
        SaleDTO sale = new SaleDTO(null, null, 0, 0);
        PaymentDTO payment = new PaymentDTO(0, null);
        Receipt receipt = new Receipt(sale, payment);
        instance.printReceipt(receipt);

        String printout = printoutBuffer.toString();
        String expectedOutput = "success";
        assertTrue("PrintReceipt did not start correctly.", printout.contains(expectedOutput));
    }
}
