package app.my.planner.repository;

import app.my.planner.entity.DayTransactionTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DayTransactionTypeEntityRepository extends JpaRepository<DayTransactionTypeEntity, Long> {
}