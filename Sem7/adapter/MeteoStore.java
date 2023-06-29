package Sem7.adapter;

public class MeteoStore {

    boolean save(MeteoSensor meteoSensor) {
        System.out.printf("Сохрание данных по метеодатчику...\nId = [%d];\nТемпература: %f;\nВлажность: %f;\nДавление: %f"
                , meteoSensor.detId(), meteoSensor.getTemp(), meteoSensor.getHumidity(), meteoSensor.getPressure());
        return true;
    }

    boolean save(MeteoSensorBase meteoSensor) {
        System.out.printf("Сохрание данных по метеодатчику...\nId = [%d];\nТемпература: %f"
                , meteoSensor.detId(), meteoSensor.getTemp());
        return true;
    }


}
