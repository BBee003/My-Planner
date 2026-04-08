package app.my.planner.repository;

import app.my.planner.entity.AssetEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AssetEntityRepository extends JpaRepository<AssetEntity, Long> {
}