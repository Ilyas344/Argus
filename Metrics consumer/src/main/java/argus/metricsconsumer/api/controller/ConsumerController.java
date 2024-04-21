package argus.metricsconsumer.api.controller;

import argus.metricsconsumer.api.ConsumerApi;
import argus.metricsconsumer.model.SystemHealth;
import argus.metricsconsumer.service.impl.SystemHealthServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ConsumerController implements ConsumerApi {
    private final SystemHealthServiceImpl healthServiceService;


    @Override
    public ResponseEntity<List<SystemHealth>> getAllMetrics() {
        return ResponseEntity.ok(healthServiceService.getAllMetric());
    }

    @Override
    public ResponseEntity<SystemHealth> getMetricById(Long id) {
        return ResponseEntity.ok(healthServiceService.getMetric(id));
    }
}
