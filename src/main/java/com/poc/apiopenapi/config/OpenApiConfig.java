package com.poc.apiopenapi.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("API Chat GPT")
                        .description("API para gerar poemas, contos, sinopses de filme e histórias de ficção científica. Desenvolvido por: Pimenta, Peluca, Vini, Reinaldo, Emerson e Hygor")
                        .license(new License()
                                .name("Repositório Privado do Projeto no GitHub")
                                .url("google.com"))
                        .version("v1"));
    }
}
