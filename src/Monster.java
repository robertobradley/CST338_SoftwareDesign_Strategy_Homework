import java.util.HashMap;

public abstract class  Monster {
    private Integer hp;
    private Integer xp;
    private Integer maxHP;
    private HashMap<String,Integer> items =  new HashMap<>();

    public Monster(Integer maxHP, Integer xp, HashMap<String,Integer> items){
        this.maxHP =  maxHP;
        hp = this.maxHP;
        this.xp = xp;
        this.items =  items;
    }

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

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString(){
        return "hp="+hp + "/" + maxHP;
    }

    public void setXp(Integer xp) {
        this.xp = xp;
    }

    public void setMaxHP(Integer maxHP) {
        this.maxHP = maxHP;
    }


}
