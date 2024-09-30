package lotr;
import java.lang.reflect.InvocationTargetException;
import org.reflections.Reflections;

import java.util.ArrayList;
import java.util.Random;
import java.util.Set;

public class CharacterFactory {
    public static Character createCharacter() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Random rand = new Random();
        Reflections reflections = new Reflections("lotr");
        Set<Class<? extends Character>> subTypes = reflections.getSubTypesOf(Character.class);
        ArrayList<Class<? extends Character>> arr = new ArrayList<>();
        for (Class<? extends Character> subType : subTypes) {
            if (!subType.equals(Noble.class)) {
                arr.add(subType);
            }
        }
        Class<? extends Character> res = arr.get(rand.nextInt(arr.size()));
        return res.getDeclaredConstructor().newInstance();
    }

    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        CharacterFactory f = new CharacterFactory();
        System.out.println(CharacterFactory.createCharacter());
    }
}
