package app.my.planner.repository;

import app.my.planner.entity.CurrencyTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrencyTypeEntityRepository extends JpaRepository<CurrencyTypeEntity, Long> {
}