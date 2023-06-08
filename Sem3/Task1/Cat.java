package Sem3.Task1;

public class Cat extends Animal {
    private static int catCounter;

    public static int getCatCounter() {
        return catCounter;
    }

    {
        System.out.println("Initializer Cat");
        catCounter++;
    }

    public Cat(String name) {
        super(name, 0, 200);
    }

    @Override
    void swim(int distanse) {
        System.out.printf(name + " не умеет плавать!\n");
    }
}
