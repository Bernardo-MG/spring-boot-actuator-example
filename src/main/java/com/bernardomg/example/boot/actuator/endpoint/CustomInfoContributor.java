
package com.bernardomg.example.boot.actuator.endpoint;

import java.util.Collections;

import org.springframework.boot.actuate.info.Info.Builder;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;

@Component("customInfo")
public final class CustomInfoContributor implements InfoContributor {

    public CustomInfoContributor() {
        super();
    }

    @Override
    public void contribute(final Builder builder) {
        builder.withDetail("customInfo",
                Collections.singletonMap("key", "value"));
    }

}
