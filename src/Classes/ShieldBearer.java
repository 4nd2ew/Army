package Classes;

import Army.Member;
import Specializations.Defensive;

public class ShieldBearer extends Member implements Defensive {

    public ShieldBearer(String name, int health, int damage) {
        super(name, health, damage);
    }

    public void defend(){
        System.out.println(getName() + " parried an attack with a shield.\t" + "took 10 damage!");
        setHealth(10);
        lvlUp();
    }

    public static void heavyProtection(){

        for(Member member: getMembers()){
            if(member instanceof ShieldBearer){
                System.out.println();
                System.out.println(member.getName() + " parried an attack with a heavy protection.\t" + "took 5 damage!");
                member.setHealth(5);
                member.lvlUp();
            }
        }
    }
}
