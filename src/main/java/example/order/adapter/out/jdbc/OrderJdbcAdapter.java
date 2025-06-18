package example.order.adapter.out.jdbc;

import example.order.domain.model.Order;
import example.order.port.OrderRepositoryPort;

public class OrderJdbcAdapter implements OrderRepositoryPort {

    private final OrderJdbcRepository orderJdbcRepository;

    public OrderJdbcAdapter(OrderJdbcRepository orderJdbcRepository) {
        this.orderJdbcRepository = orderJdbcRepository;
    }

    @Override
    public void create(Order order) {
        orderJdbcRepository.save(order);
    }

    @Override
    public void cancel(String orderId) {

    }

    @Override
    public Order findById(String orderId) {
        return null;
    }
}
