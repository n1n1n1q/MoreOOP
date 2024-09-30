import lotr.CharacterFactory;
import lotr.GameManager;

import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        GameManager gm = new GameManager();
        gm.fight(CharacterFactory.createCharacter(), CharacterFactory.createCharacter());
    }
}
