package lessons;

import core.Cat;

public class Lesson5 {
    public static void main(String[] args) {

        Cat cat = new Cat(1545.5);
        System.out.println(Cat.getCount());

        // check that we can't create cat with weight more than maximum weight (catCount will be decreased since cat considered as dead)
        Cat cat1 = new Cat(10000);
        System.out.println(Cat.getCount());
        System.out.println(cat1.getStatus());

        // create kitten
        Cat kitten = getKitten();
        System.out.println(kitten.getWeight());
        System.out.println(Cat.getCount());

    }

    private static Cat getKitten() {
        return new Cat(1100d);
    }
}
