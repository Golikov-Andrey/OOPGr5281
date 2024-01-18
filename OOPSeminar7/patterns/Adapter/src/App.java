import meteo.AdapterST500Info;
import meteo.MeteoStore;
import meteo.interfaces.iMeteoSensor;
import meteo.sensors.MS200;
import meteo.sensors.ST500Info;

public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");

        MeteoStore meteoDB = new MeteoStore();
        iMeteoSensor oldSensor = new MS200(1);
        AdapterST500Info adap = new AdapterST500Info(new ST500Info().getData());

        meteoDB.save(oldSensor);

        meteoDB.save(adap);
    }
}
