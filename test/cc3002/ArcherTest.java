package cc3002;

import cc3002.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
public class ArcherTest {
    Infantry Infantry;
    Castle Castle;
    Monk Monk, Monk1;
    Siege Siege;
    Villager Villager;
    Cavalry Cavalry;
    Archer Archer,Archer1;
    Barracks Barracks;


    @Before
    public void setUp() {
        Infantry = new Infantry("Infantry", 100,  20);
        Archer = new Archer("Archer", 100,  15);
        Archer1 = new Archer("Archer1",100,20);
        Cavalry = new Cavalry("Cavalry", 100, 20);
        Siege = new Siege("Siege", 50,  25);
        Castle = new Castle("Castillo1", 500,  20);
        Villager = new Villager("Villager", 50,  5);
        Monk = new Monk("Monje", 20,  10);
        Barracks = new Barracks("Barracks", 400 );
        Monk1 = new Monk("Monk_full",20,100);
    }

    @Test
    public void attack() {
        Archer.attack(Barracks);
        assertEquals(389.5,Barracks.getHitPoints(), 0.01);
        Archer.attack(Archer1);
        assertEquals(82,Archer1.getHitPoints(),0.01);
    }

    @Test
    public void attackedByInfant() {
        Archer.attackedByInfant(Infantry);
        assertEquals(76,Archer.getHitPoints(),0.01);
        assertTrue(Archer.isAlive());
    }

    @Test
    public void attackedByArcher() {
        Archer.attackedByArcher(Archer);
        assertEquals(82,Archer.getHitPoints(),0.01);
        assertTrue(Archer.isAlive());
    }

    @Test
    public void attackedByCavalier() {
        Archer.attackedByCavalier(Cavalry);
        assertEquals(70,Archer.getHitPoints(),0.01);
        assertTrue(Archer.isAlive());
    }

    @Test
    public void attackedByMonk() {
        Archer.attackedByMonk(Monk1);
        assertEquals(150,Archer.getHitPoints(),0.01);
        assertTrue(Archer.isAlive());
    }

    @Test
    public void attackedBySiege() {
        Archer.attackedBySiege(Siege);
        assertEquals(62.5,Archer.getHitPoints(),0.01);
        assertTrue(Archer.isAlive());
    }

    @Test
    public void attackedByVillager() {
        Archer.attackedByVillager(Villager);
        assertEquals(95,Archer.getHitPoints(),0.01);
        assertTrue(Archer.isAlive());
    }

    @Test
    public void attackedByCastle() {
        Archer.attackedByCastle(Castle);
        assertEquals(76,Archer.getHitPoints(),0.01);
        assertTrue(Archer.isAlive());
    }

    @Test
    public void getName() {
        assertEquals("Archer", Archer.getName());
        assertNotEquals("Castle", Archer1.getName());
        assertEquals("Archer1", Archer1.getName());
    }

    @Test
    public void getMaxHP() {
        assertEquals(100, Archer.getMaxHP(), 0.1);
        assertNotEquals(150, Archer1.getMaxHP(), 0.1);
        assertEquals(100, Archer1.getMaxHP(), 0.1);
    }

    @Test
    public void getAttackPoints() {
        assertEquals(15, Archer.getAttackPoints(), 0.1);
        assertNotEquals(500, Archer.getAttackPoints(), 0.1);
        assertEquals(20, Archer1.getAttackPoints(), 0.1);
    }


    /*@Test
    public void AttackedbyX(){
        Archer.attackedByInfant(Infantry);
        assertEquals(76,Archer.getHitPoints(),0.01);
        Archer.attackedByArcher(Archer1);
        assertEquals(52,Archer.getHitPoints(),0.01);
        Archer.attackedByCavalier(Cavalry);
        assertEquals(22,Archer.getHitPoints(),0.01);
        Archer.attackedBySiege(Siege);
        assertEquals(0,Archer.getHitPoints(),0.01);
        assertEquals(false,Archer.isAlive());
        Archer1.attackedByCastle(Castle);
        assertEquals(76,Archer1.getHitPoints(),0.01);
        Archer1.attackedByVillager(Villager);
        assertEquals(71,Archer1.getHitPoints(),0.01);
        Archer1.attackedByMonk(Monk);
        Archer1.attackedByMonk(Monk1);
        assertEquals(81,Archer1.getHitPoints(),0.01);
        Archer1.attack(Siege);
        assertEquals(34,Siege.getHitPoints(),0.01);
    }*/

}
