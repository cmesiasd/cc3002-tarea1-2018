package cc3002;

public class Infantry extends AbstractUnitBuildings {

    public Infantry(String n, float hp, float dt, float ap){
        super(n, hp, dt, ap);
    }

    @Override
    public void attack(Attackable attackable) {
        attackable.attackedByInfant(this);
    }

    @Override
    public void attackedByInfant(Infantry aInfant) {
        receiveDamage(aInfant.getAttackPoints(),(float) 1.0);
    }

    @Override
    public void attackedByArcher(Archer aArcher) {
        healDamage(aArcher.getAttackPoints(), (float) 1.0);
    }

    @Override
    public void attackedByCavalier(Cavalry aCavalier) {
        receiveDamage(aCavalier.getAttackPoints(), (float) 1.0);
    }

    @Override
    public void attackedByMonk(Monk aMonk) {
        healDamage(aMonk.getAttackPoints(), (float) 0.5);
    }

    @Override
    public void attackedBySiege(Siege aSiege) {
        receiveDamage(aSiege.getAttackPoints(), (float) 1.5);
    }

    @Override
    public void attackedByVillager(Villager aVillager) {
        receiveDamage(aVillager.getAttackPoints(), (float) 0.8);
    }

    @Override
    public void attackedByCastle(Castle aCastle) {
        receiveDamage(aCastle.getAttackPoints(), (float) 1.20);
    }

}
