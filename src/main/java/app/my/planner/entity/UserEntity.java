package app.my.planner.entity;

import app.my.planner.entity.utility.BaseEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "user")
@Getter
@Setter
@NoArgsConstructor
public class UserEntity extends BaseEntity {

    @Column(name = "name", nullable = false, length = 100, unique = true)
    private String name;

    @Column(name = "nick_name", length = 50, unique = true)
    private String nickName;

    @OneToMany(mappedBy = "user", fetch =  FetchType.LAZY, cascade = CascadeType.ALL)
    private List<WalletTypeEntity> walletTypeList;
}