package cc3002;

/**
 * Create the unit of Archers
 * @author cmesias
 * @version 1.0
 */
public class Archer extends AbstractUnitBuildings {

    /**
     * Constructor for a Archer Unit
     * @param n Name of the Unit
     * @param hp Hit Points of the Unit
     * @param ap Attack Point of the Unit
     */
    public Archer(String n, float hp, float ap){
        super(n, hp, ap);
    }

    @Override
    public void attack(Attackable attackable) {
        if(this.isAlive()){
            attackable.attackedByArcher(this);
        }
    }

    @Override
    public void attackedByInfant(Infantry aInfant) {
        receiveDamage(aInfant.getAttackPoints(), (float) 1.2);
    }

    @Override
    public void attackedByArcher(Archer aArcher) {
        receiveDamage(aArcher.getAttackPoints(), (float) 1.2);
    }
    @Override
    public void attackedByCavalier(Cavalry aCavalier) {
        receiveDamage(aCavalier.getAttackPoints(), (float) 1.5);
    }

    @Override
    public void attackedByMonk(Monk aMonk) {
        receiveDamage(aMonk.getAttackPoints(), (float) -0.5);
    }

    @Override
    public void attackedBySiege(Siege aSiege) {
        receiveDamage(aSiege.getAttackPoints(), (float) 1.5);
    }

    @Override
    public void attackedByVillager(Villager aVillager) {
        receiveDamage(aVillager.getAttackPoints(), (float) 1);
    }

    @Override
    public void attackedByCastle(Castle aCastle) {
        receiveDamage(aCastle.getAttackPoints(), (float) 1.2);
    }
}

