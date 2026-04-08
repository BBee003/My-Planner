package app.my.planner.repository;

import app.my.planner.entity.WalletTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WalletTypeEntityRepository extends JpaRepository<WalletTypeEntity, Long> {
}