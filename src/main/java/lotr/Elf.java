package lotr;

public class Elf extends lotr.Character {

    public Elf() {
        super(10, 10);
    }

    @Override
    public void kick(Character character) {
        if (character.getPower() < getPower()) {
            character.setHp(0);
        }
        else {
            setPower(getPower() - 1);
        }
    }
}
