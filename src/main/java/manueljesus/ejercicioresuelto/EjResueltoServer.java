package manueljesus.ejercicioresuelto;

import manueljesus.ejercicioresuelto.sensors.SensorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class EjResueltoServer implements CommandLineRunner {
    @Autowired
    private SensorService sensorService;

    public static void main( String[] args ) {

//        new SpringApplicationBuilder(EjResueltoServer.class)
//
//                .web(WebApplicationType.NONE)
//
//                .run(args);
        SpringApplication.run(EjResueltoServer.class, args);

    }

    @Override
    public void run(String... args) throws Exception {

        sensorService.procesarSensores();
        System.out.println("App terminada");

    }

}
