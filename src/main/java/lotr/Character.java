package lotr;

import static java.lang.Integer.max;
import static java.lang.Integer.min;

public abstract class Character {
    private int hp;
    private int power;
    public Character(int hp, int power){
        this.hp = hp;
        this.power = power;
    }
    abstract public void kick(Character c);
    public Boolean isAlive(){
        return this.hp > 0;
    }

    public void setHp(int newVal){
        if (newVal < 0){
            newVal = 0;
        }
        this.hp = newVal;
    }
    public int getHp(){
        return hp;
    }
    public void setPower(int power) {
        this.power = power;
    }
    public int getPower() {
        return power;
    }

    public String toString(){
        return this.getClass().getSimpleName()+"{hp="+hp+", power="+power+"}";
    }
}
