package manueljesus.ejercicioresuelto.sensors;

import org.springframework.stereotype.Component;

@Component
public class AccessSensor implements Sensor {

    @Override
    public String getDeteccion() {
        System.out.println("Detectando acceso...");
        return "Acceso no autorizado detectado";
    }
}