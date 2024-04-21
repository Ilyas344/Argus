package argus.metricsproducer.service.impl;


import argus.metricsproducer.service.KafkaService;
import argus.metricsproducer.service.ProducerService;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ProducerServiceImpl implements ProducerService {

    private final RestTemplate restTemplate;
    private final KafkaService kafkaService;

    public ProducerServiceImpl(RestTemplateBuilder restTemplateBuilder, KafkaService kafkaService) {
        this.restTemplate = restTemplateBuilder.build();
        this.kafkaService = kafkaService;
    }

    public String getMetrics() {
        String endpointUrl = "http://localhost:8080/actuator/health/custom";
        ResponseEntity<String> responseEntity = restTemplate.getForEntity(endpointUrl, String.class);
        kafkaService.send(responseEntity.getBody());
        return responseEntity.getBody();

    }

}
