import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void before(){
        calculator=new Calculator();
    }

    @Test
    public void add(){
        assertEquals(4, calculator.addition(2,2));
    }

    @Test
    public void substruct(){
        assertEquals(2,calculator.subtraction(4,2));
    }

    @Test
    public void divide(){
        assertEquals(5.00,calculator.division(10,2),0.0);
    }

    @Test
    public void multiply(){
        assertEquals(9,calculator.multiplication(3,3));
    }
}
