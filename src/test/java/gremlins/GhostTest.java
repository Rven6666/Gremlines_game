package gremlins;

import processing.core.PApplet;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GhostTest {

    public class GremlinsTest {

        @Test
        public void constructor() {
            assertNotNull(new Ghost(null, 3, 60, 60, null));
        }

    }
}
