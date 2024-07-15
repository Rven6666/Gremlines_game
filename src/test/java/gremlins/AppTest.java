package gremlins;

import processing.core.PApplet;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
    @Test
    public void getGameboard() {
        App app = new App();
        int[][] map = app.mapCoordinates;
        assertEquals(map, app.getMapLayout());

    }

    @Test
    public void getSpriteSize() {
        App app = new App();
        int size = app.SPRITESIZE;
        assertEquals(size, app.getSpriteSize());
    }
}
