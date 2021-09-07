import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaPoupancaTest {

    @Test
    void deveRetornarContaPoupanca() {
        ContaPoupanca contaPoupanca = new ContaPoupanca(
                new Titular("Giovane Aguiar", "123.456.789-10",
                        new Endereco("Volta Redonda", "Bairro", "10", "20")),
                3000,
                1

        );
        assertEquals("Giovane Aguiar", contaPoupanca.getTitular().getNome());
    }

    @Test
    void deveRetornarContaPoupancaSemTitular() {
        try {
            ContaPoupanca contaPoupanca = new ContaPoupanca(
                    null,
                    3000,
                    1
            );

        } catch (IllegalArgumentException e) {
            assertEquals("Conta sem titular!", e.getMessage());

        }
    }

    @Test
    void deveRetornarContaPoupancaSemSaldo() {

        try {
            ContaPoupanca contaPoupanca = new ContaPoupanca(
                    new Titular("Giovane Aguiar", "123.456.789-10",
                            new Endereco("Volta Redonda", "Bairro", "10", "20")),
                    0,
                    1
            );

        } catch (NullPointerException e) {
            assertEquals("Conta sem saldo!", e.getMessage());
        }
    }

    @Test
    void deveRetornarContaPoupancaSemNumeroDeContas() {
        try {
            ContaPoupanca contaPoupanca = new ContaPoupanca(
                    new Titular("Giovane Aguiar", "123.456.789-10",
                            new Endereco("Volta Redonda", "Bairro", "10", "20")),
                    4000,
                    0
            );
        } catch (NullPointerException e) {
            assertEquals("Sem contas cadastradas!", e.getMessage());
        }
    }

    @Test
    void deveRetornarSaqueContaPoupanca() {
        ContaPoupanca contaPoupanca = new ContaPoupanca(
                new Titular("Giovane Aguiar", "123.456.789-10",
                        new Endereco("Volta Redonda", "Bairro", "10", "20")),
                3000,
                1
        );
        assertEquals(1970, contaPoupanca.saca(1000));

    }

    @Test
    void deveRetornarContaPoupancaSaqueIndisponivel() {
        try {
            ContaPoupanca contaPoupanca = new ContaPoupanca(
                    new Titular("Giovane Aguiar", "123.456.789-10",
                            new Endereco("Volta Redonda", "Bairro", "10", "20")),
                    3000,
                    1
            );
            contaPoupanca.saca(4000);
        } catch (NullPointerException e) {
            assertEquals("Saque indisponível!", e.getMessage());
        }

    }

    @Test
    void deveRetornarDepositoContaPoupanca() {
        ContaPoupanca contaPoupanca = new ContaPoupanca(
                new Titular("Giovane Aguiar", "123.456.789-10",
                        new Endereco("Volta Redonda", "Bairro", "10", "20")),
                3000,
                1
        );
        assertEquals(4000, contaPoupanca.deposita(1000));

    }

    @Test
    void deveRetornarContaPoupancaDepositoNegativo() {
        try {
            ContaPoupanca contaPoupanca = new ContaPoupanca(
                    new Titular("Giovane Aguiar", "123.456.789-10",
                            new Endereco("Volta Redonda", "Bairro", "10", "20")),
                    3000,
                    1
            );
            contaPoupanca.deposita(-4000);
        } catch (NullPointerException e) {
            assertEquals("O valor a depositar precisa ser positivo!", e.getMessage());
        }
    }

}

