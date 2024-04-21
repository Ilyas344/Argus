package argus.metricsproducer.service.impl;


import argus.metricsproducer.service.KafkaService;
import argus.metricsproducer.service.ProducerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
public class ProducerServiceImpl implements ProducerService {

    private final RestTemplate restTemplate;
    private final KafkaService kafkaService;


    public String getMetrics() {
        String endpointUrl = "http://localhost:8080/actuator/health/custom";
        ResponseEntity<String> responseEntity = restTemplate.getForEntity(endpointUrl, String.class);
        kafkaService.send(responseEntity.getBody());
        return responseEntity.getBody();

    }

}
