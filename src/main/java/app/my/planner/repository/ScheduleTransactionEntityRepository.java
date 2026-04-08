package app.my.planner.repository;

import app.my.planner.entity.ScheduleTransactionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScheduleTransactionEntityRepository extends JpaRepository<ScheduleTransactionEntity, Long> {
}