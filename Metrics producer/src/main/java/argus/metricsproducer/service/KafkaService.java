package argus.metricsproducer.service;

public interface KafkaService {
    /**
     * Send metric
     *
     * @param message Json metric
     */
    void send(String message);
}
