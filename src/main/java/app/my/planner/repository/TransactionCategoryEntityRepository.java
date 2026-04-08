package app.my.planner.repository;

import app.my.planner.entity.TransactionCategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionCategoryEntityRepository extends JpaRepository<TransactionCategoryEntity, Long> {
}