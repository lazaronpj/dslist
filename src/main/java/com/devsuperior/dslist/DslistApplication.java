// Define o pacote base da aplicação
package com.devsuperior.dslist;

// Importa classes necessárias do Spring Boot
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Classe principal que inicia a aplicação Spring Boot.
 * A anotação @SpringBootApplication combina três anotações essenciais:
 * 1. @Configuration - Marca a classe como fonte de definições de beans
 * 2. @EnableAutoConfiguration - Habilita a configuração automática do Spring Boot
 * 3. @ComponentScan - Habilita a varredura de componentes no pacote atual e subpacotes
 */
@SpringBootApplication
public class DslistApplication {

    /**
     * Método principal que inicia a aplicação Spring Boot.
     * @param args Argumentos de linha de comando que podem ser passados para a aplicação
     */
    public static void main(String[] args) {
        // Inicia a aplicação Spring Boot
        SpringApplication.run(DslistApplication.class, args);
    }
}