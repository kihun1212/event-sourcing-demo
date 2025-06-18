package example.order.domain.command;

import example.core.CommandHandler;
import example.core.CommandResult;
import example.core.EmptyCommandResult;
import example.order.port.OrderRepositoryPort;
import org.jetbrains.annotations.NotNull;

public class CreateOrderCommandHandler implements CommandHandler<CreateOrderCommand, CommandResult> {

    private final OrderRepositoryPort orderRepositoryPort;

    public CreateOrderCommandHandler(
            OrderRepositoryPort orderRepositoryPort) {

        this.orderRepositoryPort = orderRepositoryPort;
    }

    public @NotNull CommandResult handle(@NotNull CreateOrderCommand command) {
        String orderId = command.orderId();
        String userId = command.userId();

        return new EmptyCommandResult();
    }
}
