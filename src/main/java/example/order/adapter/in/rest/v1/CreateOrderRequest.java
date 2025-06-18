package example.order.adapter.in.rest.v1;

import org.jetbrains.annotations.NotNull;

public record CreateOrderRequest(
        @NotNull String userId) {

}
