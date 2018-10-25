package cc3002;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BarracksTest {
    Infantry Infantry;
    Castle Castle;
    Monk Monk, Monk1;
    Siege Siege;
    Villager Villager;
    Cavalry Cavalry;
    Archer Archer;
    Barracks Barracks,Barracks1;

    @Before
    public void setUp() throws Exception {
        Infantry = new Infantry("Ejercito", 100,  20);
        Archer = new Archer("Archer", 100,  15);
        Cavalry = new Cavalry("Cavalry", 100, 20);
        Siege = new Siege("Siege", 50,  25);
        Castle = new Castle("Castle", 500,  20);
        Villager = new Villager("Villager", 50,  5);
        Monk = new Monk("Monje", 100,  10);
        Barracks = new Barracks("Barracks", 400 );
        Barracks1 = new Barracks("Barracks1",400);
        Monk1 = new Monk("Monk_full",20,110);
    }

    @Test
    public void attackedByInfant() {
        Barracks.attackedByInfant(Infantry);
        assertEquals(386,Barracks.getHitPoints(),0.01);
        assertEquals(true,Barracks.isAlive());
    }

    @Test
    public void attackedByArcher() {
        Barracks.attackedByArcher(Archer);
        assertEquals(389.5,Barracks.getHitPoints(),0.01);
        assertEquals(true,Barracks.isAlive());
    }

    @Test
    public void attackedByCavalier() {
        Barracks.attackedByCavalier(Cavalry);
        assertEquals(386,Barracks.getHitPoints(),0.01);
        assertEquals(true,Barracks.isAlive());
    }

    @Test
    public void attackedByMonk() {
        Barracks.attackedByMonk(Monk);
        assertEquals(400,Barracks.getHitPoints(),0.01);
        assertEquals(true,Barracks.isAlive());
    }

    @Test
    public void attackedBySiege() {
        Barracks.attackedBySiege(Siege);
        assertEquals(350,Barracks.getHitPoints(),0.01);
        assertEquals(true,Barracks.isAlive());
    }

    @Test
    public void attackedByVillager() {
        Barracks.attackedByVillager(Villager);
        assertEquals(403.5,Barracks.getHitPoints(),0.01);
        assertEquals(true,Barracks.isAlive());
    }

    @Test
    public void attackedByCastle() {
        Barracks.attackedByCastle(Castle);
        assertEquals(386,Barracks.getHitPoints(),0.01);
        assertEquals(true,Barracks.isAlive());
    }

    @Test
    public void attack() {
        Barracks.attack(Barracks1);
        assertEquals(400,Barracks1.getHitPoints(),0.01);
    }

}