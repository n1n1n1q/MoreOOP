package lotr;

public class Demo {
    public static void main(String[] args) {
        Character t = new Elf();
        System.out.println(t.toString());
        Character t2 = new King();
        new GameManager().fight(t, t2);
    }
}
