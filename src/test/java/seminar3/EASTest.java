package seminar3;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import seminar3.DTO.*;
import seminar3.integration.*;

import static org.junit.Assert.assertTrue;

public class EASTest {
    private EASHandler instance;
    private ByteArrayOutputStream printoutBuffer;
    private PrintStream originalSysOut;

    @Before
    public void setUp(){

        printoutBuffer = new ByteArrayOutputStream();
        PrintStream inMemSysOut = new PrintStream(printoutBuffer);
        originalSysOut = System.out;
        System.setOut(inMemSysOut);

        instance = new EASHandler();
    }

    @After
    public void tearDown(){
        printoutBuffer = null;
        System.setOut(originalSysOut);
    }


    @Test
    public void testRegisterPayment()
    {
        PaymentDTO payment = new PaymentDTO(0, null);
        SaleDTO sale = new SaleDTO(null, null, 0, 0);
        instance.registerPayment(payment, sale);

        String printout = printoutBuffer.toString();
        String expectedOutput = "success";
        assertTrue("RegisterPayment did not start correctly.", printout.contains(expectedOutput));
    }
}
