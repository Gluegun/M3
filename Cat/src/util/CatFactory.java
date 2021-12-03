package util;

import core.Cat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CatFactory {

    public static List<Cat> createCats(int amount) {
        Set<Cat> cats = new HashSet<>();
        for (int i = 0; i < amount; i++) {
            cats.add(new Cat());
        }
        return new ArrayList<>(cats);
    }

}
