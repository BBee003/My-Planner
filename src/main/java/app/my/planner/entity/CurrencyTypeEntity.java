package app.my.planner.entity;

import app.my.planner.entity.utility.BaseEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "currency_type")
@Getter
@Setter
@NoArgsConstructor
public class CurrencyTypeEntity extends BaseEntity {

    @Column(name = "code", nullable = false, length = 50, unique = true)
    private String code;

    @Column(name = "name", nullable = false, length = 100, unique = true)
    private String name;

    @OneToMany(mappedBy = "currencyType", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<WalletEntity> walletList;
}