package manueljesus.ejercicioresuelto;

import manueljesus.ejercicioresuelto.sensors.SensorController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class EjResueltoServer implements CommandLineRunner {
    @Autowired
    private SensorController sensorController;

    public static void main( String[] args ) {

        new SpringApplicationBuilder(EjResueltoServer.class)

                .web(WebApplicationType.NONE)

                .run(args);

    }

    @Override
    public void run(String... args) throws Exception {

        sensorController.activaSensor();
        System.out.println("App terminada");

    }

}
