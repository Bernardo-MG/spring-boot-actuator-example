
package com.bernardomg.example.boot.actuator.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
public class PersistenceConfig {

    public PersistenceConfig() {
        super();
    }

}
