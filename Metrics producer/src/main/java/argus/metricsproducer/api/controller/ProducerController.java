package argus.metricsproducer.api.controller;


import argus.metricsproducer.api.ProducerApi;
import argus.metricsproducer.service.ProducerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor
@Slf4j
public class ProducerController implements ProducerApi {


    private final ProducerService producerService;

    @Override
    public ResponseEntity<String> sendMetrics() {
        log.info("Sending metric;");
        var metric = producerService.getMetrics();
        return ResponseEntity.ok(metric);
    }

}
