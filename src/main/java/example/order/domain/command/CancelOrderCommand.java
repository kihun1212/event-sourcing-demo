package example.order.domain.command;

import example.core.Command;
import org.jetbrains.annotations.NotNull;

public record CancelOrderCommand(
        @NotNull String orderId) implements Command {
}
