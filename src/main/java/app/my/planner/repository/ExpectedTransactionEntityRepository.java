package app.my.planner.repository;

import app.my.planner.entity.ExpectedTransactionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpectedTransactionEntityRepository extends JpaRepository<ExpectedTransactionEntity, Long> {
}