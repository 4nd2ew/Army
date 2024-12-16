import Army.Member;
import Classes.Knight;
import Classes.Mage;
import Classes.ShieldBearer;

import java.util.ArrayList;

public class Build{
    public static void build(){
        Member knight1 = new Knight("Andrew", 100, 50);
        Member knight2 = new Knight("Andrewo", 100, 50);
        Member mage1 = new Mage("Franta", 80, 70);
        Member shieldBearer1 = new ShieldBearer("Loupak", 150, 40);
    }
}
