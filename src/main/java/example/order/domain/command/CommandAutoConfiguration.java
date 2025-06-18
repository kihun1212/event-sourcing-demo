package example.order.domain.command;

import example.order.port.OrderRepositoryPort;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.Bean;

@AutoConfiguration
public class CommandAutoConfiguration {

    @Bean
    public CreateOrderCommandHandler createOrderCommandHandler(OrderRepositoryPort orderRepositoryPort) {
        return new CreateOrderCommandHandler(orderRepositoryPort);
    }
}
