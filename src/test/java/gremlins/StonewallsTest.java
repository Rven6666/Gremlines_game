package gremlins;

import processing.core.PApplet;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StonewallsTest {

    @Test
    public void constructor() {
        assertNotNull(new Stonewalls(null, 60, 60, null, false));
    }

    // @Test
    // public void draw() {
    // App app = new App();
    // AssertTrue(app.image(null, 60, 60));
    // }

}
