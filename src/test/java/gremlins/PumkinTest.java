package gremlins;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PumkinTest {
    @Test
    public void constructor() {
        assertNotNull(new Pumkin(null, 60, 60, false, 0, null));
    }
}
