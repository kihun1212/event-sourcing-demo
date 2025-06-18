package example.core;

import java.util.Map;

public interface DomainEvent {

    String getId();

    String getType();

    Integer getTtl();

    Map<String, Object> getTags();
}
