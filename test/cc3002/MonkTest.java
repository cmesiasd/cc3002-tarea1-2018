package cc3002;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MonkTest {
    Infantry Infantry;
    Castle Castle;
    Monk Monk, Monk1;
    Siege Siege;
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
        Castle = new Castle("Castle", 500,  20);
        Villager = new Villager("Villager", 50,  5);
        Monk = new Monk("Monk", 20,  10);
        Barracks = new Barracks("Barracks", 400 );
        Monk1 = new Monk("Monk_full",20,110);
    }
    @Test
    public void attack() {
        Monk.attack(Infantry);
        assertEquals(105,Infantry.getHitPoints(),0.01);
        Monk.attack(Archer);
        assertEquals(105,Archer.getHitPoints(),0.01);
    }

    @Test
    public void attackedByInfant() {
        Monk.attackedByInfant(Infantry);
        assertEquals(0,Monk.getHitPoints(),0.01);
        assertEquals(false,Monk.isAlive());
    }

    @Test
    public void attackedByArcher() {
        Monk.attackedByArcher(Archer);
        assertEquals(0,Monk.getHitPoints(),0.01);
        assertEquals(false,Monk.isAlive());
    }

    @Test
    public void attackedByCavalier() {
        Monk.attackedByCavalier(Cavalry);
        assertEquals(0,Monk.getHitPoints(),0.01);
        assertEquals(false,Monk.isAlive());
    }

    @Test
    public void attackedByMonk() {
        Monk1.attackedByMonk(Monk);
        assertEquals(20,Monk.getHitPoints(),0.01);
        assertEquals(true,Monk.isAlive());
    }

    @Test
    public void attackedBySiege() {
        Monk.attackedBySiege(Siege);
        assertEquals(0,Monk.getHitPoints(),0.01);
        assertEquals(false,Monk.isAlive());
    }

    @Test
    public void attackedByVillager() {
        Monk.attackedByVillager(Villager);
        assertEquals(20,Monk.getHitPoints(),0.01);
        assertEquals(true,Monk.isAlive());
    }

    @Test
    public void attackedByCastle() {
        Monk.attackedByCastle(Castle);
        assertEquals(0,Monk.getHitPoints(),0.01);
        assertEquals(false,Monk.isAlive());
    }

    @Test
    public void getName() {
        assertEquals("Monk",Monk.getName());
        assertNotEquals("Monkey",Monk1.getName());
        assertEquals("Monk_full",Monk1.getName());
    }

    @Test
    public void getMaxHP() {
        assertEquals(20,Monk.getMaxHP(),0.01);
        assertNotEquals(100,Monk1.getMaxHP(),0.01);
    }

    @Test
    public void getAttackPoints() {
        assertEquals(10, Monk.getAttackPoints(), 0.1);
        assertNotEquals(500, Monk.getAttackPoints(), 0.1);
        assertEquals(110, Monk1.getAttackPoints(), 0.1);
    }
}