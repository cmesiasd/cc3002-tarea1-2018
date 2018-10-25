import cc3002.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestInfrantry {
    Infantry Infantry;
    Castle Castle;
    Monk Monk;
    Infantry Infantry1;
    Siege Siege;
    Villager Villager;
    Cavalry Cavalry;
    Archer Archer;
    Barracks Barracks;

    @Before
    public void Before() {
        Infantry = new Infantry("Ejercito", 100, 0, 20);
        Infantry1 = new Infantry("Ejercito1", 80, 0, 10);
        Archer = new Archer("Archer", 100, 0, 15);
        Cavalry = new Cavalry("Cavalry", 100, 0, 20);
        Siege = new Siege("Siege", 90, 0, 25);
        Castle = new Castle("Castillo1", 500, 0, 10);
        Villager = new Villager("Villager", 60, 0, 5);
        Monk = new Monk("Monje", 100, 0, 10);
        Barracks = new Barracks("Barracks", 400, 0);
    }

    @Test
    public void getName() {
        assertEquals("Ejercito", Infantry.getName());
        assertNotEquals("Castle", Infantry1.getName());
        assertEquals("Ejercito1", Infantry1.getName());
    }

    @Test
    public void getHP() {
        assertEquals(100, Infantry.getHitPoints(), 0.1);
        assertNotEquals(150, Infantry1.getHitPoints(), 0.1);
        assertEquals(80, Infantry1.getHitPoints(), 0.1);
    }

    @Test
    public void getAttackPoints() {
        assertEquals(20, Infantry.getAttackPoints(), 0.1);
        assertNotEquals(500, Infantry.getAttackPoints(), 0.1);
        assertEquals(10, Infantry1.getAttackPoints(), 0.1);
    }

    @Test
    public void isAlive() {
        assertEquals(true, Infantry.isAlive());
        assertNotEquals(false, Infantry1.isAlive());
        assertEquals(true, Infantry1.isAlive());
    }

    @Test
    public void AttackedbyXType() {
        Infantry.attackedByInfant(Infantry1);
        assertEquals(90, Infantry.getHitPoints(), 0.1);
        Infantry.attackedByArcher(Archer);
        assertEquals(72, Infantry.getHitPoints(), 0.1);
        Infantry.attackedByCavalier(Cavalry);
        assertEquals(52, Infantry.getHitPoints(), 0.1);
        Infantry.attackedBySiege(Siege);
        assertEquals(14.5, Infantry.getHitPoints(), 0.1);
        Infantry.attackedByMonk(Monk);
        assertEquals(19.5,Infantry.getHitPoints(),0.1);
    }
}
