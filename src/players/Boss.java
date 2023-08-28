package players;

import general.RPG_Game;

public class Boss extends GameEntity {
    private SuperAbility defence;
    
    int health;
    private  boolean isStun= false;


    public Boss(int health, int damage, String name) {
        super(health, damage, name);
        this.isStun = isStun();
        
    }

    public SuperAbility getDefence() {
        return defence;
    }
    public void takeDamage( int damage) {
         health-= damage;
    }

    public void chooseDefence() {
        SuperAbility[] values = SuperAbility.values();
        int index = RPG_Game.random.nextInt(values.length);
        this.defence = values[index];
    }

    public boolean isStun() {
        return isStun;
    }

    public void setStun(boolean stun) {
        isStun = stun;
    }



    public void attack(Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() > 0) {
                if (heroes[i] instanceof Berserk && heroes[i].getAbility() != this.defence) {
                    int blocked;
                    if (RPG_Game.random.nextBoolean()) { // true || false
                        blocked = this.getDamage() / 2; // 50 / 2 = 25
                    } else {
                        blocked = this.getDamage() / 5; // 50 / 5 = 10
                    }
                    ((Berserk) heroes[i]).setBlockedDamage(blocked);
                    heroes[i].setHealth(heroes[i].getHealth() - (this.getDamage() - blocked));
                } else {
                    heroes[i].setHealth(heroes[i].getHealth() - this.getDamage());
                }
                if (heroes[i] instanceof Golem && heroes[i].getAbility() != this.defence) {
                    int block;
                    if (RPG_Game.random.nextBoolean()) {
                        block = this.getDamage() / 20;
                    } else {
                        block = this.getDamage() / 25;
                    }

                    ((Golem) heroes[i]).setBlock(block);
                }
                if (heroes[i] instanceof Barbarian && heroes[i].getAbility() != this.defence) {
                    int rage;
                    if (RPG_Game.random.nextBoolean()) {
                        rage = this.getDamage() / 10;
                    } else {
                        rage = this.getDamage() / 20;
                    }

                    ((Barbarian) heroes[i]).setRage(rage);
                }




                }
            }}








    @Override
    public String toString() {
        return "BOSS " + super.toString() + " DEFENCE: " + this.defence + "\n";
    }


}
