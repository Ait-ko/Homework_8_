package players;

public class Witcher extends Hero{
    private boolean revived;
    public Witcher(int health, int damage,  String name) {
        super(health, damage, SuperAbility.Resurrection, name);
        this.revived = false;
    }



    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if (!revived && heroes[i].getHealth() <= 0) {
                System.out.println(this.getName() + " sacrifices themselves to revive " + heroes[i].getName() + "!");
                heroes[i].setHealth(heroes[i].getHealth() + this.getHealth());
                revived = true;
                setHealth(0);
            }
        }

        }


    }

