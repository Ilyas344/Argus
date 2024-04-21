package argus.metricsconsumer.repository;

import argus.metricsconsumer.model.SystemHealth;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SystemHealthRepository extends JpaRepository<SystemHealth, Long> {
}