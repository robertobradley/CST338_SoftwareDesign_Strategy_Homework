package Monsters;

import Abilities.RangedAttack;

import java.util.HashMap;

public class Kobold extends Monster{
    public Kobold(Integer maxHP, Integer xp, HashMap<String,Integer> items){
        super(maxHP,xp,items);
        //these should be stored in a hash-map.
        //that way we can use an iterator.
        Integer maxStr = 15;
        Integer maxDef = 6;
        Integer maxAgi = 3;

        attack = new RangedAttack(this);

        //should use a data structure.

        str = super.getAttribute(str,maxStr);
        def = super.getAttribute(def,maxDef);
        agi = super.getAttribute(agi,maxAgi);
    }

    @Override
    public String toString(){
        return "Monsters.Kobold has : " + super.toString();
    }
}
