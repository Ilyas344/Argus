package argus.metricsconsumer.api;

import argus.metricsconsumer.model.SystemHealth;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/api/metrics")
public interface ConsumerApi {

    @Operation(summary = "Получить список всех метрик")
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "Список метрик получен",
                    content = @Content(
                            mediaType = "application/json",
                            schema = @Schema(implementation = SystemHealth.class)
                    )
            )
    })
    @GetMapping
    ResponseEntity<List<SystemHealth>> getAllMetrics();

    @Operation(summary = "Получить метрику по id",
            description = "Получить конкретную метрику по её id")
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "Метрика получена",
                    content = @Content(
                            mediaType = "application/json",
                            schema = @Schema(implementation = SystemHealth.class)
                    )
            )

    })
    @GetMapping("/{id}")
    ResponseEntity<SystemHealth> getMetricById(@PathVariable Long id);
}
