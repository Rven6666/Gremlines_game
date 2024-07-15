package gremlins;

import processing.core.PApplet;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ExitPortalTest {

    @Test
    public void constructor() {
        assertNotNull(new ExitPortal(40, 40, null));
    }

    @Test
    public void getX() {
        ExitPortal exit = new ExitPortal(40,40,null);
        assertEquals(exit.getX(), exit.getX());
    }

    @Test
    public void getY() {
        ExitPortal exit = new ExitPortal(40,40,null);
        assertEquals(exit.getY(), exit.getY());
    }

}
