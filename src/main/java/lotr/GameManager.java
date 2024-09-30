package lotr;

public class GameManager {
    public void fight(Character c1, Character c2){
        System.out.println(c1+" fights with "+c2);
        while (c1.isAlive() && c2.isAlive()){
            if (kick_simulation(c1, c2)){
                break;
            }
            if (kick_simulation(c2, c1)){
               break;
            }
        }
    }
    private boolean kick_simulation(Character c1, Character c2){
        System.out.println(c1 + " kicks "+ c2);
        c1.kick(c2);
        System.out.println(c1.getPower() + " damage done!");
        if (!c2.isAlive()){
            System.out.println(c2+ " is not alive! GGWP");
            return true;
        }
        return false;
    }
}
