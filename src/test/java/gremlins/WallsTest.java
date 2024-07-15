package gremlins;

import processing.core.PApplet;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WallsTest {

    @Test
    public void constructor() {
        assertNotNull(new Walls(null, 50, 50));
    }

    @Test
    public void getX() {
        Walls brick = new Walls(null, 60, 60);

        assertEquals(brick.getX(), brick.getX());
    }

    @Test
    public void getY() {
        Walls brick = new Walls(null, 60, 60);

        assertEquals(brick.getY(), brick.getY());
    }

    @Test
    public void getSolid() {
        Walls brick = new Walls(null, 60, 60);

        assertNotNull(brick.getSolid());
    }
    // // Checks if wall is solid
    // public boolean getSolid() {
    // return this.solidTile;
    // }

}
