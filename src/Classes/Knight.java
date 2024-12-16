package Classes;

import Army.Member;
import Specializations.Defensive;
import Specializations.Offensive;

public class Knight extends Member implements Defensive, Offensive {

    public Knight(String name, int health, int damage) {
        super(name, health, damage);
    }

    @Override
    public void defend(){
        System.out.println(getName() + " parried an attack with a sword.\t" + "took 10 damage!");
        setHealth(10);
        lvlUp();
    }
    @Override
    public void attack(){
        System.out.println(getName() + " attacked with a sword\t" + "dealt " + getDamage() + " damage!");
        lvlUp();
    }

    public static void rushAttack(){

        for(Member member: getMembers()){
            if(member instanceof Knight){
                System.out.println();
                System.out.println(member.getName() + " attacked rush-attacked!\t" + "dealt "
                        + (member.getDamage() + member.getlvl()) + " damage!");
                member.lvlUp();
            }
        }

    }
}
