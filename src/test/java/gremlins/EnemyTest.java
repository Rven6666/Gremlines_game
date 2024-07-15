package gremlins;

import processing.core.PApplet;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EnemyTest {

    @Test
    public void constructor() {
        assertNotNull(new Enemy(null, 60, 60, 2, null));
    }

}
