package example.order.adapter;

import example.order.adapter.in.rest.v1.CreateOrderRestAdapter;
import example.order.adapter.out.jdbc.OrderJdbcAdapter;
import example.order.adapter.out.jdbc.OrderJdbcRepository;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.Import;

@Import(value = {
        CreateOrderRestAdapter.class,
        OrderJdbcAdapter.class,
        OrderJdbcRepository.class
})
@AutoConfiguration
public class AdapterAutoConfiguration {
}
