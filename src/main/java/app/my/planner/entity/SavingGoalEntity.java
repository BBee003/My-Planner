package app.my.planner.entity;

import app.my.planner.entity.utility.UserAwareEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "saving_goal")
public class SavingGoalEntity extends UserAwareEntity {

    @Column(name = "name", nullable = false, length = 100, unique = true)
    private String name;

    @Column(name = "total_amount", nullable = false)
    private BigDecimal totalAmount;

    @Column(name = "from_at", nullable = false)
    private Instant fromAt;

    @Column(name = "to_at", nullable = false)
    private Instant toAt;

    @Column(name = "description", length = 500)
    private String description;

    @Column(name = "percentage", nullable = false)
    private double percentage;

    @OneToMany(mappedBy = "savingGoal", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<ScheduleTransactionEntity> scheduleTransactionList;

    @OneToMany(mappedBy = "savingGoal", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<TransactionEntity> transactionList;
}
