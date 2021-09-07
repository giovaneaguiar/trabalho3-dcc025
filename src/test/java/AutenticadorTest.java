import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AutenticadorTest {

    @Test
    void deveRetornarDiretorSenhaCorreta(){
        Autenticador autenticador = new Autenticador();
        Diretor diretor = new Diretor(
                "Giovane",
                "123.456.789-10",
                "Diretor", 3000);
        autenticador.tentaLogin(diretor, "1234");

        assertEquals(true, diretor.funcionarioPodeAutenticar("1234"));
    }

    @Test
    void deveRetornarGerenteSenhaCorreta(){
        Autenticador autenticador = new Autenticador();
        Gerente gerente = new Gerente(
                "Giovane",
                "123.456.789-10",
                "Gerente", 3000);
        autenticador.tentaLogin(gerente, "4321");

        assertEquals(true, gerente.funcionarioPodeAutenticar("4321"));
    }

    @Test
    void deveRetornarDiretorSenhaIncorreta() {
        try {
            Autenticador autenticador = new Autenticador();
            Diretor diretor = new Diretor(
                    "Giovane",
                    "123.456.789-10",
                    "Diretor", 3000);
            autenticador.tentaLogin(diretor, "0000");
        }
        catch (IllegalArgumentException e) {
            assertEquals("Ops. Senha incorreta!", e.getMessage());
        }
    }

    @Test
    void deveRetornarGerenteSenhaIncorreta() {
        try {
            Autenticador autenticador = new Autenticador();
            Gerente gerente = new Gerente(
                    "Giovane",
                    "123.456.789-10",
                    "Gerente", 3000);
            autenticador.tentaLogin(gerente, "0000");
        }
        catch (IllegalArgumentException e) {
            assertEquals("Ops. Senha incorreta!", e.getMessage());
        }
    }
}