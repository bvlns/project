package cloud.jobassist;

import org.socialsignin.spring.data.dynamodb.repository.config.EnableDynamoDBRepositories;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;

@Configuration
@EnableDynamoDBRepositories(basePackages = "cloud.jobassist.repositories")
public class DynamoDBConfig {
	AmazonDynamoDB client = AmazonDynamoDBClientBuilder.standard().build();
	@Bean
    public AmazonDynamoDB amazonDynamoDB() {
		return client;
	}
	
}
