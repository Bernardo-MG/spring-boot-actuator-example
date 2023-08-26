
package com.bernardomg.example.boot.actuator.config;

import org.springframework.boot.actuate.audit.AuditEventRepository;
import org.springframework.boot.actuate.audit.InMemoryAuditEventRepository;
import org.springframework.boot.actuate.web.exchanges.InMemoryHttpExchangeRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {

    public ServiceConfig() {
        super();
    }

    @Bean("traceRepository ")
    public InMemoryHttpExchangeRepository createTraceRepository() {
        return new InMemoryHttpExchangeRepository();
    }

    @Bean("auditEventRepository")
    public AuditEventRepository getAuditEventRepository() {
        return new InMemoryAuditEventRepository();
    }

}
