package com.example.eureka_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Servidor de descubrimiento de servicios Eureka.
 * Este servidor permite que los microservicios se registren y se descubran entre sí.
 * 
 * Funcionalidades:
 * - Registro automático de microservicios
 * - Health checks periódicos
 * - Balanceo de carga mediante service discovery
 * - Dashboard de monitoreo en http://localhost:8761
 */
@SpringBootApplication
@EnableEurekaServer  // Habilita este proyecto como servidor Eureka
public class EurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class, args);
    }
}