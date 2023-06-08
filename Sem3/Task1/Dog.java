package Sem3.Task1;

public class Dog extends Animal{
    public Dog(String name) {
        super(name, 10, 500);
    }
    private static int counter;
    public static int getCounter() {
        return counter;
    }

    {
        System.out.println("Initializer Dog");
        counter++;
    }


}
