package lotr;

import java.util.Random;

public abstract class Noble extends Character{
    Random rand = new Random();
    public void kick(Character c){
        c.setHp(rand.nextInt(Math.abs(c.getHp() - this.getPower())));
    }
    public Noble(int upper, int lower){
        super(new Random().nextInt(upper+1-lower) + lower,
                new Random().nextInt(upper+1-lower) + lower);
    }
}
