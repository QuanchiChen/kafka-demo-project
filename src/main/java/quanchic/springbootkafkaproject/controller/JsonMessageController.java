package quanchic.springbootkafkaproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import quanchic.springbootkafkaproject.kafka.JsonKafkaProducer;
import quanchic.springbootkafkaproject.model.User;

@RestController
@RequestMapping("/api/v1/kafka")
public class JsonMessageController {
    private final JsonKafkaProducer jsonKafkaProducer;

    @Autowired
    public JsonMessageController(JsonKafkaProducer jsonKafkaProducer) {
        this.jsonKafkaProducer = jsonKafkaProducer;
    }

    @PostMapping("/publish")
    public ResponseEntity<String> publish(@RequestBody User user) {
        jsonKafkaProducer.produce(user);
        return ResponseEntity.ok("JSON message sent to the topic");
    }
}
