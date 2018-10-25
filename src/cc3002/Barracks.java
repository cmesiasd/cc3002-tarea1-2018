package cc3002;

public class Barracks extends AbstractUnitBuildings {

    /**
     * Constructor for a Barracks Buildings
     * @param n Name of the Unit (Type)
     * @param hp Hit Points of the Unit
     * @param dt Damage Taken of the Unit
     */
    public Barracks(String n, float hp, float dt){
        super(n,hp,dt);
    }

    @Override
    public void attack(Attackable attackable) {

    }

    @Override
    public void attackedByInfant(Infantry aInfant) {
        receiveDamage(aInfant.getAttackPoints(), (float) 0.7);
    }

    @Override
    public void attackedByArcher(Archer aArcher) {
        receiveDamage(aArcher.getAttackPoints(), (float) 0.7);
    }

    @Override
    public void attackedByCavalier(Cavalry aCavalier) {
        receiveDamage(aCavalier.getAttackPoints(), (float) 0.7);
    }

    @Override
    public void attackedByMonk(Monk aMonk) {
        receiveDamage(aMonk.getAttackPoints(), (float) 0);
    }

    @Override
    public void attackedBySiege(Siege aSiege) {
        receiveDamage(aSiege.getAttackPoints(), (float) 2);
    }

    @Override
    public void attackedByVillager(Villager aVillager) {
        receiveDamage(aVillager.getAttackPoints(), (float) -0.7);
    }

    @Override
    public void attackedByCastle(Castle aCastle) {
        receiveDamage(aCastle.getAttackPoints(), (float) 0.7);
    }
}
