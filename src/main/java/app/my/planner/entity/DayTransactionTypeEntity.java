package app.my.planner.entity;

import app.my.planner.entity.utility.UserAwareEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "day_transaction_type")
@Getter
@Setter
@NoArgsConstructor
public class DayTransactionTypeEntity extends UserAwareEntity {

    @Column(name = "name", nullable = false, length = 100, unique = true)
    private String name;

    @Column(name = "amount", nullable = false)
    private BigDecimal amount;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH})
    @JoinColumn(name = "transaction_type_id", nullable = false)
    private TransactionTypeEntity transactionType;

    @OneToMany(mappedBy = "dayTransactionType", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<DayTypeDetailEntity> dayTypeDetailList;

    @OneToMany(mappedBy = "dayTransactionType", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<TransactionEntity> transactionList;
}