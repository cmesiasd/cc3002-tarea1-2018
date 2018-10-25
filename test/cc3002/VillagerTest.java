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
    public void setUp(){
        Infantry = new Infantry("Infantry", 100,  20);
        Archer = new Archer("Archer", 100,  15);
        Cavalry = new Cavalry("Cavalry", 100, 20);
        Siege = new Siege("Siege", 50,  25);
        Castle = new Castle("Castillo1", 500,  20);
        Villager = new Villager("Villager", 50,  5);
        Villager1 = new Villager("Villager1",50,5);
        Monk = new Monk("Monje", 20,  10);
        Barracks = new Barracks("Barracks", 400 );
        Monk1 = new Monk("Monk_full",20,100);

    }
    @Test
    public void AttackedbyXType() {
        Villager.attackedByInfant(Infantry);
        assertEquals(20, Villager.getHitPoints(), 0.01);
        Villager.attackedByMonk(Monk);
        assertEquals(25,Villager.getHitPoints(),0.01);
        Villager.attackedByArcher(Archer);
        assertEquals(2.5, Villager.getHitPoints(), 0.01);
        Villager.attackedByMonk(Monk1);
        assertEquals(52.5,Villager.getHitPoints(),0.01);
        Villager.attackedByCavalier(Cavalry);
        assertEquals(22.5, Villager.getHitPoints(), 0.01);
        Villager.attackedByMonk(Monk1);
        assertEquals(72.5, Villager.getHitPoints(), 0.01);
        Villager.attackedBySiege(Siege);
        assertEquals(35, Villager.getHitPoints(), 0.01);
        Villager.attackedByMonk(Monk);
        assertEquals(40,Villager.getHitPoints(),0.01);
        Villager.attackedByCastle(Castle);
        assertEquals(16,Villager.getHitPoints(),0.01);
        Villager.attackedByVillager(Villager1);
        assertEquals(11, Villager.getHitPoints(),0.01);
        assertEquals(true,Villager.isAlive());
        Villager1.attack(Archer);
        assertEquals(95,Archer.getHitPoints(),0.01);
        Villager1.attack(Monk);
        assertEquals(20,Monk.getHitPoints(),0.01);
    }
}