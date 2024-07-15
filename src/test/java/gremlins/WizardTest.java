package gremlins;

import processing.core.PApplet;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WizardTest {
    @Test
    public void constructor() {
        assertNotNull(new Wizard(null, 0.4, 40, 40, null, 1));

    }

    // @Test
    // public void tick() {

    // Wizard player = new Wizard(null, 0.333, 20, 20, null, 3);

    // player.shotReady = true;
    // player.shotFired = true;
    // if (player.shotReady == true && player.shotFired == true) {
    // assertFalse(player.shotFired == false);
    // assertFalse(player.shotReady == false);
    // }

    // // assertNotNull(new Wizard(null, 0.4, 40, 40, null, 1));

    // }

    @Test
    public void Getlives() {
        Wizard wiz = new Wizard(null, 0.33, 40, 40, null, 2);
        assertEquals(wiz.getLives(), 2);
    }

    @Test
    public void SetLives() {
        Wizard wiz = new Wizard(null, 0.33, 40, 40, null, 2);
        wiz.setLives(1);
        assertEquals(wiz.getLives(), 1);
    }

    @Test
    public void nextLevel() {
        Wizard wiz = new Wizard(null, 0.33, 40, 40, null, 2);
        wiz.setNextLevel(false);
        assertEquals(false, wiz.getNextLevel());
    }

    @Test
    public void coolDown() {
        Wizard wiz = new Wizard(null, 0.33, 40, 40, null, 2);
        wiz.setCoolDown(0.5);

        assertEquals(0.5, wiz.coolDown);
    }

    @Test
    public void upKeyPress() {
        Wizard wiz = new Wizard(null, 0.33, 40, 40, null, 2);
        wiz.setUpKeypress(true);

        assertEquals(true, wiz.upKeyPress);
    }

    @Test
    public void downKeyPress() {
        Wizard wiz = new Wizard(null, 0.33, 40, 40, null, 2);
        wiz.setDownKeypress(true);

        assertEquals(true, wiz.downKeyPress);
    }

    @Test
    public void leftKeyPress() {
        Wizard wiz = new Wizard(null, 0.33, 40, 40, null, 2);
        wiz.setLeftKeypress(true);

        assertEquals(true, wiz.leftKeyPress);
    }

    @Test
    public void rightKeyPress() {
        Wizard wiz = new Wizard(null, 0.33, 40, 40, null, 2);
        wiz.setRightKeypress(true);

        assertEquals(true, wiz.rightKeyPress);
    }
}

// }

// // set UP Key press
// public void setUpKeypress(boolean upKeyPress) {
// this.upKeyPress = upKeyPress;
// }

// // Set Down key press
// public void setDownKeypress(boolean downKeyPress) {
// this.downKeyPress = downKeyPress;
// }

// // set Left key press
// public void setLeftKeypress(boolean leftKeyPress) {
// this.leftKeyPress = leftKeyPress;
// }

// // Set Right Key press
// public void setRightKeypress(boolean rightKeyPress) {
// this.rightKeyPress = rightKeyPress;
// }

// // check/get if next level needs ot be loaded
// public boolean getNextLevel() {
// return this.nextLevel;
// }

// // set the condition of next level
// public boolean setNextLevel(boolean nextLevel) {
// return this.nextLevel;
// }

// public void setCoolDown(double coolDown) {
// this.coolDown = coolDown;
// }