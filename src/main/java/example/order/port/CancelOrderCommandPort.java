package example.order.port;

import example.core.CommandResult;
import example.order.domain.command.CancelOrderCommand;

public interface CancelOrderCommandPort {

    CommandResult cancelOrder(CancelOrderCommand command);
}
