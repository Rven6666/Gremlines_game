package gremlins;

import processing.core.PApplet;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CharactersTest {

    @Test
    public void constructor() {
        assertNotNull(new Characters(null, 60, 60, 2));
    }

    @Test
    public void getX() {
        Characters charc = new Characters(null, 60, 60, 2);
        assertEquals(charc.getX(), charc.getX());
    }

    @Test
    public void getY() {
        Characters charc = new Characters(null, 60, 60, 2);
        assertEquals(charc.getY(), charc.getY());
    }

    @Test
    public void setY() {
        Characters charc = new Characters(null, 60, 60, 2);
        charc.setY(40);
        assertEquals(40, charc.getY());
    }

    @Test
    public void setX() {
        Characters charc = new Characters(null, 60, 60, 2);
        charc.setX(40);
        assertEquals(40, charc.getX());
    }

    @Test
    public void setSpeed() {
        Characters charc = new Characters(null, 60, 60, 2);
        charc.setSpeed(3);
        assertEquals(3, charc.speed);
    }

    @Test
    public void getIsALive() {
        Characters charc = new Characters(null, 60, 60, 2);
        charc.isAlive = true;
        assertEquals(true, charc.getIsAlive());
    }

    @Test
    public void getdirection() {
        Characters charc = new Characters(null, 60, 60, 2);
        charc.direction = 3;
        assertEquals(3, charc.getDirection());
    }

    @Test
    public void deathCollide() {
        Characters charc = new Characters(null, 60, 60, 2);
        charc.deathCollide();
        assertEquals(false, charc.isAlive);
    }

}
