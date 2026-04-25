package br.com.fiap.Checkpoint1.repository;

import br.com.fiap.Checkpoint1.model.OrderModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<OrderModel, Long> {
}
