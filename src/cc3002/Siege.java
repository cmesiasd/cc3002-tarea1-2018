package cc3002;

public class Siege extends AbstractUnitBuildings {
    public Siege(String n, float hp, float ap){
        super(n, hp, ap);
    }
    @Override
    public void attack(Attackable attackable) {
        attackable.attackedBySiege(this);
    }

    @Override
    public void attackedByInfant(Infantry aInfant) {
        receiveDamage(aInfant.getAttackPoints(), (float) 1.2);
    }

    @Override
    public void attackedByArcher(Archer aArcher) {
        receiveDamage(aArcher.getAttackPoints(), (float) 0.8);
    }

    @Override
    public void attackedByCavalier(Cavalry aCavalier) {
        receiveDamage(aCavalier.getAttackPoints(), (float) 1.2);
    }

    @Override
    public void attackedByMonk(Monk aMonk) {

    }

    @Override
    public void attackedBySiege(Siege aSiege) {
        receiveDamage(aSiege.getAttackPoints(), (float) 1.5);
    }

    @Override
    public void attackedByVillager(Villager aVillager) {
        receiveDamage(aVillager.getAttackPoints(), (float) -0.5);
    }

    @Override
    public void attackedByCastle(Castle aCastle) {
        receiveDamage(aCastle.getAttackPoints(), (float) 0.5);
    }
}
