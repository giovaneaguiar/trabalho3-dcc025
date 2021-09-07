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

        assertTrue(diretor.funcionarioPodeAutenticar("1234"));
        // Aqui utilizei o assertTrue.
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
        // Aqui utilizei o assertEquals.
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
            fail();
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
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Ops. Senha incorreta!", e.getMessage());
        }
    }
}