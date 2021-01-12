package stalls;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;
    Visitor visitor;

    @Before
    public void setUp() throws Exception {
        tobaccoStall = new TobaccoStall("Jacks Drum", "Jack Jarvis", ParkingSpot.B1, 2);
        visitor = new Visitor(19, 1.8, 35.0);
    }

    @Test
    public void hasName() {
        assertEquals("Jacks Drum", tobaccoStall.getName());
    }

    @Test
    public void hasOwner() {
        assertEquals("Jack Jarvis", tobaccoStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals(ParkingSpot.B1, tobaccoStall.getParkingSpot());
    }

    @Test
    public void visitorIsAllowedToEnter(){
        assertEquals(true, tobaccoStall.isAllowedTo(visitor));
    }

    @Test
    public void visitorIsAllowedToEnter__False(){
        Visitor visitor2 = new Visitor(15, 1.7, 80);
        assertEquals(false, tobaccoStall.isAllowedTo(visitor2));
    }
}
