package app.my.planner.entity;

import app.my.planner.entity.utility.BaseEntity;
import jakarta.persistence.*;

@Entity
@Table(name = "day_type_detail")
public class DayTypeDetailEntity extends BaseEntity {

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH})
    @JoinColumn(name = "day_type_id", nullable = false)
    private DayTypeEntity dayType;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH})
    @JoinColumn(name = "day_transaction_type_id", nullable = false)
    private DayTransactionTypeEntity dayTransactionType;
}
