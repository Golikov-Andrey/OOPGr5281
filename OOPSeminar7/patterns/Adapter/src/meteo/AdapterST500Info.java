package meteo;

import java.time.LocalDateTime;

import meteo.interfaces.iMeteoSensor;
import meteo.interfaces.iSensorTemperature;

public class AdapterST500Info implements iMeteoSensor {

    private iSensorTemperature adaptee;
    public AdapterST500Info(iSensorTemperature adaptee){
        this.adaptee = adaptee;
    }

    @Override
    public int getId() {
         return adaptee.identifier();
    }
    @Override
    public Float getTemperature() {
        return (float)adaptee.temperature();
    }
    @Override
    public Float getHumidity() {
        return null;
    }
    @Override
    public Float getPressure() {
        return null;
    }
    @Override
    public LocalDateTime getDateTime() {
        LocalDateTime dateTime = LocalDateTime.of(adaptee.year(), 1, 1, 0, 0);
        dateTime = dateTime.plusDays(adaptee.day()-1);
        dateTime = dateTime.plusSeconds(adaptee.second());
        return dateTime;
    }
}
