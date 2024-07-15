package gremlins;

import processing.core.PApplet;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BrickWallTest {

    @Test
    public void constructor() {
        assertNotNull(new Brickwalls(null, 60, 60, null, false));
    }

    @Test
    public void checkDestruction() {
        Brickwalls brick = new Brickwalls(null, 60, 60, null, false);
        assertNotEquals(2, brick.checkDestruction(2));

    }

    @Test
    public void fireCollision() {
        Brickwalls brick = new Brickwalls(null, 60, 60, null, false);
        brick.fireCollision();

        assertTrue(brick.hit);

    }

    @Test
    public void getDestroyed() {
        Brickwalls brick = new Brickwalls(null, 60, 60, null, false);
        brick.destroyed = true;

        assertEquals(true, brick.getDestroyed());

    }

}

// // increments the images of brick to be destroyed when hit
// public int checkDestruction(int currentImage) {
// return ++currentImage;
// }

// // starts animation sequence if hit by fireball
// public void fireCollision() {
// this.hit = true;
// }

// // checks if brickwall has been destroyed
// public boolean getDestroyed() {
// return this.destroyed;
// }
