import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaCorrenteTest {

    @Test
    void deveRetornarContaCorrente()
    {
        ContaCorrente contaCorrente = new ContaCorrente(
                new Titular("Giovane Aguiar", "123.456.789-10",
                        new Endereco("Volta Redonda", "Bairro", "10", "20")),
                3000,
                1

        );
        assertEquals("Giovane Aguiar", contaCorrente.getTitular().getNome());
    }

    @Test
    void deveRetornarContaCorrenteSemTitular(){
        try {
            ContaCorrente contaCorrente = new ContaCorrente(
                     null,
                    3000,
                    1
            );

        } catch (IllegalArgumentException e) {
            assertEquals("Conta sem titular!", e.getMessage());

        }
    }

    @Test
    void deveRetornarContaCorrenteSemSaldo(){

        try {
            ContaCorrente contaCorrente = new ContaCorrente(
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
    void deveRetornarContaCorrenteSemNumeroDeContas(){
        try {
            ContaCorrente contaCorrente = new ContaCorrente(
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
    void deveRetornarSaqueContaCorrente()
    {
        ContaCorrente contaCorrente = new ContaCorrente(
                new Titular("Giovane Aguiar", "123.456.789-10",
                        new Endereco("Volta Redonda", "Bairro", "10", "20")),
                3000,
                1
        );
        assertEquals (1950, contaCorrente.saca(1000));

    }

    @Test
    void deveRetornarContaCorrenteSaqueIndisponivel()
    {
        try {
            ContaCorrente contaCorrente = new ContaCorrente(
                    new Titular("Giovane Aguiar", "123.456.789-10",
                            new Endereco("Volta Redonda", "Bairro", "10", "20")),
                    3000,
                    1
            );
            contaCorrente.saca(4000);
        }
         catch (NullPointerException e){
            assertEquals("Saque indisponível!", e.getMessage());
         }

    }

    @Test
    void deveRetornarDepositoContaCorrente()
    {
        ContaCorrente contaCorrente = new ContaCorrente(
                new Titular("Giovane Aguiar", "123.456.789-10",
                        new Endereco("Volta Redonda", "Bairro", "10", "20")),
                3000,
                1
        );
        assertEquals (4000, contaCorrente.deposita(1000));

    }

    @Test
    void deveRetornarContaCorrenteDepositoNegativo()
    {
        try {
            ContaCorrente contaCorrente = new ContaCorrente(
                    new Titular("Giovane Aguiar", "123.456.789-10",
                            new Endereco("Volta Redonda", "Bairro", "10", "20")),
                    3000,
                    1
            );
            contaCorrente.deposita(-4000);
        }
        catch (NullPointerException e){
            assertEquals("O valor a depositar precisa ser positivo!", e.getMessage());
        }
    }

    @Test
    void deveTransferirEntreContasCorrente()
    {
        ContaCorrente contaCorrente1 = new ContaCorrente(
                new Titular("Giovane Aguiar", "123.456.789-10",
                        new Endereco("Volta Redonda", "Bairro", "10", "20")),
                3000,
                1
        );
        ContaCorrente contaCorrente2 = new ContaCorrente(
                new Titular("Luciana", "123.456.789-11",
                        new Endereco("Volta Redonda", "Bairro2", "14", "90")),
                3000,
                1
        );
        contaCorrente1.transfere(500, contaCorrente2);

        assertEquals(2475, contaCorrente1.getSaldo());
    }

    @Test

    void deveRetornarSaldoIndisponivelParaTransferenciaEntreContasCorrente()
    {
        try {
            ContaCorrente contaCorrente1 = new ContaCorrente(
                    new Titular("Giovane Aguiar", "123.456.789-10",
                            new Endereco("Volta Redonda", "Bairro", "10", "20")),
                    -300,
                    1
            );
            ContaCorrente contaCorrente2 = new ContaCorrente(
                    new Titular("Luciana", "123.456.789-11",
                            new Endereco("Volta Redonda", "Bairro2", "14", "90")),
                    3000,
                    1
            );
        }

        catch (IllegalArgumentException e) {
            assertEquals("Falha na transferência: Saldo indisponível!", e.getMessage());
        }

    }



}