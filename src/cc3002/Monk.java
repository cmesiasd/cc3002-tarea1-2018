package cc3002;

/**
 * Create the unit of Monk
 * @author cmesias
 * @version 1.0
 */
public class Monk extends AbstractUnitBuildings {
    /**
     * Constructor for a Monk Unit
     * @param n Name of the Unit (Type)
     * @param hp Hit Points of the Unit
     * @param ap Attackt Points of the Unit
     */
    public Monk(String n, float hp, float ap){
        super(n, hp, ap);
    }

    @Override
    public void attack(Attackable attackable) {
        attackable.attackedByMonk(this);
    }

    @Override
    public void attackedByInfant(Infantry aInfant) {
        fullDamage();
    }

    @Override
    public void attackedByArcher(Archer aArcher) {
        fullDamage();
    }

    @Override
    public void attackedByCavalier(Cavalry aCavalier) {
        fullDamage();
    }

    @Override
    public void attackedByMonk(Monk aMonk) {
        receiveDamage(aMonk.getAttackPoints(), (float) -0.5);
    }

    @Override
    public void attackedBySiege(Siege aSiege) {
        fullDamage();
    }

    @Override
    public void attackedByVillager(Villager aVillager) { }

    @Override
    public void attackedByCastle(Castle aCastle) {
        fullDamage();
    }

}
