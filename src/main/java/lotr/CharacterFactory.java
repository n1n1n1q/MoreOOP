package lotr;

import java.util.Random;

public class CharacterFactory {
    Character createCharacter(){
        Random rand = new Random();
        int val = rand.nextInt(4);
        switch (val){
            case 0:
                return new Hobbit();
            case 1:
                return new Elf();
            case 2:
                return new King();
        }
        return new Knight();
    }
}
