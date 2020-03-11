package com.ml.baas.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author mengl
 */
@SpringBootApplication(scanBasePackages = "com.ml")
@EnableSwagger2
public class BaasFrontConsoleServer {
    public static void main(String[] args) {
        SpringApplication.run(BaasFrontConsoleServer.class, args);
    }
}
