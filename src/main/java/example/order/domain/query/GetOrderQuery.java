package example.order.domain.query;

import org.jetbrains.annotations.NotNull;

public record GetOrderQuery(
        @NotNull String orderId
) {
}
