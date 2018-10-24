package cc3002.attackable;

public interface Attackable {
    void attackedByInfant(Infantry aInfant);
    void attackedByArcher(Archer aArcher);
    void attackedByCavalier(Cavalry aCavalry);
    void attackedBySiege(Siege aSiege);
    void attackedByMonk(Monk aMonk);
    void attackedByVillager(Villager aVillager);
    void attackedByCastle(Castle aCastle);
}
