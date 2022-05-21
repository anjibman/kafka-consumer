package com.asgm.kafkaconsumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafKaConsumerService {
    private final Logger logger =
            LoggerFactory.getLogger(KafKaConsumerService.class);

    @KafkaListener(topics = "${kafka.topic_name}", groupId = "${kafka.group_id}")
    public void consume(String message)
    {
        logger.info(String.format("Message received -> %s", message));
    }
}
