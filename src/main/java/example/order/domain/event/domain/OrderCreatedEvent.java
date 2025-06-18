package example.order.domain.event.domain;

import example.core.DomainEvent;
import example.core.DomainEventFields;
import org.jetbrains.annotations.NotNull;
import java.util.Map;

public record OrderCreatedEvent(
        @NotNull DomainEventFields fields,
        @NotNull String orderId,
        @NotNull String userId
) implements DomainEvent {

    @Override
    public @NotNull String getId() {
        return fields.getId();
    }

    @Override
    public @NotNull String getType() {
        return fields.getType();
    }

    @Override
    public @NotNull Integer getTtl() {
        return fields.getTtl();
    }

    @Override
    public @NotNull Map<String, Object> getTags() {
        return fields.getTags();
    }
}
