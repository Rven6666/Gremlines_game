package gremlins;

import processing.core.PApplet;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TimerTest {

    @Test
    public void constructor() {
        assertNotNull(new Timer(15));
    }

    @Test
    public void getTime() {
        Timer time = new Timer(10);
        assertEquals(time.getTime(), 10);
    }

    @Test
    public void setTime() {
        Timer time = new Timer(7);
        time.setTime(8);
        assertEquals(time.getTime(), 8);
    }

    @Test
    public void countUp() {
        Timer time = new Timer(10);
        time.countUp();
        assertTrue(time.getTime() > 10);
    }

    @Test
    public void countDown() {
        Timer time = new Timer(10);
        time.countDown();
        assertTrue(time.getTime() < 10);
    }

}
