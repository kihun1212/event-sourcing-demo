package example.core;

import lombok.Getter;

import java.util.Map;

public class DomainEventFields {

    @Getter
    String id;

    @Getter
    String type;

    @Getter
    Integer ttl;

    @Getter
    Map<String, Object> tags;
}
