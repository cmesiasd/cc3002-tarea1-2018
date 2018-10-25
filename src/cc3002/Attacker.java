package cc3002;

/**
 * The Attacker interface is implemented by some Units and Buildings
 * It extends to "Attackaable", since all Attackers can be attacked
 * Attacker defines the entity that can execute an attack
 * @author cmesiasd
 * @version 1.0
 */

public interface Attacker extends Attackable {

    /**
     * Attack a attackable Unit
     * @param attackable
     */
    void attack(Attackable attackable);

    /**
     * Whether the unit is dead or not.
     *
     * @return true if the unit is dead, false if not.
     */
    boolean isAlive();
}
