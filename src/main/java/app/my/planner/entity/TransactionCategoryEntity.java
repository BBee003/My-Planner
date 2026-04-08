package app.my.planner.entity;

import app.my.planner.entity.utility.UserAwareEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "transaction_category")
@Getter
@Setter
@NoArgsConstructor
public class TransactionCategoryEntity extends UserAwareEntity {

    @Column(name = "name", nullable = false, length = 100, unique = true)
    private String name;

    @Column(name = "code", nullable = false, length = 50, unique = true)
    private String code;

    @Column(name = "description")
    private String description;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH})
    @JoinColumn(name = "entry_id")
    private TransactionEntryEntity transactionEntry;

    @OneToMany(mappedBy = "transactionCategory", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<TransactionTypeEntity> transactionTypeList;
}