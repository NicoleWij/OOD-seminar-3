package seminar3.Model;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import seminar3.model.Register;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class RegisterTest {
    private Register instance;
    private ByteArrayOutputStream printoutBuffer;
    private PrintStream originalSysOut;

    @Before
    public void setUp(){
    
        printoutBuffer = new ByteArrayOutputStream();
        PrintStream inMemSysOut = new PrintStream(printoutBuffer);
        originalSysOut = System.out;
        System.setOut(inMemSysOut);
        
        instance = new Register();
    }

    @After
    public void tearDown(){
        printoutBuffer = null;
        System.setOut(originalSysOut);
    }


    @Test
    public void testRegister()
    {
        String printout = printoutBuffer.toString();
        String expectedOutput = "success";
        assertTrue("Register did not start correctly.", printout.contains(expectedOutput));
    }


    @Test
    public void testUpdateAmount()
    {
        double testAmount = 50;
        double amountBefore = instance.getAmount();
        instance.updateAmount(testAmount);

        assertEquals(
            "UpdateAmount did not give the expected result", 
            (amountBefore + testAmount), 
            instance.getAmount(), 
            0.01
        );
    }
}
