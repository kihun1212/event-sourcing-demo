package example.order.adapter.out.jdbc;

import example.order.domain.model.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderJdbcRepository extends CrudRepository<Order, String> {
}
