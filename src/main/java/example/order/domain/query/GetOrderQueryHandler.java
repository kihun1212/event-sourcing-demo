package example.order.domain.query;

import example.order.domain.model.Order;
import example.order.port.OrderRepositoryPort;

public class GetOrderQueryHandler {

    private final OrderRepositoryPort orderRepositoryPort;

    public GetOrderQueryHandler(
            OrderRepositoryPort orderRepositoryPort) {

        this.orderRepositoryPort = orderRepositoryPort;
    }

    public Order handle(GetOrderQuery query) {
        var orderId = query.orderId();
        return orderRepositoryPort.findById(orderId);
    }
}
