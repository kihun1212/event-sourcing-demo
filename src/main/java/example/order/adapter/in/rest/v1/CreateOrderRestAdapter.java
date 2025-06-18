package example.order.adapter.in.rest.v1;

import example.order.domain.command.CreateOrderCommand;
import example.order.port.CreateOrderCommandPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class CreateOrderRestAdapter {

    private final CreateOrderCommandPort createOrderCommandPort;

    public CreateOrderRestAdapter(
            CreateOrderCommandPort createOrderCommandPort) {

        this.createOrderCommandPort = createOrderCommandPort;
    }

    @PostMapping("/v1/orders/{orderId}")
    public ResponseEntity<CreateOrderResponse> createOrder(
            @PathVariable("orderId") String orderId,
            @RequestBody CreateOrderRequest request) {

        var response = handleCreateOrder(orderId, request);
        return new ResponseEntity<>(response, HttpStatus.ACCEPTED);
    }

    private CreateOrderResponse handleCreateOrder(
            String orderId,
            CreateOrderRequest request) {

        var userId = request.userId();
        var command = new CreateOrderCommand(orderId, userId);
        createOrderCommandPort.createOrder(command);
        return new CreateOrderResponse(orderId);
    }
}
