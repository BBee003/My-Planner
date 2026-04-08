package app.my.planner.entity;

import app.my.planner.entity.utility.BaseEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "day_type_map_detail")
public class DayTypeMapDetailEntity extends BaseEntity {

    @Column(name = "is_done", nullable = false)
    private boolean isDone;

    @ManyToOne(fetch =  FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH})
    @JoinColumn(name = "day_type_map_id", nullable = false)
    private DayTypeMapEntity dayTypeMap;

    @ManyToOne(fetch =  FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH})
    @JoinColumn(name = "day_transaction_type_id", nullable = false)
    private DayTransactionTypeEntity dayTransactionType;
}
