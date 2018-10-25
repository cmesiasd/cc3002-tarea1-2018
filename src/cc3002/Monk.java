package cc3002;

public class Monk extends AbstractUnitBuildings {
    public Monk(String n, float hp, float dt, float ap){
        super(n, hp, dt, ap);
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
    public void attackedByVillager(Villager aVillager) {
        receiveDamage(aVillager.getAttackPoints(), (float) 0);
    }

    @Override
    public void attackedByCastle(Castle aCastle) {
        fullDamage();
    }

}
