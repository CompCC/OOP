package Sem7.adapter;

public class MS200 implements MeteoSensor{

    private int id;

    public MS200(int id) {
        this.id = id;
    }

    @Override
    public int detId() {
        return id;
    }

    @Override
    public double getTemp() {
        return 30;
    }

    @Override
    public double getHumidity() {
        return 67;
    }

    @Override
    public double getPressure() {
        return 725;
    }
}
