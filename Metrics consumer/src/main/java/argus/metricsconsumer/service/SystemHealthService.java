package argus.metricsconsumer.service;

import argus.metricsconsumer.model.SystemHealth;

import java.util.List;

public interface SystemHealthService {
    void saveMetric(String jsonString);

    SystemHealth getMetric(Long id);

    List<SystemHealth> getAllMetric();
}
