package ia.ednova.backend.assignement2.config;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;


@Configuration
public class MongoClientConfig extends AbstractMongoClientConfiguration {
    @Bean
    public MongoClient mongoClient() {
        return MongoClients.create("mongodb://root:root@localhost:27017/assignement2-db?authSource=admin");
    }

    @Override
    protected String getDatabaseName() {
        return "assignement-2-db";
    }
}
