package gremlins;

import processing.core.PApplet;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProjectileTest {

    @Test
    public void constructor() {
        assertNotNull(new Projectile(null, 60, 60, false, 0, null));
    }

    // @Test
    // public void tick() {
    // Projectile proj = new Projectile(null, 60, 60, false, 0, null);
    // int direction = 0;
    // proj.setCollision(true);

    // // if statement to check which direction the projectile has been shot.
    // if (direction == 0) {
    // assertEquals(direction, 0);
    // } else if (direction == 1) {
    // right();
    // } else if (direction == 2) {
    // up();
    // } else if (direction == 3) {
    // down();
    // }
    // }

    @Test
    public void getX() {
        Projectile proj = new Projectile(null, 60, 60, false, 2, null);

        assertEquals(proj.getX(), proj.getX());
    }

    @Test
    public void getY() {
        Projectile proj = new Projectile(null, 60, 60, false, 2, null);

        assertEquals(proj.getY(), proj.getY());
    }

    @Test
    public void right() {
        Projectile proj = new Projectile(null, 60, 60, false, 2, null);
        int xtest = proj.getX();
        proj.right();
        assertNotEquals(xtest, proj.getX());
    }

    @Test
    public void Left() {
        Projectile proj = new Projectile(null, 60, 60, false, 2, null);
        int xtest = proj.getX();
        proj.left();
        assertNotEquals(xtest, proj.getX());
    }

    @Test
    public void up() {
        Projectile proj = new Projectile(null, 60, 60, false, 2, null);
        int xtest = proj.getY();
        proj.up();
        assertNotEquals(xtest, proj.getY());
    }

    @Test
    public void down() {
        Projectile proj = new Projectile(null, 60, 60, false, 2, null);
        int xtest = proj.getY();
        proj.down();
        assertNotEquals(xtest, proj.getY());
    }

    @Test
    public void getcollision() {
        Projectile proj = new Projectile(null, 60, 60, false, 2, null);
        proj.setCollision(true);
        assertTrue(proj.getCollision());
    }

    @Test
    public void SetCollision() {
        Projectile proj = new Projectile(null, 60, 60, false, 2, null);
        proj.setCollision(true);
        assertTrue(proj.getCollision());
    }

    @Test
    public void SetshotFired() {
        Projectile proj = new Projectile(null, 60, 60, false, 2, null);
        proj.setShot(false);
        assertTrue(proj.getShot());
    }

}
