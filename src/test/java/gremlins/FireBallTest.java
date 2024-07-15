package gremlins;

import processing.core.PApplet;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FireBallTest {

    @Test
    public void constructor() {
        assertNotNull(new Fireball(null, 60, 60, false, 3, null));
    }

}
