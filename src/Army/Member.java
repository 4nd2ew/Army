package Army;

import java.util.ArrayList;

public class Member{
    private final String name;
    private int health;
    private int damage;
    private int lvl = 1;
    private static int count = 0;
    private static final ArrayList<Member> members = new ArrayList<>();

    public Member(String name, int health, int damage){
        this.name = name;
        this.health = health;
        this.damage = damage;
        count++;
        members.add(this);
    }

    public String getName(){
        return this.name;
    }

    public int getHealth(){
        return this.health;
    }

    public int setHealth(int damageTook){
        return this.health - (damageTook - lvl);
    }

    public int getlvl(){
        return this.lvl;
    }

    public static ArrayList<Member> getMembers(){
        return members;
    }

    public static int getCount() {
        return count;
    }

    public int getDamage(){
        return this.damage;
    }

    public void lvlUp(){
        lvl++;
        this.damage += lvl;
    }

    public static void report(){
        for(Member member: members){
            System.out.println("\n---" + member.getName() + "---");
            System.out.println("Lvl: " + member.getlvl());
            System.out.println("Health: " + member.getHealth());
            System.out.println("Damage: " + member.getDamage());
        }
    }
}
