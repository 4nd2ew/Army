package Actions;

import Army.Member;
import Specializations.Defensive;
import Specializations.Offensive;

public class Action {

    public static void attackAll(){
        for(Member member: Member.getMembers()){
            if(member instanceof Offensive){
                ((Offensive) member).attack();
            }
        }
    }

    public static void defend(){
        for(Member member: Member.getMembers()){
            if(member instanceof Defensive){
                ((Defensive) member).defend();
            }
        }
    }
}
