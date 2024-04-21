package argus.metricsproducer.service;

public interface KafkaService {
    void send(String message);
}
