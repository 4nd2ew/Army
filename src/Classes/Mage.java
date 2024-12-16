package Classes;

import Army.Member;
import Specializations.Offensive;

public class Mage extends Member implements Offensive {

    public Mage(String name, int health, int damage){
        super(name, health, damage);
    }

    @Override
    public void attack(){
        System.out.println(getName() + " attacked with a staff\t" + "dealt " + getDamage() + " damage!");
        lvlUp();
    }

    public static void fireBall() {
        for (Member member : getMembers()) {
            if (member instanceof Mage) {
                System.out.println();
                System.out.println(member.getName() + " fired fireBall!\t" + "dealt "
                        + (member.getDamage() + member.getlvl()) + " damage!");
                member.lvlUp();
            }
        }
    }
}
