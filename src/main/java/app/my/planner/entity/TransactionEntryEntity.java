package app.my.planner.entity;

import app.my.planner.entity.utility.BaseEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "transaction_entry")
@Getter
@Setter
@NoArgsConstructor
public class TransactionEntryEntity extends BaseEntity {

    @Column(name = "name", nullable = false, length = 100, unique = true)
    private String name;

    @Column(name = "sign_value", nullable = false)
    private int signValue;

    @OneToMany(mappedBy = "transactionEntry", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<TransactionCategoryEntity> transactionCategoryList;
}
