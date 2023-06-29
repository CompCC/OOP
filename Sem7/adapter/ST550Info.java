package Sem7.adapter;

public class ST550Info implements SensorTemperature {
    private int id;

    public ST550Info(int id) {
        this.id = id;
    }

    @Override
    public int identifier() {
        return id;
    }

    @Override
    public double temperature() {
        return -15;
    }
}
