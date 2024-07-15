package gremlins;

import processing.core.PApplet;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PowerUpTest {

    @Test
    public void constructor() {
        assertNotNull(new PowerUp(null, 60, 60, null));

    }

    @Test
    public void getX() {
        PowerUp power = new PowerUp(null, 60, 60, null);

        assertEquals(power.getX(), power.getX());
    }

    @Test
    public void getY() {
        PowerUp power = new PowerUp(null, 60, 60, null);

        assertEquals(power.getY(), power.getY());
    }

    @Test
    public void setCollision() {
        PowerUp power = new PowerUp(null, 60, 60, null);
        power.setCollision(true);

        assertTrue(power.getCollision());

    }

}
