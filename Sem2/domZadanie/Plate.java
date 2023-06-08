package Sem2.domZadanie;

public class Plate {
    private int food;

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public Plate(int food) {
        this.food = food;
    }

    public void info() {
        System.out.println("В тарелке осталось еды:" + food);
    }

    public boolean foodConsunption(int appetite) {
        if (food >= appetite) {
            food -= appetite;
            return true;
        }
        else {
            return false;
        }
    }

}
