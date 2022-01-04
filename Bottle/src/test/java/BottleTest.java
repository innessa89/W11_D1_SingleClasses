import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class BottleTest {

    private Bottle bottle;

    @Before
    public void before(){
        bottle=new Bottle(100);
    }

    @Test
    public void hasVolume(){
        assertEquals(100, bottle.getVolume());
    }

    @Test
    public void bottleHasEnoughVolumeToDrink(){
        assertEquals(90,bottle.drink(10));
    }

    @Test
    public void bottleVolumeIsZero(){
        assertEquals(0,bottle.drink(100));
    }

    @Test
    public void bottleDoesntHaveEnoughVolumeToDrink(){
        assertThrows(RuntimeException.class, () -> bottle.drink(110));
    }

    @Test
    public void emptyBottle(){
       bottle.empty();

       assertEquals(0,bottle.getVolume());
    }

    @Test
    public void fillBottle(){

        bottle.empty();
        bottle.fill(100);

        assertEquals(100,bottle.getVolume());
    }


}
