package com.binar.challenge4.config;


import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

public class OpenApiConfiguration {

    @Bean
    public OpenAPI openAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Cinema RESTful API")
                        .description("OpenAPI for Cinema RESTful API")
                        .version("1.0.1")
                        .contact(
                                new Contact()
                                        .name("Nico")
                                        .email("nicoramli@@gmail.com")
                                        .url("github.com/ZukazeZ")
                        )
                        .license(new License().name("Apache 2.0").url("http://springdoc.org")))
                .externalDocs(new ExternalDocumentation()
                        .description("github Cinema RESTful API")
                        .url("github.com/ZukazeZ/"))
                .servers(serverWeb())

                ;
    }

    private List<Server> serverWeb() {
        List<Server> ServerWeb = new ArrayList<>();

        Server serverDevMain = new Server();
        serverDevMain.setUrl("http://localhost:8080/");
        serverDevMain.setDescription("Main server for Developing");

        Server serverDevBackup = new Server();
        serverDevBackup.setUrl("https://dev.ZDev.com/api");
        serverDevBackup.setDescription("Backup server for Developing");

        Server serverQA = new Server();
        serverQA.setUrl("https://qa.ZQA.com/api");
        serverQA.setDescription("Server for QA");

        Server serverProduction = new Server();
        serverProduction.setUrl("https://ZProd.com/api");
        serverProduction.setDescription("Server for the production");

        ServerWeb.add(serverDevMain);
        ServerWeb.add(serverDevBackup);
        ServerWeb.add(serverProduction);
        ServerWeb.add(serverQA);
        return ServerWeb;
    }
}
