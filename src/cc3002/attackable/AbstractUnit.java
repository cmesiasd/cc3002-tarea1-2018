package cc3002.attackable;

/**
 * Represents an abstract Unit
 * @author cmesiasd
 */
public abstract class AbstractUnit implements Attackable{
    private String Name;
    private float HitPoints, DamageTaken, AttackPoints;

    /**
     * Constructor for AbstractUnit
     * @param n Name of the Unit
     * @param hp HitPoints
     * @param dt DamageTaken
     * @param ap Attack Points
     */
    public AbstractUnit(String n, float hp, float dt, float ap){
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
    public float getHitPoints(){
        return this.HitPoints;
    }

    /**
     * Return Damage Taken of the Unit
     * @return Unit's Damage Taken
     */
    public float getDamageTaken(){
        return this.DamageTaken;
    }

    /**
     * Return Attack Points of the Unit
     * @return Unit's AP
     */
    public float getAttackPoints(){
        return this.AttackPoints;
    }

    @Override
    public void attackedByInfant(Infantry aInfant) {

    }

    @Override
    public void attackedByArcher(Archer aArcher) {

    }

    @Override
    public void attackedByCavalier(Cavalry aCavalry) {

    }

    @Override
    public void attackedBySiege(Siege aSiege) {

    }

    @Override
    public void attackedByMonk(Monk aMonk) {

    }

    @Override
    public void attackedByVillager(Villager aVillager) {

    }

    @Override
    public void attackedByCastle(Castle aCastle) {

    }


}

