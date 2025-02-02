package ai.ednova.ticket.booking.service.ticketbookingservice.configurations;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDatabaseFactory;
import org.springframework.data.mongodb.MongoTransactionManager;
import org.springframework.data.mongodb.config.EnableMongoAuditing;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.mapping.MongoMappingContext;

@Configuration
@EnableMongoAuditing
public class MongoConfiguration {

    @Bean
    public MongoMappingContext mongoMappingContext() {
        return new MongoMappingContext();
    }

    @Bean
    public MongoTransactionManager mongoTransactionManager(MongoDatabaseFactory databaseFactory) {
        return new MongoTransactionManager(databaseFactory);
    }

    @Bean
    public MongoTemplate mongoTemplate(MongoDatabaseFactory databaseFactory) {
        return new MongoTemplate(databaseFactory);
    }
}
