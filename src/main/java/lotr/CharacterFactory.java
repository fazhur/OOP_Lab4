package lotr;

import org.reflections.Reflections;

import java.lang.reflect.InvocationTargetException;
import java.util.Objects;
import java.util.Random;
import java.util.Set;

import static org.reflections.scanners.Scanners.SubTypes;

public class CharacterFactory {
    public static Character CreateCharacter() {
        Reflections reflections = new Reflections("lotr");
        Set<Class<?>> characters = reflections.get(SubTypes.of(Character.class).asClass());
        characters.remove(Noble.class);
        Object[] classes = characters.toArray();
        Class character = (Class) classes[new Random().nextInt(classes.length)];
        try {
            Character result = (Character) character.getConstructor().newInstance();
            return result;
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}

