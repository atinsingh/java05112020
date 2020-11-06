package io.pragra.learning.spellearning.conf;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:app.properties")
public class DevConfig {
    @Value("#{ mood.getMood() > 50 ? 'prod': 'index'}")
    private String page;

    @Value("${student.name:DIJESH}")
    public String name;

    @Bean
    public String page(){
        System.out.println(name.toUpperCase());
        return page;
    }
}
