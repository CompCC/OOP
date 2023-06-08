package Sem2.domZadanie;

public class Cat {
    private final String name;
    private final int appetite;
    private boolean satiety;

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public boolean isSatiety() {
        return satiety;
    }

    public void setSatiety(boolean satiety) {

        this.satiety = satiety;
    }

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    public void eat(Plate p) {
        System.out.println("Кот ест....");
        if (p.foodConsunption(appetite)) {
            satiety = true;
            System.out.println("Кот поел! :)");
        }
        else {
            System.out.println("Кот не смог поесть! В миске слишком мало еды :(");
        }

    }


//    public String displayInfo() {
//        return String.format("Сытость кота %s, %b",name,satiety);
//    }
}
