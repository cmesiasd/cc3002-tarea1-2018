package cc3002;

import cc3002.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CavalryTest {
    Infantry Infantry;
    Castle Castle;
    Monk Monk, Monk1;
    Siege Siege;
    Villager Villager;
    Cavalry Cavalry,Cavalry1;
    Archer Archer;
    Barracks Barracks;

    @Before
    public void setUp() {
        Infantry = new Infantry("Ejercito", 100,  20);
        Archer = new Archer("Archer", 100,  15);
        Cavalry = new Cavalry("Cavalry", 100, 20);
        Cavalry1 = new Cavalry("Cavalry1",100,20);
        Siege = new Siege("Siege", 50,  25);
        Castle = new Castle("Castillo1", 500,  20);
        Villager = new Villager("Villager", 50,  5);
        Monk = new Monk("Monje", 100,  10);
        Barracks = new Barracks("Barracks", 400 );
        Monk1 = new Monk("Monk_full",20,110);
    }
    @Test
    public void attackedByX(){
        Cavalry.attackedByInfant(Infantry);
        assertEquals(76, Cavalry.getHitPoints(), 0.01);
        Cavalry.attackedByArcher(Archer);
        assertEquals(61, Cavalry.getHitPoints(), 0.01);
        Cavalry.attackedByCavalier(Cavalry);
        assertEquals(41, Cavalry.getHitPoints(), 0.01);
        Cavalry.attackedBySiege(Siege);
        assertEquals(16, Cavalry.getHitPoints(), 0.01);
        Cavalry.attackedByMonk(Monk);
        assertEquals(21,Cavalry.getHitPoints(),0.01);
        Cavalry.attackedByMonk(Monk);
        assertEquals(26, Cavalry.getHitPoints(),0.01);
        Cavalry.attackedByCastle(Castle);
        assertEquals(2, Cavalry.getHitPoints(),0.01);
        Cavalry.attackedByVillager(Villager);
        assertEquals(0, Cavalry.getHitPoints(),0.01);
        assertEquals(false,Cavalry.isAlive());
        Cavalry1.attack(Archer);
        assertEquals(70,Archer.getHitPoints(),0.01);
        Cavalry1.attack(Monk);
        assertEquals(0,Monk.getHitPoints(),0.01);
    }

}
