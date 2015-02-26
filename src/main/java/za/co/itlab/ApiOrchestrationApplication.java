package za.co.itlab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@ComponentScan
@ImportResource("classpath:application-context.xml")
@EnableAutoConfiguration
public class ApiOrchestrationApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiOrchestrationApplication.class, args);
    }
}
