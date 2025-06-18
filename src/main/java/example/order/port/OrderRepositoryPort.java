package example.order.port;

import example.order.domain.model.Order;

public interface OrderRepositoryPort {

    void create(Order order);

    void cancel(String orderId);

    Order findById(String orderId);
}
