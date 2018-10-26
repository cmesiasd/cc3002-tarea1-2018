package cc3002;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SiegeTest {
    Infantry Infantry;
    Castle Castle;
    Monk Monk, Monk1;
    Siege Siege,Siege1,Siege2;
    Villager Villager;
    Cavalry Cavalry;
    Archer Archer;
    Barracks Barracks;

    @Before
    public void setUp(){
        Infantry = new Infantry("Infantry", 100,  20);
        Archer = new Archer("Archer", 100,  15);
        Cavalry = new Cavalry("Cavalry", 100, 20);
        Siege = new Siege("Siege", 50,  25);
        Siege1 = new Siege("Siege1",50,25);
        Siege2 = new Siege("Siege1",50,25);
        Castle = new Castle("Castle", 500,  20);
        Villager = new Villager("Villager", 50,  5);
        Monk = new Monk("Monk", 100,  10);
        Barracks = new Barracks("Barracks", 400 );
        Monk1 = new Monk("Monk_full",20,110);
    }
/*
    @Test
    public void attackedByX(){
        Siege.attackedByInfant(Infantry);
        assertEquals(26, Siege.getHitPoints(), 0.01);
        Siege.attackedByArcher(Archer);
        assertEquals(14, Siege.getHitPoints(), 0.01);
        Siege.attackedByCavalier(Cavalry);
        assertEquals(0, Siege.getHitPoints(), 0.01);
        Siege1.attackedBySiege(Siege);
        assertEquals(12.5, Siege1.getHitPoints(), 0.01);
        Siege1.attackedByMonk(Monk);
        assertEquals(12.5,Siege1.getHitPoints(),0.01);
        assertEquals(true,Siege1.isAlive());
        Siege2.attackedByCastle(Castle);
        assertEquals(40, Siege2.getHitPoints(),0.01);
        Siege2.attackedByVillager(Villager);
        assertEquals(42.5, Siege2.getHitPoints(),0.01);
        Siege2.attack(Archer);
        assertEquals(62.5,Archer.getHitPoints(),0.01);
        Siege1.attack(Monk);
        assertEquals(0,Monk.getHitPoints(),0.01);
        assertEquals(false,Monk.isAlive());
    }
*/
    @Test
    public void attack() {
        Siege.attack(Barracks);
        assertEquals(350,Barracks.getHitPoints(), 0.01);
        Siege.attack(Villager);
        assertEquals(12.5,Villager.getHitPoints(),0.01);
    }


    @Test
    public void attackedByInfant() {
        Siege.attackedByInfant(Infantry);
        assertEquals(26,Siege.getHitPoints(),0.01);
        assertTrue(Siege.isAlive());
    }

    @Test
    public void attackedByArcher() {
        Siege.attackedByArcher(Archer);
        assertEquals(38,Siege.getHitPoints(),0.01);
        assertTrue(Siege.isAlive());
    }

    @Test
    public void attackedByCavalier() {
        Siege.attackedByCavalier(Cavalry);
        assertEquals(26,Siege.getHitPoints(),0.01);
        assertTrue(Siege.isAlive());
    }

    @Test
    public void attackedByMonk() {
        Siege.attackedByMonk(Monk);
        assertEquals(50,Siege.getHitPoints(),0.01);
        assertTrue(Siege.isAlive());
    }

    @Test
    public void attackedBySiege() {
        Siege1.attackedBySiege(Siege);
        assertEquals(12.5,Siege1.getHitPoints(),0.01);
        assertTrue(Siege1.isAlive());
    }

    @Test
    public void attackedByVillager() {
        Siege.attackedByVillager(Villager);
        assertEquals(52.5,Siege.getHitPoints(),0.01);
        assertTrue(Siege.isAlive());
    }

    @Test
    public void attackedByCastle() {
        Siege.attackedByCastle(Castle);
        assertEquals(40,Siege.getHitPoints(),0.01);
        assertTrue(Siege.isAlive());
    }

    @Test
    public void getName() {
        assertEquals("Siege",Siege.getName());
        assertNotEquals("Castillo",Siege1.getName());
    }

    @Test
    public void getMaxHP() {
        assertEquals(50,Siege.getMaxHP(),0.01);
        assertNotEquals(100,Siege1.getMaxHP(),0.01);
    }

    @Test
    public void getAttackPoints() {
        assertEquals(25, Siege.getAttackPoints(), 0.1);
        assertNotEquals(500, Siege.getAttackPoints(), 0.1);
        assertEquals(25, Siege1.getAttackPoints(), 0.1);
    }
}