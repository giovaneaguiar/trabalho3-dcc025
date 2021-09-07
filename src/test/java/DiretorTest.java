import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiretorTest {

    @Test
    void deveRetornarDiretor()
    {
        Diretor diretor = new Diretor
                ("Giovane Aguiar",
                        "123.456.789-10",
                        "Diretor",
                        10000
                );
        assertEquals("Giovane Aguiar", diretor.getNome());
    }

    @Test
    void deveRetornarDiretorSemNome(){
        try {
            Diretor diretor = new Diretor
                    (null,
                            "123.456.789-10",
                            "Diretor",
                            10000
                    );
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Nome nulo!", e.getMessage());
        }

    }
    @Test
    void deveRetornarDiretorSemCpf(){
        try {
            Diretor diretor = new Diretor
                    ("Giovane Aguiar",
                            null,
                            "Diretor",
                            10000
                    );
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("CPF nulo!", e.getMessage());
        }

    }
    @Test
    void deveRetornarDiretorSemCargo(){
        try {
            Diretor diretor = new Diretor
                    ("Giovane Aguiar",
                            "123.456.789-10",
                            null,
                            10000
                    );
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Cargo nulo!", e.getMessage());
        }

    }
    @Test
    void deveRetornarDiretorSemSalario(){
        try {
            Diretor diretor = new Diretor
                    ("Giovane Aguiar",
                            "123.456.789-10",
                            "Diretor",
                            0
                    );
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Salário nulo!", e.getMessage());
        }

    }

    @Test
    void deveRetornarBonificacaoDeUmDiretor() {
        Diretor diretor = new Diretor
                ("Giovane",
                        "123.456.789.10",
                        "Diretor",
                        10000
                );
        ControladorDeBonificacoes controladorDeBonificacoes = new ControladorDeBonificacoes();

        assertEquals(20000, controladorDeBonificacoes.adicionaBonificacaoDe(diretor));

    }

}
