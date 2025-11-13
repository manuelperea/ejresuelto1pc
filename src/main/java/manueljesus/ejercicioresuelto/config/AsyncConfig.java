package manueljesus.ejercicioresuelto.config;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

@Configuration
@EnableAsync
public class AsyncConfig {

    @Bean(name = "taskExecutor")
    public Executor taskExecutor() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(2);    // Mínimo 2 hilos trabajando
        executor.setMaxPoolSize(4);     // Máximo 4 hilos si hay mucha carga
        executor.setQueueCapacity(100);
        executor.setThreadNamePrefix("Stark-SensorThread-");
        executor.initialize();
        return executor;
    }
}
