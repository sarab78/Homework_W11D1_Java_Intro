import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class WaterBottleTest {

    WaterBottle waterbottle;

    @Before

    public void before(){
        waterbottle = new WaterBottle();
    }

    @Test

    public void volumeStartsAt100(){
        assertEquals(100, waterbottle.getVolume());
    }

    @Test

    public void Drink_10_Sips(){
        assertEquals(90, waterbottle.drinkWater());
    }

    @Test

    public void Bottle_Empty_To_0(){
        assertEquals(0, waterbottle.emptyBottle());
    }

    @Test

    public void Bottle_Refill_to_Full(){
        assertEquals(100, waterbottle.fillBottle());
    }
}
