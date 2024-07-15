package gremlins;

import processing.core.PApplet;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GremlinsTest {

    @Test
    public void constructor() {
        assertNotNull(new Gremlins(null, 1, 60, 60, null));
    }

    @Test
    public void freeze() {
        Gremlins grem = new Gremlins(null, 1, 60, 60, null);
        grem.setFreeze(true);
        assertEquals(true, grem.freeze);

    }

}
