package cc3002;

/**
 * Represents an abstract entity(Unit or Building)
 * @author cmesiasd
 * @version 1.0
 */
public abstract class AbstractUnitBuildings implements Attackable,Attacker {
    private String Name;
    private float HitPoints, AttackPoints, MaxHP;

    /**
     * Constructor for AbstractUnitBuildings Attacker/Attackable
     *
     * @param n  Name of the Unit(Type)
     * @param hp Hit Points of the Unit
     * @param ap Attack Points of the Unit
     */
    public AbstractUnitBuildings(final String n, float hp, final float ap) {
        this.Name = n;
        this.HitPoints = hp;
        this.MaxHP = hp;
        this.AttackPoints = ap;
    }

    /**
     * Constructor for AbstractUnitBuildings Attackable
     *
     * @param n  Name of the Unit(Type)
     * @param hp Hit Points of the Unit
     */
    public AbstractUnitBuildings(final String n, float hp) {
        this.Name = n;
        this.HitPoints = hp;
        this.MaxHP = hp;
    }

    /**
     * Return the name of the Unit
     *
     * @return Unit's name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Return HitPoints of the Unit
     *
     * @return Unit's HP
     */
    public float getHitPoints() {
        return this.HitPoints;
    }

    /**
     * Return the max value of Hit Points of the Unit
     *
     * @return Max Unit's HP
     */
    public float getMaxHP() {
        return this.MaxHP;
    }

    /**
     * Return Attack Points of the Unit
     *
     * @return Unit's AP
     */
    public float getAttackPoints() {
        return this.AttackPoints;
    }


    @Override
    public abstract void attack(Attackable attackable);

    @Override
    public boolean isAlive() {
        return getHitPoints() > 0;
    }

    @Override
    public void receiveDamage(float attackPoints, float factor) {
        if (isAlive()) {
            this.setHitPoints(this.getHitPoints() - attackPoints * factor);
        }
    }

    /**
     * Set the Hit Points of the Unit
     *
     * @param nHP new value of Hit Points
     */
    public void setHitPoints(float nHP) {
        if (nHP <= 0) {
            this.HitPoints = 0;
        } else if (nHP > 2*this.MaxHP) {
            this.HitPoints = 2* this.getMaxHP();
        } else {
            this.HitPoints = nHP;
        }
    }

    /**
     * An entity is attacked and dies at a stroke
     * Set the Hit Points in 0
     */
    public void fullDamage() {
        if (isAlive()) setHitPoints(0);
    }
}

