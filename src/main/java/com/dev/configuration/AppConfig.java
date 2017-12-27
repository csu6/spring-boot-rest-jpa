package com.dev.configuration;

import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@ImportResource({
        "classpath:/app-config-ou-beans.xml"
})
@ComponentScan( basePackages = "com.dev")
@PropertySource({
        "classpath:application.properties"
})
public class AppConfig {

    @Bean
    public static PropertySourcesPlaceholderConfigurer
    properties() {

        return new PropertySourcesPlaceholderConfigurer();
    }
}
