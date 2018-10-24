package cc3002.attackable;

/**
 * Represents an abstract Unit
 * @author cmesiasd
 */
public abstract class AbstractUnit implements Attackable{
    private String Name;
    private int HitPoints, DamageTaken, AttackPoints;

    /**
     * Constructor for AbstractUnit
     * @param n Name of the Unit
     * @param hp HitPoints
     * @param dt Damage Taken
     * @param ap Attack Points
     */
    public AbstractUnit(String n, int hp, int dt, int ap){
        this.Name = n;
        this.HitPoints = hp;
        this.DamageTaken = dt;
        this.AttackPoints = ap;
    }

    /**
     * Return the name of the Unit
     * @return Unit's name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Return HitPoints of the Unit
     * @return Unit's HP
     */
    public int getHitPoints(){
        return this.HitPoints;
    }

    /**
     * Return Damage Taken of the Unit
     * @return Unit's Damage Taken
     */
    public int getDamageTaken(){
        return this.DamageTaken;
    }

    /**
     * Return Attack Points of the Unit
     * @return Unit's AP
     */
    public int getAttackPoints(){
        return this.AttackPoints;
    }
}

