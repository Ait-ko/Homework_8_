package players;


import java.util.Random;

public class Thor extends Hero{
    public Thor(int health, int damage, String name) {
        super(health, damage, SuperAbility.Stun, name);

    }




    

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        Random thor = new Random();
        boolean stun = thor.nextBoolean();
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth()>0&&stun==true) {
                boss.setDamage(0);
                System.out.println("Thor stun Boss");
            }
            else {
                boss.setDamage(50);
            }
            break;
        }

        }


    }








