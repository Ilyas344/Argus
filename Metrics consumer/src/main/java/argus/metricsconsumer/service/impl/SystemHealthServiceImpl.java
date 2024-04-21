package argus.metricsconsumer.service.impl;

import argus.metricsconsumer.exception.NotFoundException;
import argus.metricsconsumer.exception.ParserException;
import argus.metricsconsumer.model.SystemHealth;
import argus.metricsconsumer.repository.SystemHealthRepository;
import argus.metricsconsumer.service.SystemHealthService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class SystemHealthServiceImpl implements SystemHealthService {
    private static final ObjectMapper objectMapper = new ObjectMapper();
    private final SystemHealthRepository systemHealthRepository;

    public void saveMetric(String jsonString) {
        try {
            var systemHealth = objectMapper.readValue(jsonString, SystemHealth.class);
            systemHealthRepository.save(systemHealth);

        } catch (JsonProcessingException e) {
            log.error("Error parsing JSON string: {}", jsonString);
            throw new ParserException(e.getMessage());
        }
    }

    public SystemHealth getMetric(Long id) {
        return systemHealthRepository
                .findById(id).
                orElseThrow(() -> new NotFoundException("SystemHealth not found with id: " + id));
    }

    public List<SystemHealth> getAllMetric() {
        return systemHealthRepository.findAll();
    }


}
