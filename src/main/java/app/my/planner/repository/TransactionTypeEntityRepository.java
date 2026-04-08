package app.my.planner.repository;

import app.my.planner.entity.TransactionTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionTypeEntityRepository extends JpaRepository<TransactionTypeEntity, Long> {
}