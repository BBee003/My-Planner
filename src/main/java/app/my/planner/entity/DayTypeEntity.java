package app.my.planner.entity;

import app.my.planner.entity.utility.UserAwareEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "day_type")
public class DayTypeEntity extends UserAwareEntity {

    @Column(name = "name", nullable = false, length = 100, unique = true)
    private String name;

    @OneToMany(mappedBy = "dayType", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<DayTypeDetailEntity> dayTypeDetailList;
}