package example.order.port;

import example.core.CommandResult;
import example.order.domain.command.CreateOrderCommand;

public interface CreateOrderCommandPort {

    CommandResult createOrder(CreateOrderCommand command);
}
