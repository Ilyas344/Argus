package argus.metricsconsumer.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import lombok.*;

@Embeddable

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class DiskSpace {

    @Column(name = "disk_space_status")
    private String status;

    @JoinColumn(name = "disk_space_details_id")
    private Details details;
}
