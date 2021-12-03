package lessons;

import core.Cat;
import core.Color;

public class Lesson7 {
    public static void main(String[] args) {

        Cat cat = new Cat(1985d, Color.BLACK);
        Cat copyCat = cat.copyCat();

        System.out.println(cat.getColor());
        System.out.println(copyCat.getColor());

        // checks that hashes are different
        System.out.println(cat == copyCat);

    }
}
