package lotr;

public class GameManager {
    public static void fight(Character c1, Character c2) {
        while (c1.isAlive() && c2.isAlive()) {
            System.out.println(c1 + " kicks " + c2);
            c1.kick(c2);
            if (c2.isAlive()) {
                System.out.println(c2 + " continues fight!");
                System.out.println(c2 + " kicks " + c1);
                c2.kick(c1);
                if (c1.isAlive())
                    System.out.println(c1 + " continues fight!");
                else {
                    System.out.println(c1 + " died in the battle(((");
                    break;
                }
            }
            else {
                System.out.println(c2 + " died in the battle(((");
                break;
            }

        }
    }
}
