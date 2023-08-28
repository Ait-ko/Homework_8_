package players;

public class Barbarian extends Hero{
    int rage ;
    public Barbarian(int health, int damage, String name) {
        super(health, damage, SuperAbility.Rage, name);
    }

    public void setRage(int rage) {
        this.rage = rage;
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        this.setDamage(this.getDamage()+ rage);
        System.out.println("Barbarian " + this.getName()
                + " in Rage " + rage);

    }
}
