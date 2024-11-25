package ia.ednova.backend.assignement2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;

@SpringBootApplication(exclude = {MongoAutoConfiguration.class})
public class Assignement2Application {

    public static void main(String[] args) {
        SpringApplication.run(Assignement2Application.class, args);
    }

}
