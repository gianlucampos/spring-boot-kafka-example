package com.github.gianlucampos.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class KafkaConsumer {

    @KafkaListener(topics = "meu-topico", groupId = "test-group")
    public void listen(String message) {
        log.info("Mensagem enviada: {}", message);
    }
}
