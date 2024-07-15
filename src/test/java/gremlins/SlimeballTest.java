package gremlins;

import processing.core.PApplet;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SlimeballTest {

    @Test
    public void constructor() {
        assertNotNull(new Slimeball(null, 40, 40, false, 2, null));
        String type = "fire";
        assertNotEquals("slime", type);
    }

    // @Test
    // public void tick() {

    // }

}
