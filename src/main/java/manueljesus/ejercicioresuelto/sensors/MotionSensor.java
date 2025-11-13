package manueljesus.ejercicioresuelto.sensors;


import org.springframework.stereotype.Component;

@Component
public class MotionSensor implements Sensor {

    @Override
    public String getDeteccion() {
        System.out.println("Detectando movimiento...");
        return "Movimiento detectado.";
    }
}
