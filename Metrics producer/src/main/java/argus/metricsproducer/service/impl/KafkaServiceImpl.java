package argus.metricsproducer.service.impl;

import argus.metricsproducer.service.KafkaService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Slf4j
@RequiredArgsConstructor
@Transactional
public class KafkaServiceImpl implements KafkaService {

    private final KafkaTemplate<Object, Object> template;

    @Override
    public void send(String message) {
        log.info("Sending message: {}", message);
        template.send("metrics-topic", message);
        log.info("Metric sent");
    }

}
