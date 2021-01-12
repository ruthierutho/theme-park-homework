package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    Visitor visitor;
    RollerCoaster rollerCoaster;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        visitor = new Visitor(13, 1.49, 13);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void visitorIsAllowedToRide(){
        assertEquals(true, rollerCoaster.isAllowedTo(visitor));
    }

    @Test
    public void visitorIsAllowedToRide__False(){
        Visitor visitor2 = new Visitor(11, 1.50, 24);
        assertEquals(false, rollerCoaster.isAllowedTo(visitor2));
    }

    @Test
    public void getDefaultPrice(){
        assertEquals(8.40, rollerCoaster.defaultPrice(), 0.01);
    }

    @Test
    public void chargeTallVisitorDouble(){
        Visitor visitor2 = new Visitor(35, 201, 15);
        assertEquals(16.80, rollerCoaster.priceFor(visitor2), 0.01);
    }
}
