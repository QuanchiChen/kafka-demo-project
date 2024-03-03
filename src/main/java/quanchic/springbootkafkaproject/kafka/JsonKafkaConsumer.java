package quanchic.springbootkafkaproject.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import quanchic.springbootkafkaproject.model.User;

@Service
public class JsonKafkaConsumer {
    private final Logger logger = LoggerFactory.getLogger(JsonKafkaConsumer.class);

    @KafkaListener(topics = "myJsonTopic", groupId = "myConsumerGroup")
    public void consume(User user) {
        logger.info("JSON Message Received: " + user);
    }
}
