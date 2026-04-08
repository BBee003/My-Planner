package app.my.planner.repository;

import app.my.planner.entity.DebtEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DebtEntityRepository extends JpaRepository<DebtEntity, Long> {
}