package com.example.ApiSocialRateV3.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI configuracaoOpenApi(){
        return new OpenAPI()
                .info(new Info()
                        .title("Social Rate API")
                        .version("0.03")
                        .description("API do software Social Rate")
                        .contact(new Contact().email("nextGen@gmail.com")
                                .name("Ricardo, Thabata, Yago, Mateus, Michael")
                                .url("https:socialRate.com"))
                        .license(new License()
                                .name("Apache 2.0")
                                .url("url da licença")));
    }
}
