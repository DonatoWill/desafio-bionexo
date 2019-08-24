package br.com.desafiobionexo.bionexo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
        @Bean
        public Docket api() {
            return new Docket(DocumentationType.SWAGGER_2)
                    .select()
                    .apis(RequestHandlerSelectors.basePackage("br.com.desafiobionexo.bionexo.resources"))
                    .paths(PathSelectors.any())
                    .build()
                    .apiInfo(this.apiInfo());
        }

        private ApiInfo apiInfo() {
            return new ApiInfo(
                    "Teste/Desafio Bionexo",
                    "API para consulta de Unidades Básicas de Saúde mais próximas à localização atual.",
                    "0.0.1",
                    "Terms of service",
                    new Contact("Donato William Gomes Aguiar", "", "donato_will@hotmail.com"),
                    "Apache License Version 2.0", "https://www.apache.org/licenses/LICENSE-2.0", Collections.emptyList());
        }
}
