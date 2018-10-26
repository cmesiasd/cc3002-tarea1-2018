package cc3002;

/**
 * Create the unit of Castle
 * @author cmesias
 * @version 1.0
 */
public class Castle extends AbstractUnitBuildings {

    /**
     * Constructor for a Castle Buildings
     * @param n Name of the Unit (Type)
     * @param hp Hit Points of the Unit
     * @param ap Attackt Points of the Unit
     */
    public Castle(String n, float hp, float ap){
        super(n, hp, ap);
    }

    @Override
    public void attack(Attackable attackable) {
        attackable.attackedByCastle(this);
    }

    @Override
    public void attackedByInfant(Infantry aInfant) {
        receiveDamage(aInfant.getAttackPoints(), (float) 0.3);
    }

    @Override
    public void attackedByArcher(Archer aArcher) {
        receiveDamage(aArcher.getAttackPoints(), (float) 0.1);
    }

    @Override
    public void attackedByCavalier(Cavalry aCavalier) {
        receiveDamage(aCavalier.getAttackPoints(), (float) 0.3);
    }

    @Override
    public void attackedByMonk(Monk aMonk) {
        ;
    }

    @Override
    public void attackedBySiege(Siege aSiege) {
        receiveDamage(aSiege.getAttackPoints(), (float) 2.0);
    }

    @Override
    public void attackedByVillager(Villager aVillager) {
        receiveDamage(aVillager.getAttackPoints(), (float) -0.3);
    }

    @Override
    public void attackedByCastle(Castle aCastle) {
        receiveDamage(aCastle.getAttackPoints(), (float) 0.1);
    }
}
