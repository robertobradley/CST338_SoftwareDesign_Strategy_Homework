
package Monsters;
import Abilities.MeleeAttack;
import java.util.HashMap;

public class Imp extends Monster{
    public Imp(Integer maxHP, Integer xp, HashMap<String,Integer> items){
        super(maxHP,xp,items);
        //these should be stored in a hash-map.
        //that way we can use an iterator.
        Integer maxStr = 15;
        Integer maxDef = 6;
        Integer maxAgi = 3;

        attack = new MeleeAttack(this);

        //should use a data structure.

        str = super.getAttribute(str,maxStr);
        def = super.getAttribute(def,maxDef);
        agi = super.getAttribute(agi,maxAgi);
    }

    @Override
    public String toString(){
        return "Monsters.Imp has : " + super.toString();
    }
}
