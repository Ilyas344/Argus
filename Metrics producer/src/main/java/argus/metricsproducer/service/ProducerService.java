package argus.metricsproducer.service;


public interface ProducerService {
    /**
     * get metric from <a href="http://localhost:8080/actuator/health/custom">...</a>
     * @return Json metric
     */
    String getMetrics();
}
