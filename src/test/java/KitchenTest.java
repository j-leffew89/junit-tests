import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.*;

public class KitchenTest {

    Kitchen emptyKitchen;
    Kitchen kitchenWithOne;
    Kitchen kitchenWithMany;

    @Before
    public void setUp(){
        emptyKitchen = new Kitchen();

        kitchenWithOne = new Kitchen();
        kitchenWithOne.add("one");

//        kitchenWithMany = new Kitchen();
//        kitchenWithMany.add("blue corn");
//        kitchenWithMany.add("yellow corn");
//        kitchenWithMany.add("yellow corn");
//        kitchenWithMany.add("white corn");

    }

    @Test
    public void testIsEmpty(){
        assertTrue(emptyKitchen.isEmpty());
        assertFalse(kitchenWithOne.isEmpty());
    }

    @Test
    public void testSize(){
        assertEquals(0, emptyKitchen.size());
        assertEquals(1, kitchenWithOne.size());
//        assertEquals(4, kitchenWithMany.size());
    }

    @Test
    public void testAdd(){
        assertTrue(emptyKitchen.isEmpty());
        emptyKitchen.add("new");

        assertEquals(1, emptyKitchen.size());
    }

    @Test
    public void testRemove(){
        kitchenWithOne.pop();
        assertEquals(0, kitchenWithOne.size());
    }

}
