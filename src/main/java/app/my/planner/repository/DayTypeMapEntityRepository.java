package app.my.planner.repository;

import app.my.planner.entity.DayTypeMapEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DayTypeMapEntityRepository extends JpaRepository<DayTypeMapEntity, Long> {
}