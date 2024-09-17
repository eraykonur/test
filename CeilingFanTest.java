package test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CeilingFanTest {
    private CeilingFan fan;

    @BeforeEach
    public void initialize() {
        fan = new CeilingFan();
    }

    @Test
    public void testInitialState() {
        assertEquals(0, fan.getSpeed());
        assertEquals("Clockwise", fan.getDirection());
    }

    @Test
    public void testSpeed() {
        fan.pullSpeedCord();
        assertEquals(1, fan.getSpeed());

        fan.pullSpeedCord();
        assertEquals(2, fan.getSpeed());

        fan.pullSpeedCord();
        assertEquals(3, fan.getSpeed());

        fan.pullSpeedCord();
        assertEquals(0, fan.getSpeed()); // Back to initial state
    }

    @Test
    public void testDirection() {
        fan.pullDirectionCord();
        assertEquals("Counterclockwise", fan.getDirection());

        fan.pullDirectionCord();
        assertEquals("Clockwise", fan.getDirection()); // Back to initial state
    }

    @Test
    public void testSpeedAndDirection() {
        fan.pullSpeedCord(); // Speed = 1
        fan.pullDirectionCord(); // Direction = Counterclockwise
        assertEquals(1, fan.getSpeed());
        assertEquals("Counterclockwise", fan.getDirection());

        fan.pullSpeedCord(); // Speed = 2
        assertEquals(2, fan.getSpeed());
        assertEquals("Counterclockwise", fan.getDirection()); // Direction remains reversed

        fan.pullDirectionCord(); // Direction = Clockwise
        assertEquals("Clockwise", fan.getDirection());
    }
}
