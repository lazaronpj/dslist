// Define o pacote de testes (mesmo pacote da classe principal)
package com.devsuperior.dslist;

// Importa classes necessárias para testes
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Classe de testes básicos da aplicação.
 * A anotação @SpringBootTest carrega todo o contexto da aplicação para testes de integração.
 * Isso inclui configurações, beans, controladores, serviços, etc.
 */
@SpringBootTest
class DslistApplicationTests {

    /**
     * Teste básico que verifica se o contexto da aplicação é carregado corretamente.
     * Se este teste falhar, significa que há problemas na configuração básica da aplicação.
     */
    @Test
    void contextLoads() {
        // O teste passa se o contexto Spring for carregado sem erros
    }
}