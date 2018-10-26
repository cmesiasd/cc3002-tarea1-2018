package cc3002;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CastleTest {
    Infantry Infantry;
    Castle Castle,Castle1;
    Monk Monk, Monk1;
    Siege Siege;
    Villager Villager;
    Cavalry Cavalry;
    Archer Archer;
    Barracks Barracks;

    @Before
    public void setUp() throws Exception {
        Infantry = new Infantry("Infantry", 100,  20);
        Archer = new Archer("Archer", 100,  15);
        Cavalry = new Cavalry("Cavalry", 100, 20);
        Siege = new Siege("Siege", 50,  25);
        Castle = new Castle("Castle", 500,  20);
        Castle1 = new Castle("Castle1",500,20);
        Villager = new Villager("Villager", 50,  5);
        Monk = new Monk("Monk", 100,  10);
        Barracks = new Barracks("Barracks", 400 );
        Monk1 = new Monk("Monk_full",20,110);
    }

    @Test
    public void attack() {
        Castle.attack(Barracks);
        assertEquals(386,Barracks.getHitPoints(), 0.01);
        Castle.attack(Castle1);
        assertEquals(498,Castle1.getHitPoints(),0.01);
    }
{
    }
    @Test
    public void attackedByInfant() {
        Castle.attackedByInfant(Infantry);
        assertEquals(494,Castle.getHitPoints(),0.01);
        assertTrue(Castle.isAlive());
    }

    @Test
    public void attackedByArcher() {
        Castle.attackedByArcher(Archer);
        assertEquals(498.5,Castle.getHitPoints(),0.01);
        assertTrue(Castle.isAlive());
    }

    @Test
    public void attackedByCavalier() {
        Castle.attackedByCavalier(Cavalry);
        assertEquals(494,Castle.getHitPoints(),0.01);
        assertTrue(Castle.isAlive());
    }

    @Test
    public void attackedByMonk() {
        Castle.attackedByMonk(Monk);
        assertEquals(500,Castle.getHitPoints(),0.01);
        assertTrue(Castle.isAlive());
    }

    @Test
    public void attackedBySiege() {
        Castle.attackedBySiege(Siege);
        assertEquals(450,Castle.getHitPoints(),0.01);
        assertTrue(Castle.isAlive());
    }

    @Test
    public void attackedByVillager() {
        Castle.attackedByVillager(Villager);
        assertEquals(501.5,Castle.getHitPoints(),0.01);
        assertTrue(Castle.isAlive());
    }

    @Test
    public void attackedByCastle() {
        Castle.attackedByCastle(Castle1);
        assertEquals(498,Castle.getHitPoints(),0.01);
        assertTrue(Castle.isAlive());
    }

    @Test
    public void getName() {
        assertEquals("Castle",Castle.getName());
        assertNotEquals("Castillo",Castle1.getName());
    }

    @Test
    public void getMaxHP() {
        assertEquals(500,Castle.getMaxHP(),0.01);
        assertNotEquals(100,Castle1.getMaxHP(),0.01);
    }

    @Test
    public void getAttackPoints() {
        assertEquals(20, Castle.getAttackPoints(), 0.1);
        assertNotEquals(500, Castle.getAttackPoints(), 0.1);
        assertEquals(20, Castle1.getAttackPoints(), 0.1);
    }


}