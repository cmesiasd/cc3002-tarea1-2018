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
        Monk1 = new Monk("Monk_full",20,10);
    }

    @Test
    public void getName() {
        assertEquals("Archer", Archer.getName());
        assertNotEquals("Castle", Archer1.getName());
        assertEquals("Archer1", Archer1.getName());
    }

    @Test
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
    }
}
