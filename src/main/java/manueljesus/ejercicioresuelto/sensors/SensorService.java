package manueljesus.ejercicioresuelto.sensors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class SensorService {

    // Inyectamos todos los sensores
    @Autowired
    private MotionSensor motionSensor;

    @Autowired
    private TemperatureSensor temperatureSensor;

    @Autowired
    private AccessSensor accessSensor;

    // Metodo para simular la ejecucion concurrente
    @Async("taskExecutor")  // Al poner @Async Spring ejecutará esto en un hilo separado del pool
    public void procesarSensores() {
        System.out.println("Iniciando escaneo de seguridad...");

        processMotion();
        processTemperature();
        processAccess();

    }

    // Métodos auxiliares
    private void processMotion() {
        System.out.println("Hilo actual: " + Thread.currentThread().getName() + " - " + motionSensor.getDeteccion());
    }

    private void processTemperature() {
        System.out.println("Hilo actual: " + Thread.currentThread().getName() + " - " + temperatureSensor.getDeteccion());
    }

    private void processAccess() {
        System.out.println("Hilo actual: " + Thread.currentThread().getName() + " - " + accessSensor.getDeteccion());
    }
}
