package app.my.planner.repository;

import app.my.planner.entity.SavingGoalEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SavingGoalEntityRepository extends JpaRepository<SavingGoalEntity, Long> {
}