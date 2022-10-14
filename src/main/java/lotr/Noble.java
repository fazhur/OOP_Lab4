package lotr;

import java.util.Random;

public abstract class Noble extends lotr.Character {
    public Noble(int min, int max) {
        super(new Random().nextInt(max - min + 1) + min, new Random().nextInt(max - min + 1) + min);
    }

    @Override
    public void kick(Character character) {
        character.setHp(character.getHp() - new Random().nextInt(getPower() + 1));
    }
}
