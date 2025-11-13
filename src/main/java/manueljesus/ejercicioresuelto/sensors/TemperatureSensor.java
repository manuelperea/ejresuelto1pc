package manueljesus.ejercicioresuelto.sensors;

import org.springframework.stereotype.Component;

@Component
public class TemperatureSensor implements Sensor {
    @Override
    public String getDeteccion() {
        System.out.println("Detectando temperatura...");
        return "Temperatura elevada detectada";
    }
}
