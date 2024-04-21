package argus.metricsconsumer.model;

import jakarta.persistence.Embedded;
import lombok.*;


@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor

public class Components {
    @Embedded
    private DiskSpace diskSpace;
    @Embedded
    private Ping ping;
}
