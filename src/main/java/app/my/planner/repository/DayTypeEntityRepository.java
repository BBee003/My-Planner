package app.my.planner.repository;

import app.my.planner.entity.DayTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DayTypeEntityRepository extends JpaRepository<DayTypeEntity, Long> {
}