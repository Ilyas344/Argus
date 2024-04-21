package argus.metricsproducer.api;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/api/metrics")
public interface ProducerApi {
    @Operation(summary = "Создать задачу (Create task)",
            description = "Создает новую задачу на основе данных, переданных в теле запроса (Creates a new task based on the data provided in the request body).")
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "201",
                    description = "Успешное выполнение",
                    content = @Content(
                            mediaType = MediaType.APPLICATION_JSON_VALUE,
                            schema = @Schema(implementation = String.class))
            )
    })

    @PostMapping
    ResponseEntity<String> sendMetrics();
}
