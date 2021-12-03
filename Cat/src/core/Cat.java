package core;

public class Cat {

    private double weight;
    private double foodAmountEaten;
    private Color color;

    private final double originWeight;

    private static double weightOfAllCats;
    private static int catCount;

    public static final int EYES_AMOUNT = 4;
    public static final double MIN_WEIGHT = 1000.0;
    public static final double MAX_WEIGHT = 9000.0;

    public Cat() {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        weightOfAllCats += weight;
        catCount++;
    }

    public Cat(double weight) {
        this();

        if (weight < MIN_WEIGHT) {
            catCount--;
        }
        if (weight > MAX_WEIGHT) {
            catCount--;
        }
        this.weight = weight;
    }

    public Cat(double weight, Color color) {
        this(weight);
        this.color = color;
    }

    public void meow() {
        if (isCatAlive()) {
            weight = weight - 1;
            System.out.println("Meow");
        } else System.out.println("Cat is dead :(");
    }

    public void pee() {
        if (isCatAlive()) {
            weight -= 10;
            System.out.println("Cat peed");
        } else System.out.println("Dead cat can't pee!");
    }

    public void feed(Double amount) {
        if (isCatAlive()) {
            weight = weight + amount;
            foodAmountEaten += amount;
        } else System.out.println("You cant feed dead cat!");
    }

    public void drink(Double amount) {
        if (isCatAlive()) {
            weight = weight + amount;
        } else System.out.println("Dead cat can't drink!");
    }

    public double getFoodAmountEaten() {
        return foodAmountEaten;
    }

    public Double getWeight() {
        return weight;
    }

    public void overFeedCat() {
        if (!isCatAlive()) {
            System.out.println("Cat is already dead :(");
            return;
        }

        while (!getStatus().equals("Exploded")) {
            this.feed(1d);
        }
        System.out.println(this + " " + getStatus());
        catCount--;
    }

    public void overMeowCat() {
        if (!isCatAlive()) {
            System.out.println("Cat is already dead :(");
            return;
        }

        while (!getStatus().equals("Dead")) {
            meow();
        }
        System.out.println(this + " " + getStatus());
        catCount--;
    }

    public static double getWeightOfAllCats() {
        return weightOfAllCats;
    }

    public String getStatus() {
        if (weight < MIN_WEIGHT) {
            return "Dead";
        } else if (weight > MAX_WEIGHT) {
            return "Exploded";
        } else if (weight > originWeight) {
            return "Sleeping";
        } else {
            return "Playing";
        }
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public static int getCount() {
        return catCount;
    }

    public Cat copyCat() {
        Cat cat = new Cat();
        cat.weight = this.weight;
        cat.color = this.color;
        return cat;
    }

    private boolean isCatAlive() {
        return getStatus().equals("Sleeping") ||
                getStatus().equals("Playing");
    }
}
