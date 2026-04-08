package app.my.planner.entity;

import app.my.planner.entity.utility.BaseEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;

@Entity
@Table(name = "asset_history")
@Getter
@Setter
@NoArgsConstructor
public class AssetHistoryEntity extends BaseEntity {

    @Column(name = "is_using", nullable = false)
    private boolean isUsing;

    @Column(name = "buy_at", nullable = false)
    private Instant buyAt;

    @Column(name = "start_at", nullable = false)
    private Instant startAt;

    @Column(name = "end_at", nullable = false)
    private Instant endAt;

    @Column(name = "duration", nullable = false)
    private int duration;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH})
    @JoinColumn(name = "asset_id", nullable = false)
    private AssetEntity asset;
}