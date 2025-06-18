package example.order.domain.command;

import example.core.Command;
import org.jetbrains.annotations.NotNull;

public record CreateOrderCommand(
        @NotNull String orderId,
        @NotNull String userId) implements Command {
}
