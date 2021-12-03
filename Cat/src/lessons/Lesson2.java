package lessons;

import core.Cat;
import java.util.List;
import util.CatFactory;

public class Lesson2 {

    public static void main(String[] args) {

        List<Cat> cats = CatFactory.createCats(10);

        Cat firstCat = cats.get(0);
        Cat secondCat = cats.get(1);

        firstCat.feed(150d);
        secondCat.feed(200.0);

        System.out.println("First cat ate: " + firstCat.getFoodAmountEaten());
        System.out.println("Second cat ate: " + secondCat.getFoodAmountEaten());

        // before peeing
        System.out.println("First cat weight before peeing " + firstCat.getWeight());
        for (int i = 0; i < 5; i++) {
            firstCat.pee();
        }

        // after peeing
        System.out.println("First cat weight after peeing " + firstCat.getWeight());

    }
}
