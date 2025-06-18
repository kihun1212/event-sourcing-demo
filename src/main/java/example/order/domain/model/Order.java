package example.order.domain.model;

import org.springframework.data.domain.AbstractAggregateRoot;

public class Order extends AbstractAggregateRoot<Order> implements OrderIdentity {

    @Override
    public String getOrderId() {
        return "";
    }
}
