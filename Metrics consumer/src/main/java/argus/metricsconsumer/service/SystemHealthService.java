package argus.metricsconsumer.service;

import argus.metricsconsumer.model.SystemHealth;

import java.util.List;

public interface SystemHealthService {
    /**
     * Save metric in DB
     *
     * @param jsonString string metric
     */
    void saveMetric(String jsonString);

    /**
     * Get metric by id
     *
     * @param id metric ID
     * @return metric
     */

    SystemHealth getMetric(Long id);

    /**
     * Get all metrics
     *
     * @return list of metrics
     */

    List<SystemHealth> getAllMetric();
}
