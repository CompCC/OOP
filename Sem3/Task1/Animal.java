package Sem3.Task1;

import java.util.Random;

public abstract class Animal {

    protected String name;
    protected int maxSwim;
    protected int maxRun;

    private static int id = 10;
    private static int counter;

    public static int getCounter() {
        return counter;
    }

    private static int identifier;

    public int getIdentifier() {
        return identifier;
    }

    private static Random random = new Random();

    static {
        System.out.println("Static initialiser");
        if ((random.nextInt(2) == 0)) {
            identifier = 1000;
        } else {
            identifier = 2000;
        }
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getMaxSwim() {
        return maxSwim;
    }

    public int getMaxRun() {
        return maxRun;
    }


    {
        System.out.println("Initaliser");
        id = ++identifier;
        counter++;
    }


    public Animal(String name, int maxSwim, int maxRun) {
        System.out.println("Construtor");
        this.name = name;
        this.maxSwim = maxSwim;
        this.maxRun = maxRun;
    }


    void run(int distanse) {
        if (distanse <= maxRun) {
            System.out.printf("%s пробежал %d метров\n", name, distanse);
        } else {
            System.out.printf("%s не смог пробежать %d метров\n", name, distanse);
        }
    }

    void swim(int distanse) {
        if (distanse <= maxSwim) {
            System.out.printf("%s проплыл %d метров\n", name, distanse);
        } else {
            System.out.printf("%s не смог проплыть %d метров\n", name, distanse);
        }

    }
}
