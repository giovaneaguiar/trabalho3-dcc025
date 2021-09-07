import org.junit.jupiter.api.Test;

import javax.imageio.IIOException;

import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {

    @Test
    void deveRetornarPessoa()
    {
        Pessoa pessoa = new Pessoa(
                "Giovane",
                "123.456.789.10"
        );
        assertEquals("Giovane", pessoa.getNome());
    }

    @Test
    void deveRetornarPessoaComNomeNulo(){
        try {
            Pessoa pessoa = new Pessoa(
                    null,
                    "123.456.789.10"
            );
        } catch (IllegalArgumentException e) {
            assertEquals("Nome nulo!", e.getMessage());
        }
    }
    @Test
    void deveRetornarPessoaComNomePequeno(){
        try {
            Pessoa pessoa = new Pessoa(
                    "Gi",
                    "123.456.789.10"
            );
        } catch (IllegalArgumentException e) {
            assertEquals("O nome precisa ter pelo menos 3 caracteres", e.getMessage());
        }
    }

    @Test
    void deveRetornarPessoaComCpfNulo(){
        try {
            Pessoa pessoa = new Pessoa(
                    "Giovane",
                    null
            );
        } catch (IllegalArgumentException e) {
            assertEquals("CPF nulo!", e.getMessage());
        }
    }

}