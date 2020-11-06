package io.pragra.learning.spellearning.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

public class ProdConfig {

    @Bean(name = "page")
    public String pageName(){
        return "prod";
    }
}
