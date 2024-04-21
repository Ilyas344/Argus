package argus.metricsconsumer.repository;

import argus.metricsconsumer.model.SystemHealth;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SystemHealthRepository extends JpaRepository<SystemHealth, Long> {
}