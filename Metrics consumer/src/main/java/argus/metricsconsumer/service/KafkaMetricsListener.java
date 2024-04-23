package argus.metricsconsumer.service;

public interface KafkaMetricsListener {
    /**
     * Listens for messages on the "metrics-topic" Kafka topic and processes the received metric data.
     *
     * @param metric The received metric data as a String.
     */
    void listen(String metric);

    /**
     * Listens for messages on the "topic.DLT" Kafka topic and logs the received message.
     *
     * @param in The received message payload as a byte array.
     */
    void dltListen(byte[] in);
}
