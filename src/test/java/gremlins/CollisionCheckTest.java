package gremlins;

import processing.core.PApplet;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CollisionCheckTest {

    @Test
    public void constructor() {
        App app = new App();
        assertNotNull(new CollisionCheck(app));
    }

}
