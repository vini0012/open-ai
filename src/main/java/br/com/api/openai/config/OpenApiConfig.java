package br.com.api.openai.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("API Chat GPT")
                        .description("API para gerar poemas, contos, sinopses de filmes e histórias de ficção científica fazendo uso de OpenAI. " +
                                "Desenvolvido por: Rodrigo Pimenta, Matheus Peluca, Marcos Vinícius, Reinaldo Machado, Emerson Rocha e Hygor Souza.")
                        .license(new License()
                                .name("Repositório Privado do Projeto no GitHub")
                                .url("https://github.com/rodrigospimentacwb/apiopenapi"))
                        .version("1.0.0"));
    }
}
