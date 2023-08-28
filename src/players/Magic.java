package players;

public class Magic extends Hero {
    private int boost ;
    public Magic(int health, int damage, int boost, String name) {
        super(health, damage, SuperAbility.BOOST, name );
        this.boost= boost;
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() > 0){
                heroes[i].setDamage(heroes[i].getDamage() + this.boost);
                System.out.println("Magic  " + this.getName()
                        + " Boost heroes "  + heroes[i].getName()+" by " + boost);


            }

        }


    }

    public void setBoost(int boost) {
        this.boost = boost;
    }


}
