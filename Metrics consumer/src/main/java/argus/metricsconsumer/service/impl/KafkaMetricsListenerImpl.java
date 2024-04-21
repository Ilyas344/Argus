package argus.metricsconsumer.service.impl;

import argus.metricsconsumer.service.KafkaMetricsListener;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

@Service
@Slf4j
@RequiredArgsConstructor
public class KafkaMetricsListenerImpl implements KafkaMetricsListener {
    private final SystemHealthServiceImpl service;

    @Override
    @KafkaListener(id = "MetricGroup", topics = "metrics-topic")
    public void listen(String metric) {
        Assert.notNull(metric, "Metric must not be null");
        log.info("Received: {}", metric);
        service.saveMetric(metric);
        log.info("Saved: {}", metric);

    }

    @Override
    @KafkaListener(id = "dltGroup", topics = "topic.DLT")
    public void dltListen(byte[] in) {
        log.info("Received from dlt: {}", new String(in));
    }

}
