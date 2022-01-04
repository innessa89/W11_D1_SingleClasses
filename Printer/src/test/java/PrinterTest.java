import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class PrinterTest {

    private Printer printer;


    @Before
    public void before(){
        printer=new Printer(100,50);
    }

    @Test
    public void hasNumberOfSheets(){
        assertEquals(100,printer.getNumberOfSheets());
    }
    @Test
    public void printerHasToner(){
        assertEquals(50,printer.getToner());
    }

    @Test
    public void printerHasEnoughPaper(){
        assertEquals(20,printer.print(8,10));
    }

    @Test
    public void printerDoesntHaveEnoughPaper(){
        assertThrows(RuntimeException.class, () -> printer.print(20,6));
    }



}
