package example.order.domain.command;

import example.core.CommandHandler;
import example.core.CommandResult;
import example.core.EmptyCommandResult;
import example.order.port.OrderRepositoryPort;
import org.jetbrains.annotations.NotNull;

public class CancelOrderCommandHandler implements CommandHandler<CancelOrderCommand, CommandResult> {

    private final OrderRepositoryPort orderRepositoryPort;

    public CancelOrderCommandHandler(
            OrderRepositoryPort orderRepositoryPort) {

        this.orderRepositoryPort = orderRepositoryPort;
    }

    public @NotNull CommandResult handle(@NotNull CancelOrderCommand command) {
        var orderId = command.orderId();
        return new EmptyCommandResult();
    }
}
