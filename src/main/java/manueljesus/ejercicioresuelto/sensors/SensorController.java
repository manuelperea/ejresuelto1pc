package manueljesus.ejercicioresuelto.sensors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class SensorController {
    @Autowired
    @Resource(name = "accessSensor")
    private Sensor sensor;

    public void activaSensor() {
        System.out.println("Activando Sensor... " + sensor.getDeteccion());
    }
}
