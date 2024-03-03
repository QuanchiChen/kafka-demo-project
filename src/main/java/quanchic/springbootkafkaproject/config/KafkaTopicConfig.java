package quanchic.springbootkafkaproject.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {
    @Bean
    public NewTopic MyTopic() {
        return TopicBuilder.name("myTopic").build();
    }

    @Bean
    public NewTopic MyJsonTopic() {
        return TopicBuilder.name("myJsonTopic").build();
    }
}
