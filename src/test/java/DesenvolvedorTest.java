import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DesenvolvedorTest {

    @Test
    void deveRetornarDesenvolvedor()
    {
        Desenvolvedor desenvolvedor = new Desenvolvedor
                ("Giovane Aguiar",
                        "123.456.789-10",
                        "Desenvolvedor",
                        1800
                );
        assertEquals("Giovane Aguiar", desenvolvedor.getNome());
    }
    @Test
    void deveRetornarDesenvolvedorSemNome(){
        try {
            Desenvolvedor desenvolvedor = new Desenvolvedor
                    (null,
                            "123.456.789-10",
                            "Desenvolvedor",
                            1000
                    );
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Nome nulo!", e.getMessage());
        }
    }

    @Test
    void deveRetornarDesenvolvedorSemCpf(){
        try {
            Desenvolvedor desenvolvedor = new Desenvolvedor
                    ("Giovane Aguiar",
                            null,
                            "Desenvolvedor",
                            1000
                    );
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("CPF nulo!", e.getMessage());
        }
    }

    @Test
    void deveRetornarDesenvolvedorSemCargo(){
        try {
            Desenvolvedor desenvolvedor = new Desenvolvedor
                    ("Giovane Aguiar",
                            "123.456.789-10",
                            null,
                            1000
                    );
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Cargo nulo!", e.getMessage());
        }
    }

    @Test
    void deveRetornarDesenvolvedorSemSalario(){
        try {
            Desenvolvedor desenvolvedor = new Desenvolvedor
                    ("Giovane Aguiar",
                            "123.456.789-10",
                            "Desenvolvedor",
                            0
                    );
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Salário nulo!", e.getMessage());
        }
    }

    @Test
    void deveRetornarDesenvolvedorSubindoDeNivel()
    {
        {
            Desenvolvedor desenvolvedor = new Desenvolvedor
                    ("Giovane Aguiar",
                            "123.456.789-10",
                            "Desenvolvedor",
                            1000
                    );
            desenvolvedor.recebeAumento(1000);
            assertEquals(3500, desenvolvedor.sobeDeNivel());
        }

    }

    @Test
    void deveRetornarDesenvolvedorRecebendoAumentoNegativo()
    {
        try {
            Desenvolvedor desenvolvedor = new Desenvolvedor
                    ("Giovane Aguiar",
                            "123.456.789-10",
                            "Desenvolvedor",
                            1000
                    );
            desenvolvedor.recebeAumento(-100);
            fail();
        }
        catch (IllegalArgumentException e) {

            assertEquals("O aumento deve ser positivo!", e.getMessage());
        }
    }

    @Test
    void deveRetornarBonificacaoDeUmDesenvolvedor()
    {
        Desenvolvedor desenvolvedor = new Desenvolvedor
                ("Giovane Aguiar",
                        "123.456.789-10",
                        "Desenvolvedor",
                        1000
                );
        ControladorDeBonificacoes controladorDeBonificacoes = new ControladorDeBonificacoes();

        assertEquals(500, controladorDeBonificacoes.adicionaBonificacaoDe(desenvolvedor));
    }

}