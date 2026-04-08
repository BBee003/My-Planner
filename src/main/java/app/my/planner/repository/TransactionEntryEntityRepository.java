package app.my.planner.repository;

import app.my.planner.entity.TransactionEntryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionEntryEntityRepository extends JpaRepository<TransactionEntryEntity, Long> {
}