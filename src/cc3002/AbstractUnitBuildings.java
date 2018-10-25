package cc3002;

/**
 * Represents an abstract Unit
 * @author cmesiasd
 */
public abstract class AbstractUnitBuildings implements Attackable,Attacker{
    private String Name;
    private float HitPoints, DamageTaken, AttackPoints, Factor, DamageHeal;

    /**
     * Constructor for AbstractUnitBuildings Attacker/Attackable
     * @param n Name of the Unit(Type)
     * @param hp Hit Points of the Unit
     * @param dt Damage Taken of the Unit
     * @param ap Attack Points of the Unit
     */
    public AbstractUnitBuildings(final String n, float hp, float dt, final float ap){
        this.Name = n;
        this.HitPoints = hp;
        this.DamageTaken = dt;
        this.DamageHeal = 0;
        this.AttackPoints = ap;
        Factor = 1;
    }

    /**
     * Constructor for AbstractUnitBuildings Attackable
     * @param n Name of the Unit(Type)
     * @param hp Hit Points of the Unit
     * @param dt Damage Taken of the Unit
     */
    public AbstractUnitBuildings(final String n, float hp, float dt){
        this.Name = n;
        this.HitPoints = hp;
        this.DamageTaken = dt;
        this.DamageHeal = 0;
        Factor = 1;
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

    public void setHitPoints(){
        if (getHitPoints() > getDamageTaken() + getDamageHeal()) {
            this.HitPoints = this.HitPoints - getDamageTaken() + getDamageHeal();
        }else {
            this.HitPoints = 0;
        }
    }

    /**
     * Return Damage Taken of the Unit
     * @return Unit's Damage Taken
     */
    public float getDamageTaken(){
        return this.DamageTaken;
    }

    public void setDamageTaken(float damage){
        this.DamageTaken = damage;
    }


    /**
     * Return Attack Points of the Unit
     * @return Unit's AP
     */
    public float getAttackPoints(){
        return this.AttackPoints;
    }

    public float getDamageHeal(){
        return this.DamageHeal;
    }

    public void setDamageHeal(float damageHeal) {
        this.DamageHeal = damageHeal;
    }

    @Override
    public abstract void attack(Attackable attackable);

    @Override
    public boolean isAlive() {
        return (this.HitPoints > this.DamageTaken);
    }

    @Override
    public void attackedByInfant(Infantry aInfant) {
        receiveDamage(aInfant.getAttackPoints(), Factor);
    }

    @Override
    public void attackedByArcher(Archer aArcher) {
        receiveDamage(aArcher.getAttackPoints(), Factor);
    }

    @Override
    public void attackedByCavalier(Cavalry aCavalier) {
        receiveDamage(aCavalier.getAttackPoints(), Factor);
    }

    @Override
    public void attackedBySiege(Siege aSiege) {
        receiveDamage(aSiege.getAttackPoints(), Factor);
    }

    @Override
    public void attackedByMonk(Monk aMonk) {
        receiveDamage(aMonk.getAttackPoints(), Factor);
    }

    @Override
    public void attackedByVillager(Villager aVillager) {
        receiveDamage(aVillager.getAttackPoints(), Factor);
    }

    @Override
    public void attackedByCastle(Castle aCastle) {
        receiveDamage(aCastle.getAttackPoints(), Factor);
    }

    @Override
    public void receiveDamage(float attackPoints, float factor) {
        if (isAlive()) {
            this.setDamageTaken(attackPoints * factor);
            this.setHitPoints();
        }
    }

    public void healDamage(float attackPoints, float factor){
        if (isAlive()){
            this.setDamageHeal(attackPoints* factor);
            this.setHitPoints();
        }
    }


    public void fullDamage(){
        if (isAlive()){
            setDamageTaken(getHitPoints());
            setHitPoints();
        }
    }





}

