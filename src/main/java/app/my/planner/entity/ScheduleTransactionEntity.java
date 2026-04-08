package app.my.planner.entity;

import app.my.planner.entity.utility.UserAwareEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "schedule_transaction")
@Getter
@Setter
@NoArgsConstructor
public class ScheduleTransactionEntity extends UserAwareEntity {

    @Column(name = "name", nullable = false, length = 100, unique = true)
    private String name;

    @Column(name = "amount", nullable = false)
    private BigDecimal amount;

    @Column(name = "day_of_month")
    private int dayOfMonth;

    @Column(name = "is_active", nullable = false)
    private boolean isActive;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH})
    @JoinColumn(name = "type_id")
    private TransactionTypeEntity transactionType;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH})
    @JoinColumn(name = "debt_id")
    private DebtEntity debt;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH})
    @JoinColumn(name = "saving_goal_id")
    private SavingGoalEntity savingGoal;

    @OneToMany(mappedBy = "scheduleTransaction", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<TransactionEntity> transactionList;
}
