package argus.metricsconsumer.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "t_system_health")
public class SystemHealth {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String status;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "diskSpace.status", column = @Column(name = "components_disk_space_status")),
            @AttributeOverride(name = "diskSpace.details", column = @Column(name = "components_disk_space_details_id"))
    })
    private Components components;

}
