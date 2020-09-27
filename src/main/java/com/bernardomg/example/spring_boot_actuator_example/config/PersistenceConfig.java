
package com.bernardomg.example.spring_boot_actuator_example.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
public class PersistenceConfig {

    public PersistenceConfig() {
        super();
    }

}
