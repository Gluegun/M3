package lessons;

import core.Cat;
import java.util.List;
import util.CatFactory;

public class Lesson3 {

    public static void main(String[] args) {

        List<Cat> cats = CatFactory.createCats(10);
        System.out.println(Cat.getCount());

        cats.get(0).overMeowCat();
        cats.get(1).overFeedCat();

        System.out.println(Cat.getCount());

        // check that not all cats can meow (after 2 died)
        cats.forEach(Cat::meow);

    }
}
