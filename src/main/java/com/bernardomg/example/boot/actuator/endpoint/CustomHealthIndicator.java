
package com.bernardomg.example.boot.actuator.endpoint;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component("customHealth")
public final class CustomHealthIndicator implements HealthIndicator {

    public CustomHealthIndicator() {
        super();
    }

    @Override
    public final Health health() {
        return Health.up().withDetail("someDetail", "ok").build();
    }

}
