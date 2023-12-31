package players;
public abstract class GameEntity {
    private String name;
    private int health;
    private int damage;



    public GameEntity(int health, int damage, String name) {
        this.health = health;
        this.damage = damage;
        this.name = name;


    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if (health > 0) {
            this.health = health;
        } else {
            this.health = 0;
        }
    }


    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getName() {
        return name;
    }




    @Override
    public String toString() {
        return this.name + " HEALTH: " + this.health + " DAMAGE: " + this.damage;
    }
}

