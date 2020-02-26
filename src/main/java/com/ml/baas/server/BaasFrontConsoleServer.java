package com.ml.baas.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author mengl
 */
@SpringBootApplication(scanBasePackages = "com.ml")
public class BaasFrontConsoleServer {
    public static void main(String[] args) {
        SpringApplication.run(BaasFrontConsoleServer.class, args);
    }
}
