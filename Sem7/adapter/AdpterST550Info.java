package Sem7.adapter;

public class AdpterST550Info implements MeteoSensorBase {

    private SensorTemperature sensorTemperature;

    public AdpterST550Info(SensorTemperature sensorTemperature) {
        this.sensorTemperature = sensorTemperature;
    }

    @Override
    public int detId() {
        return sensorTemperature.identifier();
    }

    @Override
    public double getTemp() {
        return sensorTemperature.temperature();
    }

}
