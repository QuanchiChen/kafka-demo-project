package quanchic.springbootkafkaproject.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {
    private final Logger logger = LoggerFactory.getLogger(KafkaConsumer.class);

    @KafkaListener(topics = "myTopic", groupId = "myConsumerGroup")
    public void consume(String message) {
        logger.info("Message Received: " + message);
    }
}
