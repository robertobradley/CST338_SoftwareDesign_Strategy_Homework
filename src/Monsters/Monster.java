package Monsters;

import Abilities.Attack;
import java.util.HashMap;
import java.util.Random;

public abstract class  Monster {
    private Integer hp;
    private Integer xp;
    Integer agi = 7;
    Integer def = 8;
    Integer str = 5;
    protected Attack attack;
    private Integer maxHP;
    private HashMap<String,Integer> items =  new HashMap<>();

    public Monster(Integer maxHP, Integer xp, HashMap<String,Integer> items){
        this.maxHP =  maxHP;
        hp = this.maxHP;
        this.xp = xp;
        this.items =  items;
    }

    public Integer attackTarget(Monster target){
        return this.attack.attack(target);
    }//todo new

    public Integer getHp() {
        return hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    public Integer getXp() {
        return xp;
    }

    public HashMap<String, Integer> getItems() {
        return items;
    }

    public void setItems(HashMap<String, Integer> items) {
        this.items = items;
    }

    public Integer getMaxHP() {
        return maxHP;
    }

    public Integer getAgi() {
        return agi;
    }

    public Integer getDef() {
        return def;
    }

    public Integer getStr() {
        return str;
    }

    public Attack getAttack() {
        return attack;
    }

    Integer getAttribute(Integer min, Integer max){

        Random rand = new Random();
        if(min > max){
            Integer temp = min;
            min = max;
            max = temp;
        }
        return rand.nextInt(max-min) + min;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }//todo needs change

    @Override
    public int hashCode() {
        return super.hashCode();
    }//todo needs change

    @Override
    public String toString(){
        return "hp="+hp + "/" + maxHP;
    }

}
