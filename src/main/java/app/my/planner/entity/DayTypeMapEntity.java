package app.my.planner.entity;

import app.my.planner.entity.utility.UserAwareEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;

@Entity
@Table(name = "day_type_map")
@Getter
@Setter
@NoArgsConstructor
public class DayTypeMapEntity extends UserAwareEntity {

    @Column(name = "date", nullable = false)
    private Instant date;

    @Column(name = "percentage", nullable = false)
    private double percentage;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH})
    @JoinColumn(name = "day_type_id", nullable = false)
    private DayTypeEntity dayType;
}