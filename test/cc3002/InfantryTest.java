package cc3002;

import cc3002.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class InfantryTest {
    Infantry Infantry,Infantry1;
    Castle Castle;
    Monk Monk, Monk1;
    Siege Siege;
    Villager Villager;
    Cavalry Cavalry;
    Archer Archer;
    Barracks Barracks;

    @Before
    public void setUp() {
        Infantry = new Infantry("Infantry", 100,  20);
        Infantry1 = new Infantry("Infantry1", 80,  10);
        Archer = new Archer("Archer", 100,  15);
        Cavalry = new Cavalry("Cavalry", 100, 20);
        Siege = new Siege("Siege", 50,  25);
        Castle = new Castle("Castle", 500,  20);
        Villager = new Villager("Villager", 50,  5);
        Monk = new Monk("Monk", 100,  10);
        Barracks = new Barracks("Barracks", 400 );
        Monk1 = new Monk("Monk_full",20,110);
    }

    @Test
    public void attack() {
        Infantry.attack(Barracks);
        assertEquals(386,Barracks.getHitPoints(), 0.01);
        Infantry.attack(Infantry1);
        assertEquals(60,Infantry1.getHitPoints(),0.01);
    }

    @Test
    public void attackedByInfant() {
        Infantry.attackedByInfant(Infantry);
        assertEquals(80,Infantry.getHitPoints(),0.01);
        assertTrue(Infantry.isAlive());
    }

    @Test
    public void attackedByArcher() {
        Infantry.attackedByArcher(Archer);
        assertEquals(82,Infantry.getHitPoints(),0.01);
        assertTrue(Infantry.isAlive());
    }

    @Test
    public void attackedByCavalier() {
        Infantry.attackedByCavalier(Cavalry);
        assertEquals(80,Infantry.getHitPoints(),0.01);
        assertTrue(Infantry.isAlive());
    }

    @Test
    public void attackedByMonk() {
        Infantry.attackedByMonk(Monk1);
        assertEquals(155,Infantry.getHitPoints(),0.01);
        Infantry.attackedByMonk(Monk1);
        assertEquals(200,Infantry.getHitPoints(),0.01);
        assertTrue(Infantry.isAlive());
    }

    @Test
    public void attackedBySiege() {
        Infantry.attackedBySiege(Siege);
        assertEquals(62.5,Infantry.getHitPoints(),0.01);
        assertTrue(Infantry.isAlive());
    }

    @Test
    public void attackedByVillager() {
        Infantry.attackedByVillager(Villager);
        assertEquals(96,Infantry.getHitPoints(),0.01);
        assertTrue(Infantry.isAlive());
    }

    @Test
    public void attackedByCastle() {
        Infantry.attackedByCastle(Castle);
        assertEquals(76,Infantry.getHitPoints(),0.01);
        assertTrue(Infantry.isAlive());
    }

    @Test
    public void getName() {
        assertEquals("Infantry", Infantry.getName());
        assertNotEquals("Castle", Infantry1.getName());
        assertEquals("Infantry1", Infantry1.getName());
    }

    @Test
    public void getMaxHP() {
        assertEquals(100, Infantry.getMaxHP(), 0.1);
        assertNotEquals(150, Infantry1.getMaxHP(), 0.1);
        assertEquals(80, Infantry1.getMaxHP(), 0.1);
    }

    @Test
    public void getAttackPoints() {
        assertEquals(20, Infantry.getAttackPoints(), 0.1);
        assertNotEquals(500, Infantry.getAttackPoints(), 0.1);
        assertEquals(10, Infantry1.getAttackPoints(), 0.1);
    }

}
