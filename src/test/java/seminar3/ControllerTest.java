package seminar3;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import seminar3.controller.Controller;
import seminar3.integration.*;

import static org.junit.Assert.assertTrue;

public class ControllerTest {
    private Controller instance;
    private ByteArrayOutputStream printoutBuffer;
    private PrintStream originalSysOut;

    @Before
    public void setUp(){
        printoutBuffer = new ByteArrayOutputStream();
        PrintStream inMemSysOut = new PrintStream(printoutBuffer);
        originalSysOut = System.out;
        System.setOut(inMemSysOut);

        EISHandler eis = new EISHandler();
        EASHandler eas = new EASHandler();
        Printer printer = new Printer();

        instance = new Controller(eis, eas, printer);
    }

    @After
    public void tearDown(){
        printoutBuffer = null;
        System.setOut(originalSysOut);

        instance = null;
    }


    @Test
    public void testUIHasStarted()
    {
        String printout = printoutBuffer.toString();
        String expectedOutput = "success";
        assertTrue("Controller did not start correctly.", printout.contains(expectedOutput));
    }


    @Test
    public void testStartSale(){
        instance.startSale();

        String printout = printoutBuffer.toString();
        String expectedOutput = "success";
        assertTrue("StartSale did not start correctly.", printout.contains(expectedOutput));
    }


    @Test
    public void testEnterItem(){
        instance.startSale();
        instance.enterItem("Identifier");

        String printout = printoutBuffer.toString();
        String expectedOutput = "success";
        assertTrue("EnterItem did not start correctly.", printout.contains(expectedOutput));
    }


    @Test
    public void pay(){
        instance.startSale();
        instance.pay(100, "SEK");

        String printout = printoutBuffer.toString();
        String expectedOutput = "success";
        assertTrue("Pay did not start correctly.", printout.contains(expectedOutput));
    }
}