package players;

public class Golem extends  Hero{
    private int block;
    public Golem(int health, int damage,   String name) {
        super(health, damage, SuperAbility.Block, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
            boss.setDamage(boss.getDamage() - block);
            System.out.println("Golem " + this.getName()
                    + " block that Damage " + block);


    }
    public void setBlock(int block){this.block = block;}
}
