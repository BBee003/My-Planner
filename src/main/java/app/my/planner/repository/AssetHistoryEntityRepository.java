package app.my.planner.repository;

import app.my.planner.entity.AssetHistoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AssetHistoryEntityRepository extends JpaRepository<AssetHistoryEntity, Long> {
}