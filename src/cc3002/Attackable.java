package cc3002;

/**
 * Attackable interface is implemented in all Units and Buildings
 * Attackable defines the entity that can be attacked
 * @author cmesiasd
 * @version 1.0
 */
public interface Attackable {
    /**
     * Do the unit receive the damage of a Infantry attacking.
     * @param aInfant attacker Unit
     */
    void attackedByInfant(Infantry aInfant);

    /**
     * Do the unit receive the damage of a Archer attacking.
     * @param aArcher attacker Unit
     */
    void attackedByArcher(Archer aArcher);

    /**
     * Do the unit receive the damage of a Cavalier attacking.
     * @param aCavalier attacker Unit
     */
    void attackedByCavalier(Cavalry aCavalier);

    /**
     * Do the unit receive the damage of a Infantry attacking.
     * @param aSiege attacker Unit
     */
    void attackedBySiege(Siege aSiege);

    /**
     * Do the unit receive the damage of a Monk attacking.
     * @param aMonk attacker Unit
     */
    void attackedByMonk(Monk aMonk);

    /**
     * Do the unit receive the damage of a villager attacking.
     * @param aVillager attacker Unit
     */
    void attackedByVillager(Villager aVillager);

    /**
     * Do the unit receive the damage of a Castle attacking.
     * @param aCastle attacker Unit
     */
    void attackedByCastle(Castle aCastle);

    /**
     * Receives an attack.
     *
     * @param attackPoints the attack points to be discounted.
     */
    void receiveDamage(float attackPoints, float factor);

}
