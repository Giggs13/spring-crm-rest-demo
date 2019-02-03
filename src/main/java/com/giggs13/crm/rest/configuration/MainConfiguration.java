package com.giggs13.crm.rest.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({
        PersistenceConfiguration.class,
        SpringMvcConfiguration.class
})
public class MainConfiguration {

}
