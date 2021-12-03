package lessons;

import core.Cat;
import java.util.List;
import util.CatFactory;

public class Lesson1 {
    public static void main(String[] args) {

        List<Cat> cats = CatFactory.createCats(7);
        Double allCatsWeight = cats.stream().map(Cat::getWeight).reduce(Double::sum).orElse(0.0);

        // two ways of checking weight of all cats
        System.out.println(Cat.getWeightOfAllCats());
        System.out.println(allCatsWeight);

        Cat firstCat = cats.get(0);
        Cat secondCat = cats.get(1);

        Double weightOfFirstCatBeforeEat = firstCat.getWeight();
        Double weightOfSecondCatBeforeEat = secondCat.getWeight();

        // feeding 2 different cats
        firstCat.feed(100.0);
        secondCat.feed(150.0);

        System.out.println("Difference in weight of first cat after its feeding: " + (firstCat.getWeight() -
                weightOfFirstCatBeforeEat));

        System.out.println("Difference in weight of second cat after its feeding: " + (secondCat.getWeight() -
                weightOfSecondCatBeforeEat));

        firstCat.overFeedCat();
        secondCat.overMeowCat();

        System.out.println(firstCat.getStatus());
        System.out.println(secondCat.getStatus());

    }
}
