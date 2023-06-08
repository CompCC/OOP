package Sem2.Sample2;

public class Track extends Obstracte{
private final int lenght;

    public Track(int lenght) {
        this.lenght = lenght;
    }

    @Override
    public int getLength() {
        return lenght;
    }

    @Override
    public int getHeight() {
        return 0;
    }
}
