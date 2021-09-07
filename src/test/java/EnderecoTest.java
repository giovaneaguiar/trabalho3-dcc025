import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EnderecoTest {

    @Test
    void deveRetornarCidadeDeUmEndereco() {
        Endereco endereco = new Endereco(
                "Juiz de Fora",
                "Centro",
                "Braz Bernardino",
                "106"
        );

        assertEquals("Juiz de Fora", endereco.getCidade());
    }

    @Test
    void deveRetornarBairroNulo() {

        try {
            Endereco endereco = new Endereco(
                    "Juiz de Fora",
                    null,
                    "Braz Bernardino",
                    "106"
            );
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Bairro nulo!", e.getMessage());
        }
    }

    @Test
    void deveRetornarRuaNula() {

        try {
            Endereco endereco = new Endereco(
                    "Juiz de Fora",
                    "Centro",
                    null,
                    "106"
            );
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Rua nula!", e.getMessage());
        }
    }

    @Test
    void deveRetornarNumeroNulo() {

        try {
            Endereco endereco = new Endereco(
                    "Juiz de Fora",
                    "Centro",
                    "Braz Bernardino",
                    null
            );
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Número nulo!", e.getMessage());
        }
    }

}