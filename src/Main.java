import Actions.Action;
import Army.Member;
import Classes.Knight;
import Classes.Mage;
import Classes.ShieldBearer;

public class Main {
    public static void main(String[] args) {

        Build.build();

        Action.attackAll();
        Member.report();


        Action.attackAll();
        Member.report();


        Action.defend();
        Member.report();

        Knight.rushAttack();
        Mage.fireBall();
        ShieldBearer.heavyProtection();
    }
}