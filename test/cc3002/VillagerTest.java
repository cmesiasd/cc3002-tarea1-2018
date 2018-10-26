package cc3002;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VillagerTest {
    Infantry Infantry;
    Castle Castle;
    Monk Monk, Monk1;
    Siege Siege;
    Villager Villager, Villager1;
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
        Villager1 = new Villager("Villager1",50,5);
        Villager = new Villager("Villager", 50,  5);
        Monk = new Monk("Monk", 100,  10);
        Barracks = new Barracks("Barracks", 400 );
        Monk1 = new Monk("Monk_full",20,110);
    }


    @Test
    public void attack() {
        Villager.attack(Barracks);
        assertEquals(403.5,Barracks.getHitPoints(), 0.01);
        Villager.attack(Villager1);
        assertEquals(45,Villager1.getHitPoints(),0.01);
    }


    @Test
    public void attackedByInfant() {
        Villager.attackedByInfant(Infantry);
        assertEquals(20,Villager.getHitPoints(),0.01);
        assertTrue(Villager.isAlive());
    }

    @Test
    public void attackedByArcher() {
        Villager.attackedByArcher(Archer);
        assertEquals(27.5,Villager.getHitPoints(),0.01);
        assertTrue(Villager.isAlive());
    }

    @Test
    public void attackedByCavalier() {
        Villager.attackedByCavalier(Cavalry);
        assertEquals(20,Villager.getHitPoints(),0.01);
        assertTrue(Villager.isAlive());
    }

    @Test
    public void attackedByMonk() {
        Villager.attackedByMonk(Monk);
        assertEquals(55,Villager.getHitPoints(),0.01);
        assertTrue(Villager.isAlive());
    }

    @Test
    public void attackedBySiege() {
        Villager.attackedBySiege(Siege);
        assertEquals(12.5,Villager.getHitPoints(),0.01);
        assertTrue(Villager.isAlive());
    }

    @Test
    public void attackedByVillager() {
        Villager.attackedByVillager(Villager);
        assertEquals(45,Villager.getHitPoints(),0.01);
        assertTrue(Villager.isAlive());
    }

    @Test
    public void attackedByCastle() {
        Villager.attackedByCastle(Castle);
        assertEquals(26,Villager.getHitPoints(),0.01);
        assertTrue(Villager.isAlive());
    }

    @Test
    public void getName() {
        assertEquals("Villager",Villager.getName());
        assertNotEquals("Castillo",Villager1.getName());
    }

    @Test
    public void getMaxHP() {
        assertEquals(50,Villager.getMaxHP(),0.01);
        assertNotEquals(100,Villager1.getMaxHP(),0.01);
    }

    @Test
    public void getAttacksPoint(){
        assertEquals(5,Villager.getAttackPoints(),0.01);
        assertNotEquals(10,Villager1.getAttackPoints(),0.01);
    }
}