package app.my.planner.entity;

import app.my.planner.entity.utility.UserAwareEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "wallet_type")
@Getter
@Setter
@NoArgsConstructor
public class WalletTypeEntity extends UserAwareEntity {

    @Column(name = "name", nullable = false, length = 100, unique = true)
    private String name;

    @OneToMany(mappedBy = "walletType", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<WalletEntity> walletList;
}