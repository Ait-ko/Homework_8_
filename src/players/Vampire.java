package players;

public class Vampire extends  Hero{
    private int stolenHealth = 0;
    public Vampire(int health, int damage,  String name) {
        super(health, damage, SuperAbility.StolenHealth, name);
    }

    public int getStolenHealth() {
        return stolenHealth;
    }


    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        boss.takeDamage(10);
        stolenHealth += 10;
        this.setHealth( this.getHealth() + 10);
        System.out.println("Vampire " + " stolen Health " + stolenHealth);


    }
}
