
package com.bernardomg.example.boot.actuator.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.bernardomg.example.boot.actuator.endpoint.CustomEndpoint;

@Configuration
public class ActuatorConfig {

    public ActuatorConfig() {
        super();
    }

    @Bean
    public CustomEndpoint customEndpoint() {
        return new CustomEndpoint();
    }

}
