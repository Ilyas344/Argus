package argus.metricsconsumer.model;

import jakarta.persistence.Embeddable;
import lombok.*;


@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class Details {
    private Long total;
    private Long free;
    private Long threshold;
    private String path;
    private Boolean exists;
}
