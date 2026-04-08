package app.my.planner.entity;

import app.my.planner.entity.utility.UserAwareEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "asset")
@Getter
@Setter
@NoArgsConstructor
public class AssetEntity extends UserAwareEntity {

    @Column(name = "name", nullable = false, length = 100, unique = true)
    private String name;

    @Column(name = "total_amount", nullable = false)
    private BigDecimal totalAmount;

    @Column(name = "in_stock", nullable = false)
    private int inStock;

    @OneToMany(mappedBy = "asset", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<AssetHistoryEntity> assetHistoryList;

    @OneToMany(mappedBy = "asset", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<TransactionEntity> transactionList;
}