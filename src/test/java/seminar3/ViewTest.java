package seminar3;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;

import seminar3.integration.*;
import seminar3.controller.Controller;
import seminar3.view.View;

/**
 * Unit test for simple App.
 */
public class ViewTest {
    private View instanceToTest;
    private ByteArrayOutputStream printoutBuffer;
    private PrintStream originalSysOut;

    @Before
    public void setUp(){
        Controller contr = new Controller(null, null, null);
        instanceToTest = new View(contr);

        printoutBuffer = new ByteArrayOutputStream();
        PrintStream inMemSysOut = new PrintStream(printoutBuffer);
        originalSysOut = System.out;
        System.setOut(inMemSysOut);
;    }

    @After
    public void tearDown(){
        instanceToTest = null;

        printoutBuffer = null;
        System.setOut(originalSysOut);
;    }

    /**
     * 
     */
    @Test
    public void testRunFakeExecution()
    {
        instanceToTest.runFakeExecution();
        String printout = printoutBuffer.toString();
        String expectedOutput = "started.";
        assertTrue("UI did not start correctly.", printout.contains(expectedOutput));
    }
}