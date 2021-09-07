import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GerenteTest {

    @Test
    void deveRetornarGerente() {
        Gerente gerente = new Gerente
                ("Giovane",
                        "123.456.789.10",
                        "Gerente",
                        5000
                );
        assertEquals("Giovane", gerente.getNome());
    }
    @Test
    void deveRetornarGerenteSemNome(){
        try {
            Gerente gerente = new Gerente
                    (null,
                            "123.456.789.10",
                            "Gerente",
                            5000
                    );
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Nome nulo!", e.getMessage());
        }
    }
    @Test
    void deveRetornarGerenteSemCpf(){
        try {
            Gerente gerente = new Gerente
                    ("Giovane",
                            null,
                            "Gerente",
                            5000
                    );
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("CPF nulo!", e.getMessage());
        }
    }

    @Test
    void deveRetornarGerenteSemCargo(){
        try {
            Gerente gerente = new Gerente
                    ("Giovane",
                            "123.456.789.10",
                            null,
                            5000
                    );
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Cargo nulo!", e.getMessage());
        }
    }
    @Test
    void deveRetornarGerenteSemSalario(){
        try {
            Gerente gerente = new Gerente
                    ("Giovane",
                            "123.456.789.10",
                            "Gerente",
                            0
                    );
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Salário nulo!", e.getMessage());
        }
    }

    @Test
    void deveRetornarBonificacaoDeUmGerente() {
        Gerente gerente = new Gerente
                ("Giovane",
                        "123.456.789.10",
                        "Gerente",
                        5000
                );
        ControladorDeBonificacoes controladorDeBonificacoes = new ControladorDeBonificacoes();

        assertEquals(6000, controladorDeBonificacoes.adicionaBonificacaoDe(gerente));

    }

}