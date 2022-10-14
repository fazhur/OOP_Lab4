package lotr;

public abstract class Character {
    private int power;
    private int hp;

    public Character(int power, int hp) {
        this.power = power;
        this.hp = hp;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        if (hp < 0) {
            hp = 0;
        }
        this.hp = hp;

    }

    @Override
    public String toString() {
        Class clas = getClass();
        String pack = clas.getPackage().getName();
        String name = clas.getSimpleName();
        return pack + "." + name + "{" +
                "hp=" + getHp() +
                ", power=" + getPower() +
                '}';
    }

    boolean isAlive() {
        return getHp() > 0;
    }

    public abstract void kick(Character character);
}
