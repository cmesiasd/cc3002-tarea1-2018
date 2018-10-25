package cc3002;

public class Castle extends AbstractUnitBuildings {

    /**
     * Constructor for a Castle Buildings
     * @param n Name of the Unit (Type)
     * @param hp Hit Points of the Unit
     * @param dt Damage Taken of the Unit
     * @param ap Attackt Points of the Unit
     */
    public Castle(String n, float hp, float dt, float ap){
        super(n, hp, dt, ap);
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
        receiveDamage(aMonk.getAttackPoints(), (float) 0);
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
