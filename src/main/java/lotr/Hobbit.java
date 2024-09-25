package lotr;

public class Hobbit extends Character {
    public Hobbit(){
        super(3, 0);
    }
    public void kick(Character c){
        toCry();
    }
    private void toCry(){
        System.out.println("Hobbit cried about it");
    }
}
//attributes: int power=0, int hp=3
//methods: void kick(Character c) { toCry() }