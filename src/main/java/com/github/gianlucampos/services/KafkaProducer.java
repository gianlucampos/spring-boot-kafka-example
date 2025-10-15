package com.github.gianlucampos.services;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Slf4j
@AllArgsConstructor
@Service
public class KafkaProducer {

    private final KafkaTemplate<String, String> kafkaTemplate;
    private static final String TOPIC = "meu-topico";

    public void sendMessage(String message) {
        kafkaTemplate.send(TOPIC, message);
        log.info("Mensagem enviada: {}", message);

    }

}
