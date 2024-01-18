package meteo.sensors;

import java.time.*;

import meteo.interfaces.iSensorTemperature;

// Дополнительный датчик, который надо включить в систему
public class ST500Info {
    public iSensorTemperature getData() {
        return new iSensorTemperature() {
            public int identifier() {
                return 100;
            }

            public double temperature() {
                return 22.0;
            }

            public int year() {
                return LocalDateTime.now().getYear();
            }

            public int day() {
                return LocalDateTime.now().getDayOfYear();
            }

            public int second() {
                LocalDateTime now = LocalDateTime.now();
                return now.getHour() * 3600 + now.getMinute() * 60 + now.getSecond();
            }
        };
    }
}